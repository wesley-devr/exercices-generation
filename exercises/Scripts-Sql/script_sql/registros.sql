CREATE DATABASE registros_escola;

USE registros_escola;

CREATE TABLE alunos(
    id int NOT NULL AUTO_INCREMENT,
    nome varchar(45) NOT NULL,
    idade int NOT NULL,
    cpf char(14) NOT NULL,
    email varchar(50) NOT NULL,
    nota decimal(2,1),
    PRIMARY KEY (id)
);

INSERT INTO alunos (nome,idade,cpf,email,nota) VALUES("Lavinia",20,"999.999.999.99", "lavinia@mail.com", 7.8);
INSERT INTO alunos (nome,idade,cpf,email,nota) VALUES ("Fabiana", 15, "888.888.888.88", "fabiana@gmail.com", 8.0);
INSERT INTO alunos (nome,idade,cpf,email,nota) VALUES("Flavia", 16, "777.777.777.77", "flavia@gmail.com", 6.0);
INSERT INTO alunos (nome,idade,cpf,email,nota) VALUES("Larissa", 15, "666.666.666.66", "larissa@gmail.com", 8.0);
INSERT INTO alunos (nome,idade,cpf,email,nota) VALUES("Clara", 17, "555.555.555.55", "clara@gmail.com", 7.0);
INSERT INTO alunos (nome,idade,cpf,email,nota) VALUES("Beatriz", 18, "111.111.111.11", "fabiana@gmail.com", 8.0);
INSERT INTO alunos (nome,idade,cpf,email,nota) VALUES("Marli", 17, "222.222.222.22", "marli@gmail.com", 6.0);
INSERT INTO alunos (nome,idade,cpf,email,nota) VALUES("Luana", 15, "333.333.333.33", "luana@gmail.com", 8.0);

SELECT * FROM alunos WHERE nota > 7.0;
SELECT * FROM alunos WHERE nota < 7.0;
