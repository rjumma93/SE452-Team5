
DROP TABLE IF EXISTS Product_Review;
DROP TABLE IF EXISTS Payment_Info;
DROP TABLE IF EXISTS Shipping_Info;
DROP TABLE IF EXISTS Shopping_Cart;
DROP TABLE IF EXISTS Category;
DROP TABLE IF EXISTS Brand;

CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS Product_Review(
	review_id INT AUTO_INCREMENT PRIMARY KEY,
	product_id INT,
	review VARCHAR(100),
	reviewer VARCHAR(50),
	review_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	rating INT,
	FOREIGN KEY(product_id) REFERENCES Products(product_id)
	);

CREATE TABLE IF NOT EXISTS Payment_Info(
	payment_id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT,
	card_number CHAR(16),
	security_num CHAR(3),
	zip CHAR(5),
	exp_date CHAR(5),
	FOREIGN KEY(user_id) REFERENCES Users(user_id),
	);


CREATE TABLE IF NOT EXISTS Shipping_Info(
	shipping_id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT,
	street_address VARCHAR(50),
	city VARCHAR(50),
	state CHAR(2),
	zip CHAR(5),
	FOREIGN KEY(user_id) REFERENCES Users(user_id)
	);
	
CREATE TABLE IF NOT EXISTS Shopping_Cart(
	cart_id INT AUTO_INCREMENT PRIMARY KEY,
	user_id INT,
	product1_id INT,
	product2_id INT,
	product3_id INT,
	product4_id INT,
	product5_id INT,
	price NUMERIC(5, 2),
	FOREIGN KEY(user_id) REFERENCES Users(user_id)
	);	
	
CREATE TABLE IF NOT EXISTS Categories(
	category_id INT AUTO_INCREMENT PRIMARY KEY,
	category_name VARCHAR(30)
	);
	
CREATE TABLE IF NOT EXISTS Brands(
	brand_id INT AUTO_INCREMENT PRIMARY KEY,
	brand_name VARCHAR(30)
	);