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