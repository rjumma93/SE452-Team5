package team5.ourstore.Ordering;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import team5.ourstore.Stock.Products;

@Data
@Table(name = "ShoppingCart")
@Document(collection = "ShoppingCart")
public class ShoppingCart {

	@Id @GeneratedValue
	private int cart_id;
	private int user_id;
	private List<Products> products = new ArrayList<Products>();
	private float price;

	@Override
	public String toString() {
		return String.format("price: %s", price);
	}
}