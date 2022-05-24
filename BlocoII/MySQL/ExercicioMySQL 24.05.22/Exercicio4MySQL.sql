CREATE DATABASE db_cidade_dos_vegetais;

USE db_cidade_dos_vegetais;

CREATE TABLE tb_categorias
(
id bigint auto_increment,
fazenda varchar(255),
qualidade varchar(255),
PRIMARY KEY(id)
)auto_increment = 1;

INSERT INTO tb_categorias ( fazenda, qualidade ) VALUES ("Fazenda do Ronaldo","Ótimas");
INSERT INTO tb_categorias ( fazenda, qualidade ) VALUES ("Fazenda do Ronaldinho","Bonzinho");
INSERT INTO tb_categorias ( fazenda, qualidade ) VALUES ("Fazenda do Cristiano Ronaldo","Media");
INSERT INTO tb_categorias ( fazenda, qualidade ) VALUES ("Fazenda do Zézinho","Ruim");
INSERT INTO tb_categorias ( fazenda, qualidade ) VALUES ("Fazenda do Gus","Pessima");

CREATE TABLE tb_produtos
(
id bigint auto_increment,
nome varchar(255),
peso decimal(6,2),
valor DECIMAL(6,2),
dtvalidade DATE,
categorias_id bigint,
PRIMARY KEY(id),
FOREIGN KEY (categorias_id) REFERENCES tb_categorias(id)
)AUTO_INCREMENT = 1;

INSERT INTO tb_produtos ( nome, peso, valor, dtvalidade, categorias_id ) VALUES ("Tomate", 200, 9.99, "2022-06-15", 1);
INSERT INTO tb_produtos ( nome, peso, valor, dtvalidade, categorias_id ) VALUES ("Pepino", 30, 19.99, "2022-06-05", 2);
INSERT INTO tb_produtos ( nome, peso, valor, dtvalidade, categorias_id ) VALUES ("Cebola", 300, 35.99, "2022-06-10", 3);
INSERT INTO tb_produtos ( nome, peso, valor, dtvalidade, categorias_id ) VALUES ("Cenoura", 40, 45, "2022-07-11", 4);
INSERT INTO tb_produtos ( nome, peso, valor, dtvalidade, categorias_id ) VALUES ("Xuxu", 250, 60.99, "2022-07-21", 5);
INSERT INTO tb_produtos ( nome, peso, valor, dtvalidade, categorias_id ) VALUES ("Alho", 175.30, 75.99, "2022-05-27", 1);
INSERT INTO tb_produtos ( nome, peso, valor, dtvalidade, categorias_id ) VALUES ("Pimentão", 175.30, 45.50, "2022-06-02", 2);
INSERT INTO tb_produtos ( nome, peso, valor, dtvalidade, categorias_id ) VALUES ("Alface", 990, 500.99, "2022-07-05", 3);

SELECT * FROM tb_produtos WHERE valor > 50;
SELECT * FROM tb_produtos WHERE valor BETWEEN 50 AND 150;
SELECT * FROM tb_produtos WHERE nome LIKE "%C%";

SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categorias_id = tb_categorias.id;
SELECT * FROM tb_produtos INNER JOIN tb_categorias on tb_produtos.categorias_id = tb_categorias.id WHERE qualidade LIKE "%timas%";



