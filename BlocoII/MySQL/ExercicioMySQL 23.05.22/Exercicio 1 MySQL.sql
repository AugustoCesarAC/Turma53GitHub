create database DB_RH;
use DB_RH;
create table colaboradores 
(
idColaborador mediumint(8) unsigned NOT NULL auto_increment,
nomeColaborador varchar(255),
CPFColaborador mediumint(11),
funcaoColaborador varchar(255),
salarioColaborador mediumint(10),
numColaborador mediumint(1) default 1,
primary key (idColaborador)
)auto_increment=1;

insert into colaboradores
(nomeColaborador, CPFColaborador, funcaoColaborador, salarioColaborador, numColaborador) values ("Renan",741812,"Dev Jr",1500,1);
insert into colaboradores
(nomeColaborador, CPFColaborador, funcaoColaborador, salarioColaborador, numColaborador) values ("Bia",457015,"Dev Jr",3000,1);
insert into colaboradores
(nomeColaborador, CPFColaborador, funcaoColaborador, salarioColaborador, numColaborador) values ("Augusto",441059,"Dev Jr",5000,1);
insert into colaboradores
(nomeColaborador, CPFColaborador, funcaoColaborador, salarioColaborador, numColaborador) values ("Well",47402,"Dev Jr",1500,1);
insert into colaboradores
(nomeColaborador, CPFColaborador, funcaoColaborador, salarioColaborador, numColaborador) values ("Camis",12348,"Dev Jr",3000,1);
insert into colaboradores
(nomeColaborador, CPFColaborador, funcaoColaborador, salarioColaborador, numColaborador) values ("Bersano",84325,"Dev Jr",1200,1);

select nomeColaborador,salarioColaborador FROM colaboradores WHERE salarioColaborador > 2000;

select nomeColaborador,salarioColaborador FROM colaboradores WHERE salarioColaborador < 2000;

update colaboradores SET salarioColaborador=1600 where idColaborador = 4;