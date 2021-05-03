package team5.ourstore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Inventory")
public class Inventory {
    @Id
    @Column(name = "product_id")
    int id;
    @Column(name = "amt")
    int amount;
}
