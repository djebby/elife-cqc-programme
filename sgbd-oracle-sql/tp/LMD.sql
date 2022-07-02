-- 1. Ajouter 3 enregistrements...
ALTER TABLE departements DISABLE CONSTRAINT fk_chef_dept;
INSERT INTO departements VALUES (10, 'Informatique', 1);
INSERT INTO departements VALUES (20, 'Telecom', 2);
INSERT INTO departements VALUES (30, 'Finance', 3);

INSERT ALL
INTO salaries (id_salarie, nom, prenom, dateemb, salarie, id_dept, grade) VALUES(1, 'Ben Salah', 'Salma', '01/02/2020', 2000, 10, 'Chef equipe')
INTO salaries VALUES (2, 'Turki', 'Salah', '01/03/2019', 2500, 1, 10, 'Ingenieur')
INTO salaries VALUES (3, 'Mabrouk', 'Faten', '01/09/2019', 2800, 1, 10, 'Ingenieur')
SELECT * FROM dual;

-- 2. Une augmentation de 10% du salaire...
UPDATE salaries
SET salarie = salarie * 1.1
WHERE nom='Ben Salah' AND prenom='Salma';

-- 3. Supprimer tous les ingénieurs  ( they get fired (☉_☉)  )
DELETE FROM salaries
WHERE grade='Ingenieur';