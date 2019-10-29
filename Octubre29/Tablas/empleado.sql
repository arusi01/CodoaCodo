-- crear una base de datos tipo persona que contenga tres tablas empleado, productos, administradores
-- en la tabla empleado colocar un id_tipo int not null primary key y con auto incremento
-- otra columna nombre varchar not null, luego apellido varchar not null 
-- area de trabajo varchar not null, titulo varchar not null
-- segunda tabla productos id_producto int not null primary key y con auto incremento
-- nombre_producto varchar, tipo_producto varchar not null, precio_producto varchar not null
-- tercera tabla adminstradores id_administrador int not null y con auto incremento
-- nombre_administrador varchar not null, area_laboral varchar not null 
-- telefono_adminstrador varchar not null, correo_administrador varchar not null
-- relacionar las dos tablas con foreign key (empleado y productos)

create database persona;
use persona;

create table empleado(
id_tipo int auto_increment primary key,
nombre varchar(45) not null,
apellido varchar(45) not null,
area_trabajo varchar(45) not null,
titulo varchar(45) not null
);

