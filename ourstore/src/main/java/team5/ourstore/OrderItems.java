package team5.ourstore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Order_items")
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
