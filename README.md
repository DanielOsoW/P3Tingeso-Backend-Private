# Backend : Servicio Rest 	:exploding_head:
<p align="center"><a target="_blank"><img src="https://cleventy.com/wp-content/uploads/2020/05/spring-boot.png" width="400"></a></p>

## Conexión a BD con SQL2O en Java Spring

Ejemplo creado a con de [Spring Initializr](https://start.spring.io/) basado en Spring Boot utilizando Gradle y dependencias de Spring Web.

### Requisitos
* Java 8 o superior 
* Gradle 5.x o superior (opcional)

### Instalación
* En la línea de comandos, dirigirse a la carpeta del proyecto
* Iniciar proyecto Gradle con el comando `gradlew` en Windows y con `/.gradlew` Linux/ Mac

* Configurar URL de conexión en src/main/resources `application.resources` . Dejar como fijo en su equipo la configuracion : database.user=postgres y database.password=admin

* Ejecutar proyecto de desarrollo con

## Windows
### `gradlew bootRun`
## Linux o MAC
### `./gradlew bootRun`

# Tingeso instrucciones base de datos entrega 3

# Backend : Base de datos 	:cold_face:
<p align="center"><a target="_blank"><img src="https://programacion.net/files/article/20151129021117_postgresql-logo.png" width="400"></a></p>

### Requisitos
* PostgreSQL

Para generar la base de datos con la que opera la aplicación, usted deberá ubicarse en la carpeta BD, una vez dentro de esa carpeta
abrá una terminal o consola en esa carpeta y ejecute la consola de PostgresSQL

## Windows

Asegurese de tener configurada sus variables de entorno para ejecutar psql en cualquier lugar de su computador.

### `psql -U postgres`

## Linux 

### `sudo -u postgres psql`

## Ejecución de los scripts solicitados

Una vez abierta la consola de postgres ejecute el siguiente comando para crear la base de datos junto a sus tablas.

### `\i createDB.sql`

Ya creada la base de datos procedá a cargar datos dump mediante:
### `\i loadData.sql`
