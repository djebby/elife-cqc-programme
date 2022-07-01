-- 1. Créer les tables SALARIES et DEPARTEMENTS avec toutes les contraintes d’intégrités nécessaire.

CREATE TABLE salaries(
    id_salarie INTEGER CONSTRAINT pk_salaries PRIMARY KEY CONSTRAINT ck_id_salarie CHECK(id_salarie BETWEEN 1 AND 100),
    nom VARCHAR2(20) NOT NULL,
    prenom VARCHAR2(20),
    dateEmb DATE DEFAULT SYSDATE,
    salarie NUMBER,
    id_manager INTEGER CONSTRAINT fk_manager REFERENCES salaries (id_salarie),
    id_dept INTEGER
);

CREATE TABLE departements
(
    id_dept INTEGER,
    CONSTRAINT pk_departements PRIMARY KEY (id_dept),
    nom_dept VARCHAR2(20) NOT NULL,
    chef_dept INTEGER,
    CONSTRAINT fk_chef_dept FOREIGN KEY (chef_dept) REFERENCES salaries (id_salarie)
);

ALTER TABLE salaries ADD CONSTRAINT fk_id_dept FOREIGN KEY (id_dept) REFERENCES departements (id_dept);


-- 2. Ajouter une colonne Grade dans la table SALARIES de type chaine de caractères.
ALTER TABLE salaries ADD ( grade VARCHAR2(20));



--  3. Ajouter les contraintes suivantes :
--      - La colonne Chef_dept est unique ;
--      - La colonne Prenom est non nulle ;
--      - La colonne Salaire contient des valeurs comprises entre 1000 et 5000 ;
--      - L’année d’embauche doit être supérieure à l’année 1990 ;

ALTER TABLE departements ADD CONSTRAINT unique_chef_dept UNIQUE(chef_dept);
ALTER TABLE salaries MODIFY prenom NOT NULL;
ALTER TABLE salaries ADD CONSTRAINT ck_salaire CHECK(salarie BETWEEN 1000 AND 5000);
ALTER TABLE salaries ADD CONSTRAINT ck_date_embauche CHECK(to_char(dateEmb, 'yyyy') > 1990);
