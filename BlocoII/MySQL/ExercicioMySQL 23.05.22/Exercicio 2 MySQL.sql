create database DB_ecommerce;
use DB_ecommerce;
create table produtos 
(
idProduto mediumint(8) unsigned NOT NULL auto_increment,
nomeProduto varchar(255),
categoriaProduto varchar(255),
valorProduto mediumint(10),
qntProduto mediumint(4),
primary key (idProduto)
)auto_increment=1;

insert into produtos
(nomeProduto, categoriaProduto, valorProduto, qntProduto) values ("Maçã","Hortifruiti",2,50);
insert into produtos
(nomeProduto, categoriaProduto, valorProduto, qntProduto) values ("Laranja","Hortifruit",4,150);
insert into produtos
(nomeProduto, categoriaProduto, valorProduto, qntProduto) values ("PC Gamer","Gamer",7000,4);
insert into produtos
(nomeProduto, categoriaProduto, valorProduto, qntProduto) values ("PC Gamer v2","Gamer",14000,2);
insert into produtos
(nomeProduto, categoriaProduto, valorProduto, qntProduto) values ("Hersheys","Chocolate",5,50);
insert into produtos
(nomeProduto, categoriaProduto, valorProduto, qntProduto) values ("Lacta","Chocolate",3,50);
insert into produtos
(nomeProduto, categoriaProduto, valorProduto, qntProduto) values ("TV","Eletrodomestico",3500,20);
insert into produtos
(nomeProduto, categoriaProduto, valorProduto, qntProduto) values ("Liquidificador","Eletrodomestico",200,30);

SELECT nomeProduto,valorProduto FROM produtos WHERE valorProduto > 500;

select nomeProduto,valorProduto FROM produtos WHERE valorProduto < 500;

update produtos SET valorProduto=4 where idProduto = 1;