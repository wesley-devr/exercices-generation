CREATE DATABASE ecommerce;

USE ecommerce;

CREATE TABLE produtos(
nome varchar(50) NOT NULL,
categoria varchar(50) NOT NULL,
marca varchar(15) NOT NULL,
cor varchar(30) NOT NULL,
preco decimal(13,2)
);

INSERT INTO produtos (nome,categoria, marca,cor,preco) VALUES("galaxy a10","smartphone","samsung","azul",1200);
INSERT INTO produtos (nome,categoria, marca,cor,preco) VALUES("galaxy a30s","smartphone","samsung","cinza",1499);
INSERT INTO produtos (nome,categoria, marca,cor,preco) VALUES("moto g8","smartphone","motorola","vermelho",480);
INSERT INTO produtos (nome,categoria, marca,cor,preco) VALUES("moto e6","smartphone","motorola","amarelo",320);
INSERT INTO produtos (nome,categoria, marca,cor,preco) VALUES("iPhone 11","smartphone","apple","amarelo",5000);
INSERT INTO produtos (nome,categoria, marca,cor,preco) VALUES("iPhone 7","smartphone","apple","vermelho",2000);
INSERT INTO produtos (nome,categoria, marca,cor,preco) VALUES("iPhone 6","smartphone","apple","cinza",1500);
INSERT INTO produtos (nome,categoria, marca,cor,preco) VALUES("iPhone SE","smartphone","apple","vermelho",2200);

SELECT * FROM produtos WHERE preco > 500;
SELECT * FROM produtos WHERE preco < 500;

UPDATE produtos SET nome = "galaxy a20", categoria = "smartphone", preco = 1350.20 where nome = "galaxy a10";