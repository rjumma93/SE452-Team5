package team5.ourstore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Categories")
public class Categories {
    @Id
    @Column(name = "category_id")
    int id;

    @Column(name = "category_name")
    String name;
}
