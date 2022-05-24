CREATE DATABASE db_farmacia_bem_estar;

USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias
(
id bigint auto_increment,
departamento varchar(255),
fabricante varchar(255),
PRIMARY KEY(id)
)auto_increment = 1;

INSERT INTO tb_categorias ( departamento, fabricante ) VALUES ("Cosmeticos","Renans Shampoos");
INSERT INTO tb_categorias ( departamento, fabricante ) VALUES ("Oftalmo","Olhos Bia");
INSERT INTO tb_categorias ( departamento, fabricante ) VALUES ("Fitness","Elo Academia");
INSERT INTO tb_categorias ( departamento, fabricante ) VALUES ("Idoso","Augusto Idosos");
INSERT INTO tb_categorias ( departamento, fabricante ) VALUES ("Perfumaria","Well Churras");

CREATE TABLE tb_produtos
(
id bigint auto_increment,
nome varchar(255),
volume decimal(6,2),
valor DECIMAL(6,2),
generico Boolean,
categorias_id bigint,
PRIMARY KEY(id),
FOREIGN KEY (categorias_id) REFERENCES tb_categorias(id)
)AUTO_INCREMENT = 1;

INSERT INTO tb_produtos ( nome, volume, valor, generico, categorias_id ) VALUES ("Shampoo do Bom", 175.30, 9.99, false, 1);
INSERT INTO tb_produtos ( nome, volume, valor, generico, categorias_id ) VALUES ("Colirio do Bom", 30, 19.99, false, 2);
INSERT INTO tb_produtos ( nome, volume, valor, generico, categorias_id ) VALUES ("Peso do Bom", 1000, 35.99, true, 3);
INSERT INTO tb_produtos ( nome, volume, valor, generico, categorias_id ) VALUES ("Pilula que aumenta a pressão", 50, 55, true, 4);
INSERT INTO tb_produtos ( nome, volume, valor, generico, categorias_id ) VALUES ("Perfume do caro", 250, 60.99, false, 5);
INSERT INTO tb_produtos ( nome, volume, valor, generico, categorias_id ) VALUES ("Shampoo do Caríssimo", 175.30, 75.99, false, 1);
INSERT INTO tb_produtos ( nome, volume, valor, generico, categorias_id ) VALUES ("Colirio do Caríssimo", 175.30, 45.50, false, 2);
INSERT INTO tb_produtos ( nome, volume, valor, generico, categorias_id ) VALUES ("Peso do ruim", 990, 5.99, true, 3);

SELECT * FROM tb_produtos WHERE valor > 60;
SELECT * FROM tb_produtos WHERE valor BETWEEN 5 AND 60;
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categorias_id = tb_categorias.id;
SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categorias_id = tb_categorias.id WHERE departamento LIKE "%Cosmet%";



