package team5.ourstore.Ordering;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Table(name="ShippingInfo")
@Document(collection = "ShippingInfo")
public class ShippingInfo {

	@Id @GeneratedValue
	private int shipping_id;
	private int user_id;
	private String street_address;
	private String city;
	private String state;
	@Digits (integer = 5, fraction = 0)
	private int zip;

	@Override
	public String toString() {
		return String.format("street address: %s, city: %s, state: %s", street_address, city, state);
	}
}