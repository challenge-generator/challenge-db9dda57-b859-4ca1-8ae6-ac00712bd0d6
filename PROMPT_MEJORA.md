# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener el proyecto completo y arrancable. Guarda los archivos que te devuelva en la
carpeta del repo, respetando exactamente las rutas.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/main/java/application/service/TransactionService.java` — La fase "Identificación y Categorización de Excepciones" se implementa aqui: este archivo es el ejercicio.
- `src/main/java/infrastructure/exception/GlobalExceptionHandler.java` — La fase "Implementación de Manejo de Excepciones" se implementa aqui: este archivo es el ejercicio.

## Como saber que terminaste

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Advanced L2

### Brecha de conocimiento
Maneja correctamente las excepciones y depura el código para encontrar problemas cuando sea necesario., Maneja correctamente las excepciones y depura el código para encontrar problemas cuando sea necesario.

### Reto
- Tema: Manejo de Excepciones y Depuración Efectiva
- Seniority: advanced-l2
- Tipo: practical
- Título: Mejora de Manejo de Excepciones y Depuración en API de Finanzas
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Identificación y Categorización de Excepciones — objetivo: Clasificar y documentar las excepciones que pueden ocurrir en la API de finanzas. — entregable (NO resolver): Documentación de excepciones categorizadas.
- Fase 2: Implementación de Manejo de Excepciones — objetivo: Implementar un manejo adecuado de las excepciones identificadas en la fase anterior. — entregable (NO resolver): Código con manejo de excepciones implementado y documentado.
- Fase 3: Facilitación de Depuración — objetivo: Mejorar la API para facilitar la depuración en caso de problemas. — entregable (NO resolver): Código con mejoras de depuración implementadas y documentadas.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (entrega de archivos).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Entrega de archivos
Entregá cada archivo con su ruta completa, respetando exactamente la estructura de rutas
indicada por los marcadores: un bloque por archivo, precedido por su ruta. No generes ZIPs
ni archivos adjuntos.
La entrega debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: Entregá los archivos completos al finalizar. No preguntes si el usuario
quiere recibirlos. Simplemente entregalos; No debes desplegar en el chat el resumen de lo que arreglaste, solo entregá los archivos.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del último archivo entregado
No preguntes si el usuario quiere los archivos: simplemente entregalos siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: src/main/java/Application.java ===
package com.pragma;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "com.pragma",
    "domain",
    "application",
    "infrastructure"
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.13</version>
        <relativePath/>
    </parent>

    <groupId>com.example</groupId>
    <artifactId>reto</artifactId>
    <version>1.0.0</version>
    <name>reto</name>

    <properties>
        <java.version>21</java.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
        </dependency>
        <dependency>
            <groupId>io.swagger.core.v3</groupId>
            <artifactId>swagger-annotations</artifactId>
            <version>2.2.55</version>
        </dependency>
        <dependency>
            <groupId>jakarta.validation</groupId>
            <artifactId>jakarta.validation-api</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-logging</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

// === ARCHIVO: src/main/java/domain/exception/InsufficientBalanceException.java ===
package domain.exception;

import java.math.BigDecimal;

public class InsufficientBalanceException extends RuntimeException {
    private final BigDecimal currentBalance;
    private final BigDecimal requiredAmount;

    public InsufficientBalanceException(BigDecimal currentBalance, BigDecimal requiredAmount) {
        super(String.format("Saldo insuficiente. Saldo actual: %s, Monto requerido: %s",
                currentBalance, requiredAmount));
        this.currentBalance = currentBalance;
        this.requiredAmount = requiredAmount;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public BigDecimal getRequiredAmount() {
        return requiredAmount;
    }
}

// === ARCHIVO: src/main/java/domain/exception/DuplicateTransactionException.java ===
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

// === ARCHIVO: src/main/java/domain/exception/ExternalServiceException.java ===
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

// === ARCHIVO: src/main/java/domain/model/Transaction.java ===
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

// === ARCHIVO: src/main/java/application/dto/TransactionRequest.java ===
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

// === ARCHIVO: src/main/java/application/dto/TransactionResponse.java ===
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

// === ARCHIVO: src/main/java/application/service/TransactionService.java ===
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

// === ARCHIVO: src/main/java/infrastructure/exception/GlobalExceptionHandler.java ===
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

// === ARCHIVO: src/main/resources/application.yml ===
spring:
  application:
    name: finance-api
  datasource:
    url: jdbc:h2:mem:financedb
    driver-class-name: org.h2.Driver
    username: sa
    password: 
    hikari:
      maximum-pool-size: 10
      minimum-idle: 5
      connection-timeout: 30000
      idle-timeout: 600000
      max-lifetime: 1800000
  h2:
    console:
      enabled: true
      path: /h2-console
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    hibernate:
      ddl-auto: update
    show-sql: false
    properties:
      hibernate:
        format_sql: true
        use_sql_comments: false
        jdbc:
          batch_size: 20
        order_inserts: true
        order_updates: true
  jackson:
    serialization:
      write-dates-as-timestamps: false
    deserialization:
      fail-on-unknown-properties: false
    default-property-inclusion: non_null

server:
  port: 8080
  error:
    include-message: always
    include-binding-errors: always
    include-stacktrace: on_param
    include-exception: true

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,prometheus
      base-path: /actuator
  endpoint:
    health:
      show-details: always
      show-components: always
  metrics:
    export:
      prometheus:
        enabled: true

logging:
  level:
    root: INFO
    com.example: DEBUG
    org.springframework.web: INFO
    org.springframework.security: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
    file: "%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n"
  file:
    name: logs/finance-api.log
    max-size: 10MB
    max-history: 30

app:
  transaction:
    duplicate-window-minutes: 5
    max-retry-attempts: 3
    retry-delay-ms: 1000
  external-service:
    payment:
      base-url: http://localhost:9090
      timeout-seconds: 30
      connection-timeout-seconds: 10
      read-timeout-seconds: 20
    notification:
      base-url: http://localhost:9091
      timeout-seconds: 10

---
spring:
  config:
    activate:
      on-profile: dev
  datasource:
    url: jdbc:h2:mem:financedb
  jpa:
    show-sql: true
  h2:
    console:
      enabled: true

logging:
  level:
    root: DEBUG
    com.example: TRACE

---
spring:
  config:
    activate:
      on-profile: prod
  datasource:
    url: jdbc:h2:file:./data/financedb
    hikari:
      maximum-pool-size: 20
  jpa:
    hibernate:
      ddl-auto: validate
  h2:
    console:
      enabled: false

logging:
  level:
    root: WARN
    com.example: INFO
  file:
    name: /var/log/finance-api/finance-api.log
    max-size: 50MB
    max-history: 90

// === ARCHIVO: src/main/java/resources/application.yml ===
server:
  port: 8080
  error:
    include-message: always
    include-binding-errors: always
    include-stacktrace: on_param
    include-exception: true

spring:
  application:
    name: finances-api
  datasource:
    url: jdbc:h2:mem:financesdb
    driver-class-name: org.h2.Driver
    username: sa
    password: 
  h2:
    console:
      enabled: true
      path: /h2-console
  jpa:
    hibernate:
      ddl-auto: create-drop
    show-sql: false
    properties:
      hibernate:
        format_sql: true
        dialect: org.hibernate.dialect.H2Dialect

logging:
  level:
    root: INFO
    com.pragma: DEBUG
    org.springframework.web: DEBUG
    org.springframework.security: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"
    file: "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"
  file:
    name: logs/finances-api.log
    max-size: 10MB
    max-history: 30

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics,loggers
      base-path: /actuator
  endpoint:
    health:
      show-details: always
    loggers:
      enabled: true
  health:
    livenessState:
      enabled: true
    readinessState:
      enabled: true

app:
  external-service:
    payment:
      url: http://external-payment-service:8080/api/payments
      timeout: 5000
      retry-attempts: 3
  transaction:
    duplicate-window-seconds: 300
    max-amount-per-transaction: 100000.00
    min-amount: 0.01
  debug:
    enabled: true
    include-request-details: true

springdoc:
  api-docs:
    path: /api-docs
  swagger-ui:
    path: /swagger-ui.html
    enabled: true
    tryItOutEnabled: true
```
