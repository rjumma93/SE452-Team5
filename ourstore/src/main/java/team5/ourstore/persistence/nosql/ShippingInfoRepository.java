package team5.ourstore.persistence.nosql;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShippingInfoRepository extends MongoRepository<PaymentInfo, String> {

}