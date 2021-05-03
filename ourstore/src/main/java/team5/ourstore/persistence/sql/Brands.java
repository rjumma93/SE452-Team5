package team5.ourstore.persistence.sql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="Brands")
public class Brands {
    @Id
    @Column(name = "brand_id")
    int id;
    @Column(name = "brand_name")
    String name;
}
