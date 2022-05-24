CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;
-- DROP DATABASE db_generation_game_online;
CREATE TABLE tb_classe
(
id BIGINT NOT NULL AUTO_INCREMENT ,
tipo VARCHAR(255),
raca VARCHAR(255),
PRIMARY KEY(id)
)auto_increment=1;

CREATE TABLE tb_personagens
(
id BIGINT NOT NULL AUTO_INCREMENT ,
nome VARCHAR(255),
ataque BIGINT(20),
defesa BIGINT(20),
vida BIGINT (20),
classe_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (classe_id) REFERENCES tb_classe(id)
);

INSERT INTO tb_classe (tipo, raca) VALUES ("Guerreiro","Orc");
INSERT INTO tb_classe (tipo, raca) VALUES ("Mago","High Elf");
INSERT INTO tb_classe (tipo, raca) VALUES ("Ladrão","Wood Elf");
INSERT INTO tb_classe (tipo, raca) VALUES ("Arqueiro","Wood Elf");
INSERT INTO tb_classe (tipo, raca) VALUES ("Mago","Dark Elf");

INSERT INTO tb_personagens (nome, ataque, defesa, vida, classe_id) VALUES ("CrazyReizor",3000, 3000, 5000, 4);
INSERT INTO tb_personagens (nome, ataque, defesa, vida, classe_id) VALUES ("Reizorzinho",1500, 1000, 1000, 3);
INSERT INTO tb_personagens (nome, ataque, defesa, vida, classe_id) VALUES ("NACrazyReizor",2500, 1500, 2000, 2);
INSERT INTO tb_personagens (nome, ataque, defesa, vida, classe_id) VALUES ("Crazy",1700, 2000, 3000, 1);
INSERT INTO tb_personagens (nome, ataque, defesa, vida, classe_id) VALUES ("Reizor",2200, 1500, 2000, 4);
INSERT INTO tb_personagens (nome, ataque, defesa, vida, classe_id) VALUES ("CrazyRazor",4000, 1600, 1500, 5);
INSERT INTO tb_personagens (nome, ataque, defesa, vida, classe_id) VALUES ("CalmReizor",1500, 1300, 1750, 5);
INSERT INTO tb_personagens (nome, ataque, defesa, vida, classe_id) VALUES ("CalmRazor",1500, 2000, 2000, 5);


SELECT * FROM tb_personagens WHERE ataque > 2000;
SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;
SELECT * FROM tb_personagens WHERE nome LIKE "%C%";
SELECT * FROM tb_personagens INNER JOIN tb_classe on tb_personagens.classe_id = tb_classe.id;
SELECT * FROM tb_personagens INNER JOIN tb_classe on tb_personagens.classe_id = tb_classe.id WHERE tb_classe.tipo LIKE "%Arqueiro%";


