🚀 Agencia Espacial Stellaris - Simulador de Misiones: Este proyecto es una aplicación de consola desarrollada en Java que simula el ciclo de vida de una misión espacial. El sistema permite la configuración de naves personalizadas, la adaptación de sistemas críticos y la gestión de estados de vuelo mediante una arquitectura orientada a objetos.

📋 Requisitos del Proyecto

El sistema cumple con las siguientes fases de ejecución:

- Configuración: Creación de la nave y definición del nombre de la misión.

- Preparación: Adaptación de sistemas externos de soporte vital.

- Simulación: Interacción en tiempo real donde las acciones del usuario afectan la energía y el comportamiento de la nave.

- Reporte: Resumen detallado de la bitácora de eventos al finalizar la misión.

🛠️ Patrones de Diseño Implementados: Se ha integrado al menos un patrón de cada categoría (Creacional, Estructural y de Comportamiento) para garantizar un código escalable y desacoplado:

1. Factory Method (Creacional)
Ubicado en el paquete com.stellaris.factory. Se utiliza para instanciar diferentes tipos de naves (Exploradora, Carguero, Cientifica) sin exponer la lógica de creación al cliente, centralizando la fabricación en la clase NaveFactory.

2. Adapter (Estructural)
Ubicado en el paquete com.stellaris.adapter. Permite que el SistemaOxigenoExterno (un sistema con interfaz incompatible) trabaje con el flujo de preparación de la nave a través de la clase AdaptadorSoporteVital.

3. State (Comportamiento)
Ubicado en el paquete com.stellaris.state. La nave cambia su comportamiento dinámicamente según su situación actual (Preparación, En Vuelo, Emergencia). Cada estado implementa la interfaz EstadoMision, permitiendo que la lógica de ejecución varíe sin usar condicionales complejos (if/else).

📂 Estructura del Proyecto: El código sigue una estructura de paquetes organizada por responsabilidad:

com.stellaris: Clase principal de la aplicación.

com.stellaris.core: Definiciones base y clases abstractas de la nave.

com.stellaris.factory: Lógica de creación de naves.

com.stellaris.adapter: Adaptación de componentes externos.

com.stellaris.state: Gestión de los estados de la misión.
