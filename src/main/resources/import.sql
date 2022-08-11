INSERT INTO tb_category (name) VALUES ('Livros');
INSERT INTO tb_category (name) VALUES ('Eletrônicos');
INSERT INTO tb_category (name) VALUES ('Computadores');

INSERT INTO tb_product (name, price) VALUES ('The Lord of the Rings', 90.5);
INSERT INTO tb_product (name, price) VALUES ('Smart TV', 2190.0);
INSERT INTO tb_product (name, price) VALUES ('Macbook Pro', 1250.0);
INSERT INTO tb_product (name, price) VALUES ('PC Gamer', 1200.0);

INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 1);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 2);
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 3);
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 3);
