package team5.ourstore.persistence.sql;

import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Integer>{
    
}
