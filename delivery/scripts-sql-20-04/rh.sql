CREATE DATABASE rh;

USE rh;

CREATE TABLE funcionarios (
id int AUTO_INCREMENT,	
cpf char(14) NOT NULL, 
nome varchar(50) NOT NULL, 
cargo varchar(50) NOT NULL, 
salario decimal(13,2) NOT NULL, 
email varchar(50) NOT NULL,
PRIMARY KEY (id)
);

INSERT INTO funcionarios (cpf,nome,cargo, salario, email) VALUES ("999.999.999.99","Julia", "Auxiliar de Escritório", 5759.45, "julia@mail.com");
INSERT INTO funcionarios (cpf,nome,cargo, salario, email) VALUES ("888.888.888.88","Maria", "Assistente Administrativo", 1800.50, "maria@mail.com");
INSERT INTO funcionarios (cpf,nome,cargo, salario, email) VALUES ("777.777.777.77","Juliana", "Auxiliar Admnistrativo", 3419.59, "juliana@mail.com");
INSERT INTO funcionarios (cpf,nome,cargo, salario, email) VALUES ("666.666.666.66","Manuela", "Gerente de Loja", 3571.45, "manuela@mail.com");
INSERT INTO funcionarios (cpf,nome,cargo, salario, email) VALUES ("555.555.555.55","Laura", "Assitente Comercial", 2525.17, "laura@mail.com");

SELECT * FROM funcionarios;
SELECT * FROM funcionarios WHERE salario > 2000;
SELECT * FROM funcionarios WHERE salario < 2000;

UPDATE funcionarios SET cpf = "222.222.222.22", nome = "Alicia",salario = 2500.20, email = "alicia@mail.com" WHERE cpf = "888.888.888.88";