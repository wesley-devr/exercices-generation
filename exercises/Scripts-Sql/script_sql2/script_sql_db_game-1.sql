CREATE DATABASE db_generation_game_online;

USE db_generation_game_online;

CREATE TABLE tb_classe(
	id INT AUTO_INCREMENT NOT NULL,
	nome VARCHAR(50) NOT NULL, 
    raca VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE tb_personagem(
	id INT NOT NULL,
    nome VARCHAR(50) NOT NULL,
	vida FLOAT NOT NULL,
	defesa FLOAT NOT NULL,
    ataque FLOAT NOT NULL,
    agilidade FLOAT NOT NULL,
    fk_tb_classe INT,
    PRIMARY KEY(id),
    FOREIGN KEY (fk_tb_classe) REFERENCES tb_classe(id)
);

INSERT INTO tb_classe (nome,raca) VALUES ("Assasino","Humano");
INSERT INTO tb_classe (nome,raca) VALUES ("Cacador","Humano");
INSERT INTO tb_classe (nome,raca) VALUES ("Mago","Elfo");
INSERT INTO tb_classe (nome,raca) VALUES ("Feiticeiro","Elfo");
INSERT INTO tb_classe (nome,raca) VALUES ("Bruxo","Elfo");

INSERT INTO tb_personagem (id,nome, vida, defesa, ataque, agilidade,fk_tb_classe) VALUES (1,"Vecna",3000,1800,2300,1500,2);
INSERT INTO tb_personagem (id,nome, vida, defesa, ataque, agilidade,fk_tb_classe) VALUES (2,"Chloe Frazer",3000,2500,2500,1500,5);
INSERT INTO tb_personagem (id,nome, vida, defesa, ataque, agilidade,fk_tb_classe) VALUES (3,"Iggwilv",2000,1100,1500,1000,3);
INSERT INTO tb_personagem (id,nome, vida, defesa, ataque, agilidade,fk_tb_classe) VALUES (4,"Tidus",1500,1200,1800,800,2);
INSERT INTO tb_personagem (id,nome, vida, defesa, ataque, agilidade,fk_tb_classe) VALUES (5,"Capitao Atomo",2200,900,2100,700,1);
INSERT INTO tb_personagem (id,nome, vida, defesa, ataque, agilidade,fk_tb_classe) VALUES (6,"Caramon",1900,800,1550,2000,4);

SELECT * FROM tb_personagem WHERE ataque > 2000;

SELECT * FROM tb_personagem WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagem WHERE nome LIKE "C%";

SELECT * FROM tb_classe INNER JOIN tb_personagem ON tb_classe.id = tb_personagem.fk_tb_classe;

SELECT * FROM tb_classe INNER JOIN tb_personagem ON tb_classe.id = tb_personagem.fk_tb_classe WHERE tb_classe.nome LIKE "%Cacador%";


