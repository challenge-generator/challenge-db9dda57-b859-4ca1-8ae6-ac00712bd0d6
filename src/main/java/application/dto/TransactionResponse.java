package application.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;
import domain.model.Transaction;

public record TransactionResponse(
    UUID transactionId,
    UUID accountId,
    BigDecimal amount,
    String description,
    String transactionType,
    LocalDateTime transactionDate,
    String status,
    String debugInfo
) {
    public static TransactionResponse fromDomain(domain.model.Transaction transaction) {
        return new TransactionResponse(
            transaction.getId(),
            transaction.getAccountId(),
            transaction.getAmount(),
            transaction.getDescription(),
            transaction.getType().name(),
            transaction.getTransactionDate(),
            transaction.getStatus().name(),
            transaction.getDebugInfo()
        );
    }

    public String toDebugString() {
        return String.format("""
                TransactionResponse Debug:
                Transaction ID: %s
                Account ID: %s
                Amount: %s
                Type: %s
                Date: %s
                Status: %s""",
                transactionId, accountId, amount, transactionType, transactionDate, status);
    }
}