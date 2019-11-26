create database basereserva;
use basereserva;

create table personas(
idpersona int(11) not null auto_increment,
nombre varchar(20) not null,
apaterno varchar(20) not null,
amaterno varchar(20) not null,
tipo_documento varchar(15) not null,
num_documento varchar(8) not null,
direccion varchar(100) null default null,
telefono varchar(8) null default null,
email varchar(25) null default null,
primary key(idpersona),
unique indexemail_unique (email ASC),
unique telefono_unique (telefono ASC)
);

create table cliente(
idpersona int(11) not null,
codigo_cliente varchar(10) not null,
primary key(idpersona),
unique index codigo_cliente_unique (codigo_cliente ASC),
constraint fk_cliente foreign key (idpersona) references personas(idpersona)
);
