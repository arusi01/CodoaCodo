create database muchosAmuchos;
use muchosAmuchos;

create table alumno(
dni int not null,
nombre varchar(45) not null,
primary key(dni)
);

insert into alumno(dni,nombre) values (15345345,"Maria");
insert into alumno(dni,nombre) values (20432432,"Daniel");
insert into alumno(dni,nombre) values (45190190,"Carlos");

select * from alumno;

create table asignatura(
clave int auto_increment primary key,
nombre varchar(45)
);

insert into asignatura(nombre) values ("Matematica 1");
insert into asignatura(nombre) values ("Ingles 2");
insert into asignatura(nombre) values ("Contabilidad 1");
insert into asignatura(nombre) values ("Frances 1");

select * from asignatura;

create table matricula(
dni int,
clave_mat int,
primary key(dni,clave_mat),
foreign key(dni) references alumno(dni),
foreign key(clave_mat) references asignatura(clave)
);

insert into matricula(dni,clave_mat) values (15345345,1);
insert into matricula(dni,clave_mat) values (20432432,1);
insert into matricula(dni,clave_mat) values (45190190,2);
insert into matricula(dni,clave_mat) values (45190190,3);

select * from matricula;