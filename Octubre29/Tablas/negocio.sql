create database negocio;
use negocio;

create table persona(
registro int auto_increment primary key,
nombre varchar(45),
apellido varchar(225),
telefono int,
direccion varchar(80),
sexo char(1),
 check(sexo in('m','f'))
);

create table cliente(
registro int auto_increment primary key,
referenciaper int,
cedula varchar(225) not null,
correo varchar(225) not null,
pagina_web varchar(45) not null,
foreign key(referenciaper) references persona(registro)
);


insert into persona(nombre,apellido,telefono,direccion,sexo) values("Luis","Corso",333,"Caba","M");
insert into persona(nombre,apellido,telefono,direccion,sexo) values("Carlos","Perez",222,"Caba","M");
insert into persona(nombre,apellido,telefono,direccion,sexo) values("Liliana","Ali",3212,"Caba","F");
insert into persona(nombre,apellido,telefono,direccion,sexo) values("Miguel","Paset",423,"Caba","M");
insert into cliente(referenciaper,cedula,correo,pagina_web) values(1,"Campox","test@test.com","test.com");
insert into cliente(referenciaper,cedula,correo,pagina_web) values(1,"Ferda","test1@test1.com","test1.com");
insert into cliente(referenciaper,cedula,correo,pagina_web) values(1,"Foedta","test2@test2.com","test2.com");

select * from cliente;
select * from persona order by registro desc;
select * from persona order by registro asc;
