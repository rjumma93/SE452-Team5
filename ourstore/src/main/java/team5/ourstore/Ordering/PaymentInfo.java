package team5.ourstore.Ordering;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="PaymentInfo")
@Document(collection = "PaymentInfo")
public class PaymentInfo {

	@Id @GeneratedValue
	private int payment_id;
	private int user_id;
	@Digits(integer = 16, fraction = 0)
	private long card_number;
	@Digits(integer = 3, fraction = 0)
	private int security_num;
	@Digits (integer = 5, fraction = 0)
	private int zip;
	private Date exp_date;

	@Override
	public String toString() {
		return String.format("card number: %s", card_number);
	}
}