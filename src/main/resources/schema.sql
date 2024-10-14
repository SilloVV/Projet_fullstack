create table t_centres (
    id int4 not null,
    ville varchar(255),
    nom varchar(255),
    primary key (id)
);

create table t_employes(
    id int4 not null, 
    nom varchar(255),
    prenom varchar(255),
    foreign key (id_centre) references t_centres(id),
    is_med boolean, 
    is_admin boolean, 
    is_super_admin boolean,
    telephone varchar(15),
    primary key (id)
)

create table t_reservations(
    id int4 not null, 
    foreign key(id_patient) references t_employes(id),
    foreign key(id_centre) references t_centres(id),
    jour date, 
    creneau time, 
    is_validated boolean,
    primary key(id)
    
)

create table t_patients(
    id int4 not null, 
    nom varchar(255),
    prenom varchar(255),
    mail varchar(255),
    telephone varchar(15),
    date_naissance date,
    primary key(id)

)


