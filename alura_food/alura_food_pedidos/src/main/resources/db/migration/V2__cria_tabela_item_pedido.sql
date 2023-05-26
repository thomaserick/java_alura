CREATE TABLE item_do_pedido (
  id bigint NOT NULL,
  descricao varchar(255) DEFAULT NULL,
  quantidade integer NOT NULL,
  pedido_id bigint NOT NULL,
  PRIMARY KEY (id)
)