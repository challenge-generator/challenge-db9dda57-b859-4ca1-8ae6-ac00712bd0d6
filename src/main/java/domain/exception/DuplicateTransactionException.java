package domain.exception;

import java.time.LocalDateTime;
import java.util.UUID;
import domain.model.Transaction;

public class DuplicateTransactionException extends RuntimeException {
    private final UUID transactionId;
    private final LocalDateTime originalTransactionTime;
    private final String originalTransactionDetails;

    public DuplicateTransactionException(UUID transactionId, LocalDateTime originalTransactionTime,
                                        String originalTransactionDetails) {
        super(String.format("Transacción duplicada detectada. ID: %s, Fecha original: %s, Detalles: %s",
                transactionId, originalTransactionTime, originalTransactionDetails));
        this.transactionId = transactionId;
        this.originalTransactionTime = originalTransactionTime;
        this.originalTransactionDetails = originalTransactionDetails;
    }

    public UUID getTransactionId() {
        return transactionId;
    }

    public LocalDateTime getOriginalTransactionTime() {
        return originalTransactionTime;
    }

    public String getOriginalTransactionDetails() {
        return originalTransactionDetails;
    }

    public String generateDebugInfo() {
        return String.format("""
                Debug Info - Duplicate Transaction:
                Transaction ID: %s
                Original Time: %s
                Current Time: %s
                Details: %s
                Stack Trace: %s""",
                transactionId,
                originalTransactionTime,
                LocalDateTime.now(),
                originalTransactionDetails,
                getStackTraceAsString());
    }

    private String getStackTraceAsString() {
        StackTraceElement[] stackTrace = getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement element : stackTrace) {
            sb.append(element.toString()).append("\n");
        }
        return sb.toString();
    }
}