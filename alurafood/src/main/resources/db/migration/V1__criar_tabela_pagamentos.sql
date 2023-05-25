CREATE TABLE pagamentos (
id BIGINT NOT NULL ,
valor decimal(19,2) NOT NULL,
nome varchar(100) DEFAULT NULL,
numero varchar(19) DEFAULT NULL,
expiracao varchar(7) DEFAULT NULL,
codigo varchar(3) DEFAULT NULL,
status varchar(255) NOT NULL,
forma_de_pagamento_id BIGINT NOT NULL,
pedido_id BIGINT NOT NULL,
data_criacao TIMESTAMPTZ NOT NULL,
PRIMARY KEY (id)
);