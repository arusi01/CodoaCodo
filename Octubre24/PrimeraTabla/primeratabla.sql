create database primeratabla;
drop database primeratabla; -- Borra objetos de la base de datos
create schema primeratabla;

use primeratabla; -- ingresar a la base de datos

create table coche(
numero_chasis varchar(45) not null,
matricula varchar(45) not null,
dni_propietario varchar(45) not null
);

desc coche;
select * from coche;

insert into coche (numero_chasis,matricula,dni_propietario)
values('5tfm5f10ax007210','4817BFK','45338600L');  

insert into coche (numero_chasis,matricula,dni_propietario)
values('6hsen2j98as001982','8810CLM','02405068K'),('5rgsb7a19js001982','0019CGL','40588860J');

-- ************************ SEGUNDO EJEMPLO

use primeratabla; -- ingresar a la base de datos

create table administrador(
id_administrador int not null,
nombre varchar(45) not null,
telefono varchar(45) not null
);

select * from administrador;

insert into administrador (id_administrador,nombre,telefono)
value (1,'Pepe','12345');

-- ************************ TERCER EJEMPLO

use primeratabla; -- ingresar a la base de datos

create table administradores(
id_administrador int not null auto_increment,
nombre varchar(45) not null,
telefono varchar(45) not null,
primary key(id_administrador)
);

select * from administradores;

insert into administradores (nombre,telefono)
value ('Pepe','12345');

insert into administradores (nombre,telefono)
value ('Daniel','42520000');

desc administradores;


-- ************************ Ejercicio

use primeratabla; -- ingresar a la base de datos

create table especies(
cod_especie varchar(30) not null,
nombre_especie varchar(20) not null,
tipo varchar(10) not null,
periodos_migratorios varchar(30),
caracteristicasgenerales varchar(30) not null,
primary key(cod_especie)
);

select * from especies;

desc especies;
