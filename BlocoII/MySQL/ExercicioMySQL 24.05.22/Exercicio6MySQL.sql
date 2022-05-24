CREATE DATABASE db_curso_da_minha_vida;

USE db_curso_da_minha_vida;

CREATE TABLE tb_categorias
(
id bigint auto_increment,
genero varchar(255),
marca varchar(255),
PRIMARY KEY(id)
)auto_increment = 1;

INSERT INTO tb_categorias ( genero, marca ) VALUES ("TI","Microsoft");
INSERT INTO tb_categorias ( genero, marca ) VALUES ("ADM","ContinhaBase");
INSERT INTO tb_categorias ( genero, marca ) VALUES ("Gastronomia","ComidaBase");
INSERT INTO tb_categorias ( genero, marca ) VALUES ("Design","Van Gogh Arts");
INSERT INTO tb_categorias ( genero, marca ) VALUES ("Investimento","PrimeiroMilhão");


CREATE TABLE tb_cursos 
(
id bigint auto_increment,
nome varchar(255),
valor decimal(6,2),
horas decimal(6,2),
dtentrada DATETIME DEFAULT NOW(),
categorias_id bigint,
PRIMARY KEY(id),
FOREIGN KEY (categorias_id) REFERENCES tb_categorias(id)
)AUTO_INCREMENT = 1;

INSERT INTO tb_cursos ( nome, valor, horas, categorias_id ) VALUES ("Curso de Java", 400, 8.5,  1);
INSERT INTO tb_cursos ( nome, valor, horas, categorias_id ) VALUES ("Curso de ADM", 300, 20.20,  2);
INSERT INTO tb_cursos ( nome, valor, horas, categorias_id ) VALUES ("Curso de Culinaria", 200, 10,  3);
INSERT INTO tb_cursos ( nome, valor, horas, categorias_id ) VALUES ("Curso de Design", 700, 8.5,  4);
INSERT INTO tb_cursos ( nome, valor, horas, categorias_id ) VALUES ("Curso de Investimento", 800, 8.5,  5);
INSERT INTO tb_cursos ( nome, valor, horas, categorias_id ) VALUES ("Curso de Python", 1000, 8.5,  1);
INSERT INTO tb_cursos ( nome, valor, horas, categorias_id ) VALUES ("Curso de Contabilidade", 1100, 8.5,  2);
INSERT INTO tb_cursos ( nome, valor, horas, categorias_id ) VALUES ("Curso de Tesouro Direto", 1200, 5,  3);

SELECT * FROM tb_cursos WHERE valor > 500;
SELECT * FROM tb_cursos WHERE valor BETWEEN 600 AND 1000;
SELECT * FROM tb_cursos WHERE nome LIKE "%J%";

SELECT * FROM tb_cursos INNER JOIN tb_categorias on tb_cursos.categorias_id = tb_categorias.id;
SELECT * FROM tb_cursos INNER JOIN tb_categorias on tb_cursos.categorias_id = tb_categorias.id WHERE genero LIKE "%ADM%";



