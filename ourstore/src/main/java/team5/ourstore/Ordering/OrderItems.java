package team5.ourstore.Ordering;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class OrderItems {
    @Id
    @Column(name = "order_id")
    int order_id;
    @Column(name = "product_id")
    int product_id;
    @Column(name = "amt")
    int amount;
    @Column(name = "price")
    float price;
}
