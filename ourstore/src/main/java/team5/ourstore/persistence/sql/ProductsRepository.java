package team5.ourstore.persistence.sql;

import org.springframework.data.repository.CrudRepository;

public interface ProductsRepository extends CrudRepository<Products, Integer>{
    
}
