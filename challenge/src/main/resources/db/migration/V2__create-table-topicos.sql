create table topicos(
    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje text not null,
    fecha_creacion datetime not null,
    estado varchar(50) not null,
    id_usuario bigint not null,
    nombre_curso varchar(100) not null,

    primary key(id),
    constraint fk_topicos_usuario_id foreign key(id_usuario) references usuarios(id)
);