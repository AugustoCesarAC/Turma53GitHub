CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;
-- DROP DATABASE db_pizzaria_legal;
CREATE TABLE tb_categorias
(
id BIGINT NOT NULL AUTO_INCREMENT,
tamanho VARCHAR(255),
tipo VARCHAR(255),
PRIMARY KEY (id)
)AUTO_INCREMENT = 1;

CREATE TABLE tb_pizzas
(
id BIGINT NOT NULL AUTO_INCREMENT,
nome VARCHAR(255),
borda VARCHAR(255),
valor DECIMAL (6,2),
descricao VARCHAR(255),
categorias_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (categorias_id) REFERENCES tb_categorias(id)
)AUTO_INCREMENT = 1;

INSERT INTO tb_categorias (tamanho, tipo) VALUES ("Grande","Salgado");
INSERT INTO tb_categorias (tamanho, tipo) VALUES ("Media","Doce");
INSERT INTO tb_categorias (tamanho, tipo) VALUES ("Broto","Salgado");
INSERT INTO tb_categorias (tamanho, tipo) VALUES ("Familia","Doce");
INSERT INTO tb_categorias (tamanho, tipo) VALUES ("Pizza Hambuguer","Salgado");

INSERT INTO tb_pizzas (nome, borda, valor, descricao, categorias_id) VALUES ("Calabresa", TRUE, 32.99, "Calabrase e Cebola", 1);
INSERT INTO tb_pizzas (nome, borda, valor, descricao, categorias_id) VALUES ("Mussarela", FALSE, 34.99, "Mussarela e Azeitona", 3);
INSERT INTO tb_pizzas (nome, borda, valor, descricao, categorias_id) VALUES ("Chocolate", TRUE, 58.99, "Muito chocolate", 4);
INSERT INTO tb_pizzas (nome, borda, valor, descricao, categorias_id) VALUES ("Mussarela", FALSE, 36.99, "Mussarela e Azeitona", 3);
INSERT INTO tb_pizzas (nome, borda, valor, descricao, categorias_id) VALUES ("Frango", TRUE, 35.99, "Frango e Cebola", 1);
INSERT INTO tb_pizzas (nome, borda, valor, descricao, categorias_id) VALUES ("M&M", FALSE, 68.99, "M&M e Chocolate", 2);
INSERT INTO tb_pizzas (nome, borda, valor, descricao, categorias_id) VALUES ("Calabresa Turbinada", TRUE, 80.99, "Muita Calabrase e Cebola", 3);
INSERT INTO tb_pizzas (nome, borda, valor, descricao, categorias_id) VALUES ("Calabresa Turbinada", FALSE, 39.99, "Muita Calabrase e Cebola", 1);

SELECT * FROM tb_pizzas WHERE valor > 45;
SELECT * FROM tb_pizzas WHERE valor BETWEEN 50 AND 100;
SELECT * FROM tb_pizzas WHERE nome LIKE "%M%";

SELECT * FROM tb_pizzas INNER JOIN tb_categorias on tb_pizzas.categorias_id = tb_categorias.id;
SELECT * FROM tb_pizzas INNER JOIN tb_categorias on tb_pizzas.categorias_id = tb_categorias.id WHERE tipo LIKE "%Salgado%";




