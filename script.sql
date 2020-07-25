create database estudiante;
use estudiante;
create table estudiante
(codigo_est int(2)  not null,
nombre_est varchar(20),
direccion_est varchar(20),
edad_est int(2),
constraint estudiante_pk primary key (codigo_est )
);