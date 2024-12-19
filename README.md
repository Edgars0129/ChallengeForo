# Foro Alura - Backend Challenge

## Descripción del Proyecto

Foro Alura es una aplicación backend robusta para un sistema de foro, diseñada con Spring Boot. El proyecto proporciona funcionalidades completas de gestión de usuarios y tópicos, con un enfoque principal en seguridad, rendimiento y escalabilidad.

## 🌟 Características Principales

### 🔐 Autenticación Segura
- Implementación de JWT (JSON Web Tokens)
- Autenticación robusta basada en Spring Security
- Gestión de sesiones segura

### 📋 Gestión de Tópicos
- Operaciones CRUD completas para tópicos
- Soporte avanzado de paginación
- Estados de tópicos personalizables
- Validación de datos detallada

### 🛡️ Seguridad Avanzada
- Protección de endpoints con autenticación y autorización
- Manejo centralizado de errores
- Validación comprehensiva de datos de entrada
- Prevención de ataques comunes

## 🛠️ Tecnologías Utilizadas

| Categoría | Tecnologías | Versión |
|-----------|-------------|---------|
| **Lenguaje** | Java | 17 |
| **Framework** | Spring Boot | 3.x |
| **Seguridad** | Spring Security | - |
| **Base de Datos** | MySQL | 8.0 |
| **Migración de BD** | Flyway | - |
| **Gestión de Dependencias** | Maven | - |

## 📋 Requisitos Previos

- ☕ JDK 17
- 🛠️ Maven 3.8+
- 💾 MySQL 8.0

## 🚀 Instalación y Configuración

### 1. Clonar el Repositorio
```bash
git clone https://github.com/[tu-usuario]/foro-alura.git
cd foro-alura
```

### 2. Configurar Aplicación
1. Configura las credenciales de base de datos en `src/main/resources/application.properties`
2. Establece la clave secreta para JWT
3. Verifica la configuración de Flyway para migraciones de base de datos

### 3. Compilar y Ejecutar
```bash
# Limpiar y compilar el proyecto
mvn clean install

# Ejecutar la aplicación
mvn spring-boot:run
```

## 🌐 Endpoints Principales

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| POST | `/login` | Autenticación de usuarios |
| POST | `/topicos` | Crear nuevo tópico |
| GET | `/topicos` | Listar tópicos |
| PUT | `/topicos` | Actualizar tópico |
| DELETE | `/topicos/{id}` | Eliminar tópico |

## 📂 Estructura del Proyecto

```
src/
└── main/
    ├── java/
    │   └── com/foroAlura/challenge/
    │       ├── controller/     # Controladores REST
    │       ├── domain/         # Modelos de dominio
    │       └── infra/          # Configuraciones de infraestructura
    └── resources/
        └── db/migration/       # Scripts de migración de base de datos
```

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Por favor, sigue estos pasos:

1. Abre un issue para discutir cambios propuestos
2. Realiza un fork del repositorio
3. Crea tu rama de características
   ```bash
   git checkout -b feature/nueva-caracteristica
   ```
4. Commitea tus cambios
   ```bash
   git commit -m 'Añadir nueva característica'
   ```
5. Envía un pull request

## 📧 Contacto
https://github.com/Edgars0129 
