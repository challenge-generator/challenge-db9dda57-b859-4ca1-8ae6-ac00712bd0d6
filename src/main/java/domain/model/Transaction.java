package domain.model;

import domain.exception.InsufficientBalanceException;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final UUID id;
    private final UUID accountId;

    @NotNull(message = "El monto no puede ser nulo")
    @DecimalMin(value = "0.01", message = "El monto debe ser mayor que cero")
    private final BigDecimal amount;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 200, message = "La descripción no puede exceder 200 caracteres")
    private final String description;

    @NotNull(message = "El tipo de transacción no puede ser nulo")
    private final TransactionType type;

    @NotNull(message = "La fecha de transacción no puede ser nula")
    private final LocalDateTime transactionDate;

    @NotNull(message = "El estado de la transacción no puede ser nulo")
    private TransactionStatus status;

    public enum TransactionType {
        DEPOSIT, WITHDRAWAL, TRANSFER
    }

    public enum TransactionStatus {
        PENDING, COMPLETED, FAILED, REVERSED
    }

    public Transaction(UUID id, UUID accountId, BigDecimal amount, String description,
                      TransactionType type, LocalDateTime transactionDate) {
        this.id = id != null ? id : UUID.randomUUID();
        this.accountId = accountId;
        this.amount = amount;
        this.description = description;
        this.type = type;
        this.transactionDate = transactionDate != null ? transactionDate : LocalDateTime.now();
        this.status = TransactionStatus.PENDING;

        validate();
    }

    private void validate() {
        if (accountId == null) {
            throw new IllegalArgumentException("El ID de cuenta no puede ser nulo");
        }
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo");
        }
        if (type == null) {
            throw new IllegalArgumentException("El tipo de transacción no puede ser nulo");
        }
    }

    public void validateSufficientBalance(BigDecimal currentBalance) {
        if (type == TransactionType.WITHDRAWAL || type == TransactionType.TRANSFER) {
            if (currentBalance.compareTo(amount) < 0) {
                throw new InsufficientBalanceException(currentBalance, amount);
            }
        }
    }

    public void complete() {
        if (status != TransactionStatus.PENDING) {
            throw new IllegalStateException("Solo transacciones pendientes pueden completarse");
        }
        this.status = TransactionStatus.COMPLETED;
    }

    public void fail() {
        this.status = TransactionStatus.FAILED;
    }

    public void reverse() {
        if (status != TransactionStatus.COMPLETED) {
            throw new IllegalStateException("Solo transacciones completadas pueden revertirse");
        }
        this.status = TransactionStatus.REVERSED;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public UUID getAccountId() {
        return accountId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public String getDebugInfo() {
        return String.format("""
                Transaction Debug Info:
                ID: %s
                Account ID: %s
                Amount: %s
                Description: %s
                Type: %s
                Date: %s
                Status: %s""",
                id, accountId, amount, description, type, transactionDate, status);
    }
}