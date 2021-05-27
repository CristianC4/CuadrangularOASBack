# CuadrangularOASBack
_Ejercicio de Cuadrangular para la OAS con SOA_

### Pre-requisitos 📋

_Para poder realizar este proyecto, se hizo uso del as siguientes tecnologias_

```
PostgreSQL v13.3
SpringToolSuite TS4.10
```

### Configuración Basica 🔧

_Este proyecto tiene como finalidad servir de proveedor de recursos BackEnd para el ejercicio de Cuadrangulares, el mismo se encuentra orientado a servicios como se 
detalla a continuación_

_Lo primero que se realizo fue la definicion de entidades, que fueron modeladas y despleagadas en postgres, el diagrama sen encuentra en la raiz del proyecto
muestra las entidades en un modelo conceptual entidad relacion, las sentencias SQL se encuentran en el archivo cuadrangular.SQL_

```
User: postgres
Password: password
Port: 5432
```

_En cuanto a el framework utilizado es Spring Framework, especificamente SpringBoot, una herramienta sencilla pero robusta, la cual decidi utilizar
por que permite realizar servicios y microservicios con inyeccion de dependencias, las propiedades del servidor son listadas a continuacion de igual manera se encuentran en el archivo
application.properties_

```
server.port = 8888
server.error.whitelabel.enabled=true
spring.datasource.url = jdbc:postgresql://localhost:5432/quadrangular
spring.datasource.username = postgres
spring.datasource.password = password
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.PostgreSQLDialect
```

## BackEnd 🛠️

_El proyecto consiste en realizar un cuadrangular en el que se puedan registrar equipos y visualizar tabla de posicion dicho esto la RESTful API quedaria orientada de la siguiente forma_

* [GET] Obtener Equipos ()
* [GET] Obtener Equipos por ID (@Param id_equipo)
* [POST] Registro de Equipos (@Param equipo)
* [POST] Registro de Torneo (@Param torneo)
* [POST] Registro de Partidos (@Param partido)
* [POST] Registro de Tabla de Puntos por Equió (@Param infoTabla, @Param id_torneo, @Param id_equipo)
* [PUT] Actualizar Tabla de Puntos (@Param infoTabla)
* [GET] Obtener Tablas de Torneo (@Param id_torneo)

 _Para la estructura principal de este BackEnd se uso una estructura de servicios con interface e implementacion, controladores para dar una ruta especifica y endpoints adecuados_
 
## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **Cristian Camilo Cuervo Castillo** - *Ing Sistemas* 



