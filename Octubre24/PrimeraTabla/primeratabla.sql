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
