package team5.ourstore.persistence.sql;

// import java.sql.Connection;
// import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//	lets main() recognize mongoInterfaces in another package/directory
@EnableMongoRepositories(basePackages = "team5.ourstore.persistence.nosql")
@SpringBootApplication
public class OurstoreApplication {

	public static void main(String[] args) throws Exception {
		// load h2 db driver and get connection 
		// Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
		// conn.close();
		SpringApplication.run(OurstoreApplication.class, args);
	}

}
