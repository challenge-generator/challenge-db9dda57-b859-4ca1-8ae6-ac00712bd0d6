package application.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public record TransactionRequest(
    @NotNull(message = "El ID de cuenta no puede ser nulo")
    String accountId,

    @NotNull(message = "El monto no puede ser nulo")
    @DecimalMin(value = "0.01", message = "El monto debe ser mayor que cero")
    BigDecimal amount,

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 200, message = "La descripción no puede exceder 200 caracteres")
    String description,

    @NotBlank(message = "El tipo de transacción no puede estar vacío")
    String transactionType
) {
    public TransactionRequest {
        if (accountId != null && !accountId.matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")) {
            throw new IllegalArgumentException("El ID de cuenta debe ser un UUID válido");
        }
    }
}