CREATE DATABASE db_farmacia_do_bem;

USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id INT NOT NULL AUTO_INCREMENT,
	tipo VARCHAR(45) NOT NULL, 
    PRIMARY KEY(id)
);

CREATE TABLE tb_produto(
	id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    marca VARCHAR(45) NOT NULL,
    peso VARCHAR(10) NOT NULL,
    fk_categoria INT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY (fk_categoria) REFERENCES db_farmacia_do_bem.tb_categoria(id)
);

INSERT INTO tb_categoria (tipo) VALUES ("Genéricos");
INSERT INTO tb_categoria (tipo) VALUES ("Vitaminas");
INSERT INTO tb_categoria (tipo) VALUES ("Suplementos Alimentares");
INSERT INTO tb_categoria (tipo) VALUES ("Higiene Pessoal");
INSERT INTO tb_categoria (tipo) VALUES ("Cosméticos");

INSERT INTO tb_produto (nome, preco, marca, fk_categoria) VALUES ("Creme dental","200g","Colgate",4);
INSERT INTO tb_produto (nome, preco, marca, fk_categoria) VALUES ("Shampoo","300ml","Gold",4);
INSERT INTO tb_produto (nome, preco, marca, fk_categoria) VALUES ("Condicionador","100ml","Gold",4);
INSERT INTO tb_produto (nome, preco, marca, fk_categoria) VALUES ("Protetor Solar","200ml","Sundown",5);
INSERT INTO tb_produto (nome, preco, marca, fk_categoria) VALUES ("Loção hidratante","300ml","Boticário",5);
INSERT INTO tb_produto (nome, preco, marca, fk_categoria) VALUES ("Desodorante",8.00,"90g",4);

SELECT * FROM tb_produto WHERE preco > 50;

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_produto WHERE nome LIKE "B%";

SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.id = tb_produto.fk_categoria;

SELECT * FROM tb_categoria INNER JOIN tb_produto ON tb_categoria.id = tb_produto.fk_categoria WHERE tb_categoria.tipo LIKE "%Cosméticos%";
