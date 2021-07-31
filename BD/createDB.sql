\c postgres
drop database if exists diplomadosdb;
create database diplomadosdb;
\c diplomadosdb;

SET CLIENT_ENCODING TO 'utf8';

CREATE TABLE "diplomado" (
  "id" serial,
  "titulo" varchar(100),
  "introduccion" varchar(5000),
  "objetivo" varchar(5000),
  "descripcion" varchar(5000),
  "horas" int,
  "cursos" int,
  "imagen" varchar(1000),
  "arancel" int,
  PRIMARY KEY ("id")
);

CREATE TABLE "informacion" (
  "id" serial,
  "nombre" varchar(100),
  "contenido" varchar(6000),
  "id_diplomado" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_docente_diplomado
    FOREIGN KEY(id_diplomado) 
      REFERENCES diplomado(id)
);

CREATE TABLE "rol" (
  "id" serial,
  "descripcion" varchar(20),
  PRIMARY KEY ("id")
);

CREATE TABLE "rol_docente" (
  "id" serial,
  "descripcion" varchar(50),
  PRIMARY KEY ("id")
);

CREATE TABLE "docente" (
  "id" serial,
  "nombre" varchar(100),
  "id_rol_docente" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_docente_rol_docente
    FOREIGN KEY(id_rol_docente) 
      REFERENCES rol_docente(id)
);

CREATE TABLE "diplomado_docente" (
  "id" serial,
  "coordinador" boolean,
  "id_docente" serial,
  "id_diplomado" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_diplomado_docente_docente
    FOREIGN KEY(id_docente) 
      REFERENCES docente(id),
  CONSTRAINT fk_diplomado_docente_diplomado
    FOREIGN KEY(id_diplomado) 
      REFERENCES diplomado(id)
    
);


CREATE TABLE "titulo" (
  "id" serial,
  "nombre" varchar(200),
  PRIMARY KEY ("id")
);

CREATE TABLE "docente_titulo" (
  "id" serial,
  "id_docente" serial,
  "id_titulo" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_docente_titulo_docente
    FOREIGN KEY(id_docente) 
      REFERENCES docente(id),
  CONSTRAINT fk_docente_titulo_titulo
    FOREIGN KEY(id_titulo) 
      REFERENCES titulo(id)
);



CREATE TABLE "usuario" (
  "id" serial,
  "email" varchar(100),
  "password" varchar(100),
  "id_docente" serial,
  "id_rol" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_usuario_docente
    FOREIGN KEY(id_docente) 
      REFERENCES docente(id),
  CONSTRAINT fk_usuario_rol
    FOREIGN KEY(id_rol) 
      REFERENCES rol(id)
);


CREATE TABLE "postulante" (
  "id" serial,
  "nombre" varchar(100),
  "correo" varchar(50),
  "num_telefono" varchar(32),
  PRIMARY KEY ("id")
);

CREATE TABLE "postulacion" (
  "id" serial,
  "comentario" varchar(300),
  "src_doc" varchar(300),
  "id_postulante" serial,
  "id_diplomado" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_postulacion_postulante
    FOREIGN KEY(id_postulante) 
      REFERENCES postulante(id),
  CONSTRAINT fk_postulacion_diplomado
    FOREIGN KEY(id_diplomado) 
      REFERENCES diplomado(id)
);


CREATE TABLE "carta" (
  "id" serial,
  "descripcion" varchar(100),
  "id_docente" serial,
  "id_postulante" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_carta_docente
    FOREIGN KEY(id_docente) 
      REFERENCES docente(id),
  CONSTRAINT fk_carta_postulante
    FOREIGN KEY(id_postulante) 
      REFERENCES postulante(id)
);






