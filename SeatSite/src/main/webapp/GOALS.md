# SeatSite - Plan de Desarrollo

## Descripción del Proyecto
SeatSite es una aplicación web que permite a los administradores crear distribuciones de asientos (como las de un teatro o cine) y a los usuarios reservar estos asientos.

## Requisitos Funcionales
1. **Gestión de Distribuciones de Asientos**
   - Crear, editar y eliminar distribuciones de asientos.
   - Visualizar distribuciones existentes.

2. **Reservas de Asientos**
   - Visualizar asientos disponibles.
   - Reservar asientos.
   - Cancelar reservas.

3. **Autenticación y Autorización**
   - Registro e inicio de sesión de usuarios.
   - Roles de usuario: Administrador y Usuario.

## Estructura de la Aplicación

### Páginas (Vistas)
1. **[x] Home Page**
   - Descripción del sitio y acceso a funcionalidades principales.

2. **[x] Login Page**
   - Formulario de inicio de sesión.

3. **[x] Register Page**
   - Formulario de registro de nuevos usuarios.

4. **[ ] Dashboard del Administrador**
   - Gestión de distribuciones de asientos.

5. **[ ] Página de Distribuciones**
   - Lista de distribuciones disponibles.
   - Enlace para crear nueva distribución.

6. **[ ] Página de Detalle de Distribución**
   - Visualización de asientos y opciones para editar.

7. **[ ] Página de Reserva de Asientos**
   - Selección de asientos y confirmación de reserva.

8. **[ ] Perfil de Usuario**
   - Información del usuario y sus reservas.

### Servlets
1. **AuthServlet**
   - Maneja el inicio de sesión y registro de usuarios.

2. **DistributionServlet**
   - CRUD para distribuciones de asientos.

3. **ReservationServlet**
   - Manejo de reservas de asientos.

4. **ProfileServlet**
   - Manejo de información del usuario.

### Clases Java
1. **Usuario**
   - Propiedades: id, nombre, email, contraseña, rol.

2. **Distribucion**
   - Propiedades: id, nombre, descripción, lista de asientos.

3. **Asiento**
   - Propiedades: id, número, fila, estado (disponible/reservado).

4. **Reserva**
   - Propiedades: id, usuario, asiento, fechaReserva.

5. **AuthService**
   - Métodos para autenticar usuarios y gestionar sesiones.

6. **DistributionService**
   - Métodos para gestionar distribuciones de asientos.

7. **ReservationService**
   - Métodos para gestionar reservas de asientos.

### Base de Datos
- **Tablas**
  - Usuarios: id, nombre, email, contraseña, rol.
  - Distribuciones: id, nombre, descripción.
  - Asientos: id, número, fila, estado, id_distribución.
  - Reservas: id, id_usuario, id_asiento, fechaReserva.

## Plan de Desarrollo

1. **Configuración del Proyecto**
   - Crear un nuevo proyecto Maven.
   - Configurar dependencias (Servlet API, JSP, JDBC, etc.).

2. **Implementación de la Autenticación**
   - Desarrollar `AuthServlet` y `AuthService`.
   - Crear vistas para registro e inicio de sesión.

3. **Gestión de Distribuciones de Asientos**
   - Desarrollar `DistributionServlet` y `DistributionService`.
   - Crear vistas para gestionar distribuciones.

4. **Implementación de Reservas**
   - Desarrollar `ReservationServlet` y `ReservationService`.
   - Crear vistas para reserva de asientos.

5. **Integración de la Base de Datos**
   - Configurar conexión JDBC.
   - Implementar DAOs para operaciones CRUD.

6. **Pruebas y Despliegue**
   - Pruebas unitarias e integración.
   - Despliegue en un servidor web (Tomcat, Jetty, etc.).

## Consideraciones Adicionales
- Implementar validaciones de entrada.
- Asegurar la aplicación contra vulnerabilidades comunes (CSRF, XSS, SQL Injection).
- Diseñar una interfaz de usuario amigable y responsive.
