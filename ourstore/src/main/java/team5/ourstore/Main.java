package team5.ourstore;

import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import team5.ourstore.Ordering.*;
import team5.ourstore.Store.*;
import team5.ourstore.UserType.CustomerRepository;

@EnableMongoRepositories(basePackageClasses = {PaymentInfo.class,
                            ProductReview.class,
                            ShippingInfo.class,
                            ShoppingCart.class})
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner showCustomers(CustomerRepository repository){
        return(args) ->{
            System.out.println("Displaying all customers");
            System.out.println("-------------------------------");
            repository.findAll().forEach((Customer) -> {
                System.out.println(Customer.toString());
            });
            System.out.println("-------------------------------");
			// added to reset repo (error when inserting UNIQUE values in data.sql?)
			repository.deleteAll();
        };
    }
	
    @Bean
    public CommandLineRunner showReviews(ProductReviewRepository reviewRepository) {
        return(args) -> {
            System.out.println("Mongo DB init...");
            Date date = new Date();
            ProductReview lucyReview = new ProductReview(1, 145,"cool shoes, fast shipping", "lucy", date, 5);
            ProductReview billReview = new ProductReview(2, 145, "lame shoes, slow shipping", "bill", date, 1);
            reviewRepository.save(lucyReview);
            reviewRepository.save(billReview);
            ProductReviewController reviewController = new ProductReviewController(reviewRepository);
            List<ProductReview> reviews = reviewController.getAll();
            for (ProductReview productReview : reviews) {
                System.out.println(productReview.toString());
            }
            reviewRepository.deleteAll();
        };
    }
}
