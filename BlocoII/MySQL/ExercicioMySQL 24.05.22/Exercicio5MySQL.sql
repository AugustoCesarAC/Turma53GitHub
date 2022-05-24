CREATE DATABASE db_construindo_vidas;

USE db_construindo_vidas;

CREATE TABLE tb_categorias
(
id bigint auto_increment,
tipo varchar(255),
fabricante varchar(255),
PRIMARY KEY(id)
)auto_increment = 1;

INSERT INTO tb_categorias ( tipo, fabricante ) VALUES ("Madeira Lona","LonaLand");
INSERT INTO tb_categorias ( tipo, fabricante ) VALUES ("Madeira Mogno","MognoLand");
INSERT INTO tb_categorias ( tipo, fabricante ) VALUES ("Madeira Cumaru","CumaruLand");
INSERT INTO tb_categorias ( tipo, fabricante ) VALUES ("Madeira Carvalho","CarvalhoLand");
INSERT INTO tb_categorias ( tipo, fabricante ) VALUES ("Madeira Cedro","CedroLand");


CREATE TABLE tb_produtos
(
id bigint auto_increment,
nome varchar(255),
valor decimal(6,2),
tamanho decimal(6,2),
dtentrada DATETIME DEFAULT NOW(),
categorias_id bigint,
PRIMARY KEY(id),
FOREIGN KEY (categorias_id) REFERENCES tb_categorias(id)
)AUTO_INCREMENT = 1;

INSERT INTO tb_produtos ( nome, valor, tamanho, categorias_id ) VALUES ("Cadeira", 55, 8.5,  1);
INSERT INTO tb_produtos ( nome, valor, tamanho, categorias_id ) VALUES ("Mesa", 65, 20.20,  2);
INSERT INTO tb_produtos ( nome, valor, tamanho, categorias_id ) VALUES ("Prancha", 50, 10,  3);
INSERT INTO tb_produtos ( nome, valor, tamanho, categorias_id ) VALUES ("Telha", 150, 8.5,  4);
INSERT INTO tb_produtos ( nome, valor, tamanho, categorias_id ) VALUES ("Cadeira Gamer", 90.50, 8.5,  5);
INSERT INTO tb_produtos ( nome, valor, tamanho, categorias_id ) VALUES ("Mesa Bem Rustica", 130, 8.5,  1);
INSERT INTO tb_produtos ( nome, valor, tamanho, categorias_id ) VALUES ("Prancha Diferente", 90.50, 8.5,  2);
INSERT INTO tb_produtos ( nome, valor, tamanho, categorias_id ) VALUES ("Cadeira Unica", 200, 5,  3);

SELECT * FROM tb_produtos WHERE valor > 100;
SELECT * FROM tb_produtos WHERE valor BETWEEN 70 AND 150;
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categorias_id = tb_categorias.id;
SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categorias_id = tb_categorias.id WHERE fabricante LIKE "%Mogno%";



