create database computador;
use computador;

create table producto(
id_tipo_producto int auto_increment,
nombreTipo varchar(45) not null,
primary key(id_tipo_producto)
);

show columns from producto;

rename table producto to tipo_producto;

create table productos(
cod_producto varchar(10) primary key,
descripcion varchar(225),
pCompraUSD float,
pCompraPesos float,
pVentaPesos float,
id_tipo_producto int,
foreign key(id_tipo_producto) references tipo_producto(id_tipo_producto) 
);

select * from tipo_producto;
select * from productos;

insert into tipo_producto(nombreTipo) values ('Memoria Ram');
insert into tipo_producto(nombreTipo) values ('Memoria Rom');

insert into productos(cod_producto,descripcion,pCompraUSD,pCompraPesos,pVentaPesos,id_tipo_producto) 
values ('001','DDR3 128GB',2,120,200,1);