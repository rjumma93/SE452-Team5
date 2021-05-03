/*DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Categories;
DROP TABLE IF EXISTS Brands;
DROP TABLE IF EXISTS Products;
DROP TABLE IF EXISTS Inventory;
DROP TABLE IF EXISTS Promotion;
DROP TABLE IF EXISTS Income;
DROP TABLE IF EXISTS Order_items;

DROP SEQUENCE IF EXISTS hibernate_sequence;

CREATE SEQUENCE hibernate_sequence START WITH 100 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS Users(
	id serial PRIMARY KEY
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	email VARCHAR(64) UNIQUE,
	);
	
CREATE TABLE IF NOT EXISTS Orders(
	order_id serial PRIMARY KEY,
	user_id INT,
	order_date DATE,
	order_status VARCHAR(30),
	shipped_date DATE,
	FOREIGN KEY(user_id) references Users(id)
	);

CREATE TABLE IF NOT EXISTS Categories(
	category_id serial PRIMARY KEY,
	category_name VARCHAR(30)
	);
	
CREATE TABLE IF NOT EXISTS Brands(
	brand_id serial PRIMARY KEY,
	brand_name VARCHAR(30)
	);
	
CREATE TABLE IF NOT EXISTS Products(
	product_id serial PRIMARY KEY,
	product_name VARCHAR(64),
	brand_id INT,
	category_id INT,
	price DECIMAL,
	FOREIGN KEY(brand_id) REFERENCES Brands(brand_id),
	FOREIGN KEY(category_id) REFERENCES Categories(category_id)
	);
	
CREATE TABLE IF NOT EXISTS Inventory(
	product_id INT PRIMARY KEY,
	amt INT,
	FOREIGN KEY(product_id) REFERENCES Products(product_id)
	);
	
CREATE TABLE IF NOT EXISTS Promotion(
	promotion_id serial PRIMARY KEY,
	product_id INT,
	active BOOLEAN,
	percent float,
	FOREIGN KEY(product_id) REFERENCES Products(product_id)
	);
	
CREATE TABLE IF NOT EXISTS Income(
	product_id INT PRIMARY KEY,
	price float,
	FOREIGN KEY(product_id) REFERENCES Products(product_id)
	);
	
CREATE TABLE IF NOT EXISTS Order_items(
	order_id serial PRIMARY KEY,
	product_id INT,
	amt INT,
	price FLOAT,
	FOREIGN KEY(product_id) REFERENCES Products(product_id),
	FOREIGN KEY(order_id) REFERENCES Orders(order_id)
	);
*/