package team5.ourstore.Store;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductReviewRepository extends MongoRepository<ProductReview, String> {

}