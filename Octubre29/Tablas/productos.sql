create database db;
use db;

create table productos(
idproducto int auto_increment primary key,
nombre varchar(50) not null,
precio decimal(10,2) not null,
fecha_alta date default '0000-00-00'
);

show tables;
show columns from productos;
show create table productos;

rename table productos to producto;

show columns from producto;

alter table producto add existencias int not null;

alter table producto drop existencias;

alter table producto change precio precios decimal(18,2) not null;

desc producto;

select * from producto;


delimiter $
create procedure insertar(in nom varchar(150), in pre decimal(18,2))
begin
insert into producto(nombre,precios,fecha_alta) values(nom,pre,CURDATE());
end $

call insertar('Lapiz',10);
call insertar('Birome',5.60);
