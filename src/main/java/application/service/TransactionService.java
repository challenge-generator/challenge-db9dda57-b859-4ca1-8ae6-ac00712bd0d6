// TODO(reto): archivo stubbeado; implementa los cuerpos.
package application.service;

import application.dto.TransactionRequest;
import application.dto.TransactionResponse;
import domain.model.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class TransactionService {

    private static final Logger logger = LoggerFactory.getLogger(TransactionService.class);

    public TransactionResponse processTransaction(TransactionRequest request) {
        logger.info("Iniciando procesamiento de transacción para cuenta: {}", request.accountId());
        
        // TODO(reto): Implementar la lógica completa de procesamiento de transacciones
        // 1. Validar que la cuenta existe y está activa
        // 2. Verificar si es una transacción duplicada
        // 3. Verificar saldo suficiente para retiros/transferencias
        // 4. Procesar la transacción con el servicio externo
        // 5. Manejar errores del servicio externo
        // 6. Registrar la transacción y actualizar el saldo
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    public TransactionResponse getTransaction(UUID transactionId) {
        logger.debug("Consultando transacción con ID: {}", transactionId);
        
        // TODO(reto): Implementar la recuperación de una transacción por su ID
        // 1. Buscar la transacción en el repositorio
        // 2. Si no existe, lanzar excepción apropiada
        // 3. Retornar la respuesta mapeada
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    public void validateDuplicateTransaction(UUID accountId, BigDecimal amount, LocalDateTime transactionDate) {
        // TODO(reto): Implementar validación de transacciones duplicadas
        // 1. Consultar transacciones recientes de la cuenta
        // 2. Verificar si existe una transacción con mismos parámetros en ventana de tiempo
        // 3. Si existe, lanzar DuplicateTransactionException con detalles
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    public void validateSufficientBalance(UUID accountId, BigDecimal requiredAmount) {
        // TODO(reto): Implementar validación de saldo suficiente
        // 1. Obtener saldo actual de la cuenta
        // 2. Comparar con el monto requerido
        // 3. Si saldo insuficiente, lanzar InsufficientBalanceException
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    public Transaction callExternalPaymentService(Transaction transaction) {
        // TODO(reto): Implementar llamada al servicio externo de pagos
        // 1. Preparar solicitud para el servicio externo
        // 2. Realizar llamada HTTP al servicio
        // 3. Manejar errores de conectividad y timeouts
        // 4. Si hay error, lanzar ExternalServiceException con código y requestId
        // 5. Retornar transacción actualizada con estado del servicio externo
        
        throw new UnsupportedOperationException("Método no implementado - TODO(reto)");
    }

    private TransactionResponse mapToResponse(Transaction transaction) {
      throw new UnsupportedOperationException("TODO(reto): mapToResponse");
    }
}