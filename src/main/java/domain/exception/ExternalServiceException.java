package domain.exception;

public class ExternalServiceException extends RuntimeException {
    private final String serviceName;
    private final String errorCode;
    private final String requestId;

    public ExternalServiceException(String serviceName, String errorCode, String requestId, String message) {
        super(String.format("Error en servicio externo %s. Código: %s, Request ID: %s. Mensaje: %s",
                serviceName, errorCode, requestId, message));
        this.serviceName = serviceName;
        this.errorCode = errorCode;
        this.requestId = requestId;
    }

    public ExternalServiceException(String serviceName, String errorCode, String requestId, String message, Throwable cause) {
        super(String.format("Error en servicio externo %s. Código: %s, Request ID: %s. Mensaje: %s",
                serviceName, errorCode, requestId, message), cause);
        this.serviceName = serviceName;
        this.errorCode = errorCode;
        this.requestId = requestId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getDebugInfo() {
        return String.format("""
                Debug Info - External Service Error:
                Service: %s
                Error Code: %s
                Request ID: %s
                Timestamp: %s
                Message: %s
                Cause: %s""",
                serviceName,
                errorCode,
                requestId,
                java.time.LocalDateTime.now(),
                getMessage(),
                getCause() != null ? getCause().getMessage() : "N/A");
    }
}