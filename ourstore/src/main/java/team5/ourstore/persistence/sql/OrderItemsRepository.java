package team5.ourstore.persistence.sql;

import org.springframework.data.repository.CrudRepository;

public interface OrderItemsRepository extends CrudRepository<OrderItems,Integer> {
    
}
