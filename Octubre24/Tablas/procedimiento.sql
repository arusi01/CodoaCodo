-- un prodedimiento alacenado es un programa almacenado fisicamente en una base de datos.
-- Su implementacion varia entre un a base de datos a otra, la ventaja de un procedimiento
-- almacenado es que al ser ejecutado en respuesta a una peticion del usuario, es ejecutado
-- directamente en el motor de base de datos el cualquier generalmente corre en un servidor 
-- separado.

create database test;

use test;

create table usuario (
id_usuario int primary key auto_increment not null,
nombre varchar(150) not null,
apellido varchar(150) not null,
fecha_reg timestamp default current_timestamp 
);

select * from usuario;

desc usuario;

delimiter $
create procedure insertar(in nom varchar(150), in ape varchar(150))
begin
insert into usuario(nombre,apellido) values(nom,ape);
end $

call insertar('Pepe','Argento');
call insertar('Daniel','Cobo');

-- ***************** SEGUNDO EJEMPLO

delimiter $
create procedure borrar(in id int)
begin
delete from usuario where id_usuario=id;
end $

call borrar(2);

select * from usuario;

-- ***************** TERCER EJEMPLO

delimiter $
create procedure actualizar(in id int, in nom varchar(150), in ape varchar(150))
begin
update usuario set nombre=nom, apellido=ape where id_usuario=id;
end $

call actualizar(1,'Daniel','Escada');

select * from usuario;
