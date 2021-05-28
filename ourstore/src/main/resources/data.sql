INSERT Into admins(admin_id, email, passwords) VALUES
(0, 'firewall@four.com', 'secret');

INSERT Into brands(brand_id, brand_name) VALUES
(1, 'Guchi'),
(2, 'Nice'),
(3, 'Luis V'),
(4, 'Sonie'),
(5, 'Pear'),
(6, 'GL');

INSERT INTO Customer(id, first_name, last_name, email, passwords) VALUES
(1, 'John', 'Smith' , 'jsmith@gmail.com', '1234'),
(2, 'Jane', 'Doe', 'jdoe123@gmail.com', 'password');

INSERT Into categories(category_id, category_name) VALUES
(1, 'Shoes'),
(2, 'Shirts'),
(3, 'Electronics');

INSERT INTO products(product_id, brand_id, category_id, price, product_name) VALUES
(1,1,1,80.00,'Black'),
(2,1,1,55.00,'Strip'),
(3,1,1,60.00,'Neon'),
(4,1,2,80,'Pink'),
(5,1,2,80,'Pride'),
(6,1,2,80,'Zebra'),
(7,2,1,75,'Running'),
(8,2,1,75,'Casual'),
(9,2,2,75,'Athletic'),
(10,2,2,75,'Loose'),
(11,3,2,250,'Basic'),
(12,3,2,500,'Weird'),
(13,4,3,500,'PS6'),
(14,4,3,100,'Controler'),
(15,4,3,80,'Membership'),
(16,5,3,500,'Phone'),
(17,5,3,200,'Watch'),
(18,6,3,900,'Washing Machine'),
(19,6,3,900,'Dryer'),
(20,6,3,1000,'Fridge');


















