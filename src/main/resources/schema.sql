create table if not exists t_centres  (
    id int4 not null,
    ville varchar(255),
    nom varchar(255),
    primary key (id)
);

create table if not exists t_employes(
    id int4 not null, 
    nom varchar(255),
    prenom varchar(255),
    id_centre int4,
    is_med boolean, 
    is_admin boolean, 
    is_super_admin boolean,
    telephone varchar(15),
    primary key (id),
    foreign key (id_centre) references t_centres(id)
);

create table if not exists t_reservations (
    id int4 not null, 
    id_patient int4,
    id_centre int4,
    id_employe int4,
    jour date, 
    creneau time, 
    is_validated boolean,
    primary key(id),
    foreign key(id_patient) references t_employes(id),
    foreign key(id_centre) references t_centres(id), 
    foreign key(id_employe) references t_employes(id)
    
);

create table if not exists t_patients (
    id int4 not null, 
    nom varchar(255),
    prenom varchar(255),
    mail varchar(255),
    telephone varchar(15),
    date_naissance date,
    primary key(id)

);


