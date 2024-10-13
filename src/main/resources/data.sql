INSERT INTO categoria (id, nome) VALUES (1, 'Eletrônicos');
INSERT INTO categoria (id, nome) VALUES (2, 'Roupas');
INSERT INTO categoria (id, nome) VALUES (3, 'Alimentos');

-- Insere produtos
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (1, 'Smartphone', 1999.99, 1);
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (2, 'Laptop', 4999.99, 1);
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (3, 'Camiseta', 49.99, 2);
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (4, 'Calça Jeans', 89.99, 2);
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (5, 'Maçã', 2.99, 3);
INSERT INTO produto (id, nome, preco, categoria_id) VALUES (6, 'Pão', 3.49, 3);