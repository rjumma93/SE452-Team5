package team5.ourstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import team5.ourstore.UserType.CustomerRepository;

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
        };
    }
}
