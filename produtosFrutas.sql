-- comando para criação de banco de dados
CREATE DATABASE db_quitanda; 

-- comando que indica ao mysql workbench o banco de dadOs
USE db_quitanda; 

CREATE TABLE tb_produtos(
id BIGINT AUTO_INCREMENT,
nome_produto VARCHAR(255),
-- aceita 6 numeros total inclui os depois da vígula e 2 depois da vígula
preco DECIMAL(6,2),

PRIMARY KEY(id)
);
-- comando que trás todos os dados da tabela de produtos
SELECT * FROM tb_produtos;

INSERT INTO tb_produtos(nome_produto, preco) VALUES ("Melão", 5.00), ("Banana", 7.00);

-- desativa o modo seguro do mysql e permite update e delete
SET SQL_SAFE_UPDATES = 0;

-- atualizaÇão de um dado dentro da minha tabela
UPDATE tb_produtos SET preco = 7.90 WHERE id=15;

