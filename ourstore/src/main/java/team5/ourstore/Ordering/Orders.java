package team5.ourstore.Ordering;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Orders")
public class Orders {
    @Id
    @Column(name = "order_id")
    int order_id;
    
    @Column(name = "user_id")
    int user_id;

    @Column(name = "order_date")//Format: YYYY-MM-DD
    String order_date;
    
    @Column(name = "shipped_date")//YYYY-MM-DD
    String shipped_date;
}
