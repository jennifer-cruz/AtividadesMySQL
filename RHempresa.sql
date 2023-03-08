CREATE DATABASE db_rh_empresa;

USE db_rh_empresa;

CREATE TABLE tb_colaboradores(
id BIGINT AUTO_INCREMENT,
	nome_colaborador VARCHAR(255),
    idade INT,
    salario DECIMAL(6,2),
    admissão DATE,
    
    PRIMARY KEY (id)
);

SELECT * FROM tb_colaboradores;

INSERT INTO tb_colaboradores(nome_colaborador, idade, salario, admissão) VALUES 
("Gabriella", 22, 3100.00, "2019-05-14"), 
("Troy", 31, 3200.00, "2021-02-12"), 
("Ryan", 24, 2500.00, "2021-12-15"), 
("Sharpey", 27, 1300.00, "2021-08-26"), 
("Kelse", 27, 4400.00, "2022-07-23");

SET SQL_SAFE_UPDATES = 0;

UPDATE tb_colaboradores SET salario = 2000.00 WHERE id=2;

SELECT * FROM tb_colaboradores WHERE salario >= 2000;

SELECT * FROM tb_colaboradores WHERE salario < 2000;

