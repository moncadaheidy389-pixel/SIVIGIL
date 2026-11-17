# SIVIGIL - Sistema de Vigilancia Epidemiológica

Sistema web desarrollado con Spring Boot para la consulta, filtrado y visualización de registros epidemiológicos.

## 🚀 Tecnologías Utilizadas
* **Java** (Versión 25)
* **Spring Boot** (v3.3.5)
* **Spring MVC / Thymeleaf** (Para el control de rutas y renderizado de vistas)
* **Maven** (Gestión de dependencias y empaquetado)

## ⚙️ Instrucciones de Ejecución Local

Sigue estos pasos para levantar el proyecto en tu entorno local:

1. Clona este repositorio o abre la carpeta del proyecto en tu entorno de desarrollo (como VS Code).
2. Abre una terminal y navega hasta la carpeta raíz del proyecto (donde se encuentra el script de Maven).
3. Ejecuta el siguiente comando para iniciar el servidor de Spring Boot:
   - En **PowerShell (Windows)**:
     ```powershell
     .\mvnw.cmd spring-boot:run
     ```
   - En **CMD o terminal clásica**:
     ```cmd
     mvnw.cmd spring-boot:run
     ```
4. Abre tu navegador web e ingresa a la siguiente dirección:
   ```text
   http://localhost:8080/
