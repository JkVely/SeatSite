# SeatSite

## Descripción del Proyecto
**SeatSite** es una aplicación web diseñada para gestionar la distribución y reserva de asientos en diversos eventos y lugares. Nuestro objetivo es proporcionar una plataforma intuitiva y eficiente que permita a los usuarios reservar asientos de manera rápida y segura, mientras que los administradores pueden gestionar las distribuciones de asientos y las reservas de manera efectiva.

## Objetivos del Proyecto

### Gestión de Distribuciones de Asientos
- **Desarrollar DistributionServlet y DistributionService**: Implementar los componentes necesarios para gestionar las distribuciones de asientos.
- **Crear vistas para gestionar distribuciones**: Diseñar interfaces de usuario que permitan a los administradores crear y modificar distribuciones de asientos.

### Implementación de Reservas
- **Desarrollar ReservationServlet y ReservationService**: Implementar los componentes necesarios para gestionar las reservas de asientos.
- **Crear vistas para reserva de asientos**: Diseñar interfaces de usuario que permitan a los clientes reservar asientos de manera sencilla.

### Integración de la Base de Datos
- **Configurar conexión JDBC**: Establecer la conexión con la base de datos utilizando JDBC.
- **Implementar DAOs para operaciones CRUD**: Crear objetos de acceso a datos (DAOs) para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la base de datos.

### Pruebas y Despliegue
- **Pruebas unitarias e integración**: Realizar pruebas unitarias e integradas para asegurar la calidad del software.
- **Despliegue en un servidor web**: Desplegar la aplicación en un servidor web como Tomcat o Jetty.

### Consideraciones Adicionales
- **Implementar validaciones de entrada**: Asegurar que los datos ingresados por los usuarios sean válidos y seguros.
- **Asegurar la aplicación contra vulnerabilidades comunes**: Proteger la aplicación contra CSRF, XSS, SQL Injection, y otras vulnerabilidades.
- **Diseñar una interfaz de usuario amigable y responsive**: Crear una interfaz de usuario que sea fácil de usar y que funcione bien en dispositivos móviles y de escritorio.

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

### Instalación y Configuración

#### Prerrequisitos
- Java 8 o superior
- Maven
- Servidor web (Tomcat, Jetty, etc.)
- Base de datos SQL Server

#### Configuración de la Base de Datos
- Crear la base de datos utilizando el archivo `schema.sql` ubicado en `src/main/resources`.
- Configurar la conexión a la base de datos en el archivo `db.properties` ubicado en `src/main/resources`.

### Compilación y Despliegue




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

Haz un fork del repositorio.
Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
Realiza los cambios necesarios y haz commit (git commit -am 'Añadir nueva funcionalidad').
Sube los cambios a tu repositorio (git push origin feature/nueva-funcionalidad).
Crea un Pull Request.
Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

Contacto
Para más información, puedes contactarnos a través de correo electrónico.

> [!NOTE]
> Este proyecto está en constante desarrollo. Agradecemos tus sugerencias y comentarios para mejorar SeatSite.

> [!TIP]
> Asegúrate de mantener tu entorno de desarrollo actualizado para evitar problemas de compatibilidad.

¡Gracias por usar SeatSite!
