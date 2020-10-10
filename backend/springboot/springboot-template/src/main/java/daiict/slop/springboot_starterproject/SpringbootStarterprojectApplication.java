package daiict.slop.springboot_starterproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Main Class
 * @version 1.0
 * @since Oct 1, 2020
 */

@SpringBootApplication
public class SpringbootStarterprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStarterprojectApplication.class, args);
        System.out.println("Hello, This is our first Spring Project");
    }
}
