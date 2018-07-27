create table usuario(
	usuario varchar(50),
    clave varchar(50),
    nombre varchar(100)
);

select * from usuario;
insert into usuario values ('admin','1234','Administrador');
insert into usuario values ('alumno','5678','Alumno de la clase');
insert into usuario values ('profe','1928','Profesor de la clase');