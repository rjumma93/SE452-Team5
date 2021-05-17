package team5.ourstore.Stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Categories {
    @Id
    @Column(name = "category_id")
    int id;

    @Column(name = "category_name")
    String name;
}
