package team5.ourstore.persistence.nosql;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentInfoRepository extends MongoRepository<PaymentInfo, String> {

}