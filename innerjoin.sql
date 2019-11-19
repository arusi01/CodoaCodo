create database innerjoin;
use innerjoin;

create table t_domicilio(
id_domicilio int(11) primary key not null,
id_persona int(11) not null,
pais varchar(45) default null,
cod_postal varchar(45)
);

create table t_persona(
id_persona int(11) primary key not null auto_increment,
paterno varchar(45) default null,
materno varchar(45) default null,
nombre varchar(45) default null
);

select * from t_persona;
select * from t_domicilio;

insert into t_persona (paterno,materno,nombre) values ('Mendez','Martinez','Jose');
insert into t_persona (paterno,materno,nombre) values ('Lopez','Perez','Andres');

insert into t_domicilio (id_domicilio,id_persona,pais,cod_postal)
values (1,1,'Argentina','1000');

insert into t_domicilio (id_domicilio,id_persona,pais,cod_postal)
values (2,2,'Chile','1234');


select tp.nombre, td.pais from t_persona as tp
inner join t_domicilio as td
on tp.id_persona=td.id_persona;


