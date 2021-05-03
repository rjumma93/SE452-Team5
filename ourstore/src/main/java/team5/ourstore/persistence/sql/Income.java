package team5.ourstore.persistence.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Income")
public class Income {
    @Id
    @Column(name = "product_id")
    int income_id;
    @Column(name = "price")
    float price;
}
