// TODO(reto): archivo stubbeado; implementa los cuerpos.
package infrastructure.exception;

import domain.exception.DuplicateTransactionException;
import domain.exception.ExternalServiceException;
import domain.exception.InsufficientBalanceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(InsufficientBalanceException.class)
    public ResponseEntity<ErrorResponse> handleInsufficientBalance(InsufficientBalanceException ex) {
        logger.error("Excepción de saldo insuficiente: {}", ex.getMessage());
        
        // TODO(reto): Implementar manejo de InsufficientBalanceException
        // 1. Construir respuesta de error con código 400 (Bad Request)
        // 2. Incluir información del saldo actual y requerido
        // 3. Agregar información de depuración si aplica
        // 4. Retornar ResponseEntity con ErrorResponse
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    @ExceptionHandler(DuplicateTransactionException.class)
    public ResponseEntity<ErrorResponse> handleDuplicateTransaction(DuplicateTransactionException ex) {
        logger.warn("Transacción duplicada detectada: {}", ex.getMessage());
        
        // TODO(reto): Implementar manejo de DuplicateTransactionException
        // 1. Construir respuesta de error con código 409 (Conflict)
        // 2. Incluir ID de la transacción original y timestamp
        // 3. Agregar información de depuración con generateDebugInfo()
        // 4. Retornar ResponseEntity con ErrorResponse
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    @ExceptionHandler(ExternalServiceException.class)
    public ResponseEntity<ErrorResponse> handleExternalServiceException(ExternalServiceException ex) {
        logger.error("Error en servicio externo - Servicio: {}, Código: {}, RequestId: {}",
                ex.getServiceName(), ex.getErrorCode(), ex.getRequestId());
        
        // TODO(reto): Implementar manejo de ExternalServiceException
        // 1. Determinar código HTTP apropiado según tipo de error (503, 504, etc.)
        // 2. Incluir información del servicio, código de error y requestId
        // 3. Agregar información de depuración con getDebugInfo()
        // 4. Retornar ResponseEntity con ErrorResponse
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        logger.warn("Error de validación en request: {}", ex.getMessage());
        
        // TODO(reto): Implementar manejo de errores de validación
        // 1. Extraer errores de cada campo fallido
        // 2. Construir mapa de errores con nombre del campo y mensaje
        // 3. Retornar código 400 (Bad Request) con mapa de errores
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleIllegalArgument(IllegalArgumentException ex) {
        logger.warn("Argumento ilegal: {}", ex.getMessage());
        
        // TODO(reto): Implementar manejo de IllegalArgumentException
        // 1. Construir respuesta de error con código 400 (Bad Request)
        // 2. Incluir mensaje descriptivo
        // 3. Retornar ResponseEntity con ErrorResponse
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        logger.error("Error inesperado: ", ex);
        
        // TODO(reto): Implementar manejo genérico de excepciones
        // 1. Construir respuesta de error con código 500 (Internal Server Error)
        // 2. Generar ID de correlación para trazabilidad
        // 3. En entorno de desarrollo, incluir stack trace
        // 4. En entorno de producción, mensaje genérico
        // 5. Retornar ResponseEntity con ErrorResponse
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    public record ErrorResponse(
        UUID errorId,
        LocalDateTime timestamp,
        int status,
        String error,
        String message,
        String path,
        Map<String, Object> details
    ) {
        public static ErrorResponse of(HttpStatus status, String message, String path) {
          throw new UnsupportedOperationException("TODO(reto): of");
        }

        public static ErrorResponse of(HttpStatus status, String message, String path, Map<String, Object> details) {
          throw new UnsupportedOperationException("TODO(reto): of");
        }
    }
}