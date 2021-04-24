CREATE DATABASE db_pizzaria_legal;

USE db_pizzaria_legal;

CREATE TABLE tb_categoria(
	id INT NOT NULL AUTO_INCREMENT,
    tipo VARCHAR(20) NOT NULL,
    tamanho VARCHAR(20) NOT NULL,
    formato VARCHAR(15) NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE tb_pizza(
	id INT NOT NULL AUTO_INCREMENT,
    sabor VARCHAR(30) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    massa VARCHAR(20) NOT NULL,
    fk_categoria INT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (fk_categoria) REFERENCES db_pizzaria_legal.tb_categoria(id)
);

INSERT INTO tb_categoria (tipo,tamanho, formato) VALUES
("Doce","Média", "Redonda"),
("Salgada","Pequena", "Quadrada"),
("Vegana","Pequena", "Quadrada"),
("Crostini","Grande", "Redonda")
;

INSERT INTO tb_pizza (sabor, preco, massa,fk_categoria) VALUES
("Calabresa", 50.00,"Redonda",2),
("Portuguesa", 28.00,"Quadrada",2),
("Alecrim", 31.00,"Redonda",4),
("Brocólis", 55.00,"Quadrada",3),
("Brigadeiro", 32.00,"Redonda",1)
;

SELECT * FROM tb_pizza WHERE preco > 45;

SELECT * FROM tb_pizza WHERE  preco BETWEEN 29 AND 60;

SELECT * FROM tb_pizza WHERE sabor LIKE "C%";

SELECT * FROM tb_categoria INNER JOIN tb_pizza ON tb_categoria.id = tb_pizza.fk_categoria;

SELECT * FROM tb_categoria INNER JOIN tb_pizza ON tb_categoria.id = tb_pizza.fk_categoria WHERE tb_categoria.tipo LIKE "%Doce%";

