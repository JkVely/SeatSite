# SeatSite
## Introducción

El presente documento describe el anteproyecto para el desarrollo de una aplicación web destinada a la gestión y reserva de asientos en un entorno virtual, llamada **SeatSite**. Este anteproyecto establece los objetivos, la funcionalidad esperada del sistema y los temas clave que serán aplicados durante el desarrollo del proyecto.

## Objetivo General

El objetivo general del proyecto es diseñar y desarrollar una aplicación web que permita a los administradores configurar distribuciones de sillas y a los clientes seleccionar y reservar asientos de manera eficiente y sencilla. La aplicación pretende optimizar la gestión de espacios y proporcionar una experiencia de usuario fluida y efectiva.

## Objetivos Específicos

- Desarrollar una interfaz para administradores que facilite la configuración y modificación de la disposición de sillas en diversos entornos.
- Crear una interfaz de usuario intuitiva para clientes que permita seleccionar y reservar uno o varios asientos con facilidad.
- Implementar un sistema robusto de validación y confirmación de reservas para garantizar la disponibilidad y correcta asignación de asientos.
- Integrar una funcionalidad de visualización en tiempo real de la distribución de sillas para mejorar la experiencia de selección del usuario.

## Descripción de la Funcionalidad del Proyecto

La aplicación web estará compuesta por dos módulos principales:

### Módulo de Administración

Este módulo permitirá a los administradores definir y gestionar la disposición de las sillas en un entorno visual interactivo. Las funcionalidades incluirán la adición, eliminación y reconfiguración de sillas, así como la visualización de un resumen de distribuciones y la gestión de reservas.

### Módulo de Cliente

Este módulo proporcionará a los clientes una interfaz para visualizar la disposición actual de las sillas, seleccionar asientos y realizar reservas. Además, los clientes podrán consultar, modificar o cancelar sus reservas según sea necesario.

## Descripción de la Implementación

La implementación del proyecto se fundamentará en las siguientes tecnologías y conceptos:

- **Diseño de Interfaz de Usuario (UI)**: Se utilizarán HTML, CSS y JavaScript para desarrollar interfaces de usuario atractivas y funcionales, garantizando una experiencia de usuario intuitiva y efectiva.
- **Desarrollo Backend**: El servidor se implementará utilizando JSP/Servlets, facilitando la gestión de solicitudes, lógica de negocio y la interacción con la base de datos.
- **Base de Datos**: Se empleará una base de datos relacional para almacenar y gestionar la información sobre distribuciones de sillas, reservas y usuarios, asegurando la integridad y consistencia de los datos.
- **Gestión de Sesiones**: Se implementará un sistema de gestión de sesiones para mantener la información del usuario durante la interacción con la aplicación, mejorando la fluidez de la experiencia de reserva.
- **Validación y Seguridad**: Se aplicarán técnicas de validación de datos y medidas de seguridad para proteger la aplicación contra vulnerabilidades y garantizar la correcta gestión de las reservas.

## Temas Relevantes Vistos en Clase

Durante el desarrollo del proyecto, se aplicarán los siguientes temas vistos en clase:

- **Arquitectura de Aplicaciones Web**: Estructuración del proyecto en módulos funcionales y la integración de componentes frontend y backend.
- **Programación en Java**: Uso de JSP/Servlets para la gestión de la lógica del servidor y el manejo de solicitudes del usuario.
- **Diseño de Interfaces**: Aplicación de principios de diseño web para la creación de interfaces de usuario efectivas y atractivas.
- **Seguridad en Aplicaciones Web**: Implementación de medidas de seguridad para proteger la aplicación y los datos del usuario.

## Estructura del Proyecto

```plaintext
SeatSite/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── seatsite/
│   │   │           └── models/
│   │   │               ├── Client.java
│   │   │               ├── Reserva.java
│   │   │               ├── Seat.java
│   │   │               └── EstadoAsiento.java
│   │   ├── resources/
│   │   │   ├── db.properties
│   │   │   └── schema.sql
│   │   └── webapp/
│   │       ├── admin/
│   │       │   ├── login.html
│   │       │   ├── register.html
│   │       │   └── verificación.html
│   │       ├── user/
│   │       │   ├── login.html
│   │       │   └── register.html
│   │       ├── css/
│   │       │   ├── LoginStyle.css
│   │       │   └── RegisterStyle.css
│   │       └── GOALS.md
├── pom.xml
└── README.md
```

## Instalación y Configuración

### Prerrequisitos

- Java 8 o superior
- Maven
- Servidor web (Tomcat, Jetty, etc.)
- Base de datos SQL Server

### Configuración de la Base de Datos

- Crear la base de datos utilizando el archivo `schema.sql` ubicado en `src/main/resources`.
- Configurar la conexión a la base de datos en el archivo `db.properties` ubicado en `src/main/resources`.

## Compilación y Despliegue

## Uso de la Aplicación

### Registro de Usuarios

Los usuarios pueden registrarse a través de la página de registro (register.html). Se requiere que ingresen su nombre, apellidos, correo electrónico y contraseña.

### Inicio de Sesión

Los usuarios pueden iniciar sesión a través de la página de inicio de sesión (login.html). Se requiere que ingresen su correo electrónico y contraseña.

### Gestión de Distribuciones de Asientos

Los administradores pueden gestionar las distribuciones de asientos a través de las vistas diseñadas para este propósito. Pueden crear, modificar y eliminar distribuciones de asientos.

### Reserva de Asientos

Los usuarios pueden reservar asientos a través de las vistas de reserva. Pueden seleccionar los asientos disponibles y confirmar su reserva.

## Contribuciones

Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos para contribuir:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza los cambios necesarios y haz commit (`git commit -am 'Añadir nueva funcionalidad'`).
4. Sube los cambios a tu repositorio (`git push origin feature/nueva-funcionalidad`).
5. Crea un Pull Request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

## Contacto

Para más información, puedes contactarnos a través de correo electrónico.

> [!NOTE]
> Este proyecto está en constante desarrollo. Agradecemos tus sugerencias y comentarios para mejorar SeatSite.

> [!TIP]
> Asegúrate de mantener tu entorno de desarrollo actualizado para evitar problemas de compatibilidad.

¡Gracias por usar SeatSite!

## Autores

- [Juan Carlos Quintero Rubiano](https://github.com/JkVely)
- Giovanny Sierra Reina
- Juan David Campos Salcedo
