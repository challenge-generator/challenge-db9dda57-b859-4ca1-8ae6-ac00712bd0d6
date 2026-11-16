# Mejora de Manejo de Excepciones y Depuración en API de Finanzas

El sistema de finanzas de una entidad bancaria requiere un manejo robusto de excepciones y una depuración efectiva para asegurar la estabilidad y confiabilidad de las operaciones. Tu tarea es mejorar la API existente para manejar correctamente las excepciones y facilitar la depuración cuando sea necesario. La API procesa transacciones financieras y debe manejar casos como saldos insuficientes, transacciones duplicadas y errores de conectividad con servicios externos.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Manejo de Excepciones y Depuración Efectiva |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y entregará cada archivo con su ruta.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y entregará cada archivo con su ruta. Guárdalos en la carpeta donde quieras trabajar, respetando las rutas.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no entrega todos los archivos al terminar el análisis, escríbele: "entrégame todos los archivos con su ruta".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Identificación y Categorización de Excepciones

**Objetivo:** Clasificar y documentar las excepciones que pueden ocurrir en la API de finanzas.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica las posibles excepciones que pueden ocurrir durante el procesamiento de transacciones financieras.
- Clasifica estas excepciones en categorías según su naturaleza (por ejemplo, errores de validación, errores de conectividad, errores de negocio).
- Documenta cada excepción con su categoría, descripción y posible causa.

**Entregable:** Documentación de excepciones categorizadas.

<details>
<summary>Pistas de conocimiento</summary>

- Revisa el código existente para identificar puntos de falla.
- Considera el impacto de cada excepción en el sistema y en el usuario.

</details>

### Fase 2: Implementación de Manejo de Excepciones

**Objetivo:** Implementar un manejo adecuado de las excepciones identificadas en la fase anterior.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Implementa mecanismos para capturar y manejar las excepciones identificadas en la fase 1.
- Asegúrate de que cada excepción sea manejada de acuerdo a su categoría y que el usuario reciba un mensaje claro y útil.
- Documenta el código para explicar cómo se manejan las excepciones.

**Entregable:** Código con manejo de excepciones implementado y documentado.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza try-catch blocks para capturar excepciones.
- Considera el uso de excepciones personalizadas para casos específicos.

</details>

### Fase 3: Facilitación de Depuración

**Objetivo:** Mejorar la API para facilitar la depuración en caso de problemas.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Añade puntos de logging estratégicos en el código para facilitar la depuración.
- Implementa mecanismos para capturar y almacenar información depurada de forma segura.
- Documenta las mejoras realizadas y explica cómo facilitan la depuración.

**Entregable:** Código con mejoras de depuración implementadas y documentadas.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza niveles de logging adecuados para diferentes tipos de información.
- Considera el uso de herramientas de depuración existentes en el entorno de desarrollo.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué son las excepciones y por qué es importante manejarlas?
- **paraQueSirve**: ¿Para qué sirve categorizar las excepciones?
- **comoSeUsa**: ¿Cómo se implementa el manejo de excepciones en el código?
- **erroresComunes**: ¿Cuáles son los errores comunes al manejar excepciones?
- **queDecisionesImplica**: ¿Qué decisiones debes tomar al facilitar la depuración?

## Criterios de Evaluacion

- Identificación y categorización correcta de excepciones.
- Implementación efectiva del manejo de excepciones.
- Mejoras de depuración que facilitan la resolución de problemas.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT) si no tenes un agente en el IDE. Declara lo mismo que AGENTS.md; los archivos que te devuelva el chat los guardas en esta carpeta respetando las rutas.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
