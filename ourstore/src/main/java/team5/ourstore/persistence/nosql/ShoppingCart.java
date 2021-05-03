package team5.ourstore.persistence.nosql;
import team5.ourstore.persistence.sql.Products;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Table(name = "ShoppingCart")
@Document(collection = "ShoppingCart")
public class ShoppingCart {

	@Id @GeneratedValue
	private int cart_id;
	private int user_id;
	private List<Products> products = new ArrayList<Products>();
	private float price;
}