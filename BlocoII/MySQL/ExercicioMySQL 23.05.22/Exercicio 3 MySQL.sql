create database DB_escola;
use DB_escola;
create table estudantes 
(
idEstudantes mediumint(8) unsigned NOT NULL auto_increment,
nomeEstudantes varchar(255),
idadeEstudantes int(2),
mensalidadeEstudantes mediumint(5),
notaEstudantes mediumint(4),
primary key (idEstudantes)
)auto_increment=1;

INSERT INTO estudantes
(nomeEstudantes, idadeEstudantes, mensalidadeEstudantes, notaEstudantes) values ("Augusto",25,300,10);
INSERT INTO estudantes
(nomeEstudantes, idadeEstudantes, mensalidadeEstudantes, notaEstudantes) values ("Bia",23,200,10);
INSERT INTO estudantes
(nomeEstudantes, idadeEstudantes, mensalidadeEstudantes, notaEstudantes) values ("Elo",19,300,10);
INSERT INTO estudantes
(nomeEstudantes, idadeEstudantes, mensalidadeEstudantes, notaEstudantes) values ("Henrique",30,100,10);
INSERT INTO estudantes
(nomeEstudantes, idadeEstudantes, mensalidadeEstudantes, notaEstudantes) values ("Renan",25,400,6);
INSERT INTO estudantes
(nomeEstudantes, idadeEstudantes, mensalidadeEstudantes, notaEstudantes) values ("Bersano",25,300,6);
INSERT INTO estudantes
(nomeEstudantes, idadeEstudantes, mensalidadeEstudantes, notaEstudantes) values ("Luiza",18,300,10);
INSERT INTO estudantes
(nomeEstudantes, idadeEstudantes, mensalidadeEstudantes, notaEstudantes) values ("Andre",18,150,6);

SELECT nomeEstudantes,notaEstudantes FROM estudantes WHERE notaEstudantes > 7;

SELECT nomeEstudantes,notaEstudantes FROM estudantes WHERE notaEstudantes < 7;

UPDATE estudantes SET notaEstudantes=4 WHERE idEstudantes = 1;