
CREATE TABLE IF NOT EXISTS users(
	id INT UNIQUE PRIMARY KEY
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	email VARCHAR(64) UNIQUE,
	);
	
CREATE TABLE IF NOT EXISTS orders(
	order_id INT PRIMARY KEY,
	user_id INT,
	order_date DATE,
	order_status VARCHAR(30),
	shipped_date DATE,
	FOREIGN KEY(user_id) references users(id)
	);

CREATE TABLE IF NOT EXISTS categories(
	category_id INT PRIMARY KEY,
	category_name VARCHAR(30)
	);
	
CREATE TABLE IF NOT EXISTS brands(
	brand_id INT PRIMARY KEY,
	brand_name VARCHAR(30)
	);
	
CREATE TABLE IF NOT EXISTS products(
	product_id INT PRIMARY KEY,
	product_name VARCHAR(64),
	brand_id INT,
	category_id INT,
	price INT,
	FOREIGN KEY(brand_id) REFERENCES brands(brand_id),
	FOREIGN KEY(category_id) REFERENCES categories(category_id)
	);
	
CREATE TABLE IF NOT EXISTS inventory(
	product_id INT,
	amt INT,
	FOREIGN KEY(product_id) REFERENCES products(product_id)
	);
	
CREATE TABLE IF NOT EXISTS promotion(
	promotion_id INT PRIMARY KEY,
	product_id INT,
	active BOOLEAN,
	percent float,
	FOREIGN KEY(product_id) REFERENCES products(product_id)
	);
	
CREATE TABLE IF NOT EXISTS sales(
	product_id INT,
	price int,
	date_purchased DATE,
	FOREIGN KEY(product_id) REFERENCES products(product_id)
	);
	
CREATE TABLE IF NOT EXISTS order_items(
	order_id INT PRIMARY KEY,
	product_id INT,
	amt INT,
	price FLOAT,
	FOREIGN KEY(product_id) REFERENCES products(product_id),
	FOREIGN KEY(order_id) REFERENCES orders(order_id)
	);
	