create table doctor(

    id serial primary key,
    name varchar(100) not null,
    email varchar(100) not null unique,
    crm bigint not null unique,
    speciality varchar(100) not null,
    address varchar(100) not null,
    zip_code varchar(9) not null,
    complement varchar(100),
    number varchar(20),
    state char(2) not null,
    city varchar(100) not null
);