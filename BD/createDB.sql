
drop database diplomadosDB;
create database diplomadosDB;
\c diplomadosDB;

CREATE TABLE "diplomado" (
  "id" serial,
  "titulo" varchar(100),
  "descripcion" varchar(100),
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
  PRIMARY KEY ("id")
);

CREATE TABLE "rol_docente" (
  "id" serial,
  "descripcion" varchar(50),
  "id_docente" serial,
  PRIMARY KEY ("id")
);

CREATE TABLE "titulo" (
  "id" serial,
  "nombre" varchar(100),
  "descripcion" varchar(300),
  "id_docente" serial,
  PRIMARY KEY ("id")
);

CREATE TABLE "user" (
  "id" serial,
  "email" varchar(100),
  "password" varchar(100),
  "id_docente" serial,
  "id_rol" serial,
  PRIMARY KEY ("id")
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
  PRIMARY KEY ("id")
);


CREATE TABLE "carta" (
  "id" serial,
  "descripcion" varchar(100),
  "id_docente" serial,
  "id_postulante" serial,
  PRIMARY KEY ("id")
);






