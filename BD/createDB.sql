drop database if exists diplomadosdb;
create database diplomadosdb;
\c diplomadosdb;

CREATE TABLE "diplomado" (
  "id" serial,
  "titulo" varchar(100),
  
  "descripcion" varchar(1000),
  PRIMARY KEY ("id")
);

CREATE TABLE "rol" (
  "id" serial,
  "descripcion" varchar(20),
  PRIMARY KEY ("id")
);

CREATE TABLE "docente" (
  "id" serial,
  "nombre" varchar(100),
  "id_diplomado" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_docente_diplomado
    FOREIGN KEY(id_diplomado) 
      REFERENCES diplomado(id)
);

CREATE TABLE "rol_docente" (
  "id" serial,
  "descripcion" varchar(50),
  "id_docente" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_rol_docente_ddocente
    FOREIGN KEY(id_docente) 
      REFERENCES docente(id)
);

CREATE TABLE "titulo" (
  "id" serial,
  "nombre" varchar(100),
  "descripcion" varchar(300),
  "id_docente" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_titulo_docente
    FOREIGN KEY(id_docente) 
      REFERENCES docente(id)
);

CREATE TABLE "user" (
  "id" serial,
  "email" varchar(100),
  "password" varchar(100),
  "id_docente" serial,
  "id_rol" serial,
  PRIMARY KEY ("id"),
  CONSTRAINT fk_user_docente
    FOREIGN KEY(id_docente) 
      REFERENCES docente(id),
  CONSTRAINT fk_user_rol
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






