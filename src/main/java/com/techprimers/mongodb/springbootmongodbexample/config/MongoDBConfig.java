package com.techprimers.mongodb.springbootmongodbexample.config;

import com.techprimers.mongodb.springbootmongodbexample.document.Users;
import com.techprimers.mongodb.springbootmongodbexample.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
        	
            userRepository.save(new Users(1, "shubhamkumar", "NDQA", 1L));
            userRepository.save(new Users(2, "pradyumnna", "NDQA", 2L));
            userRepository.save(new Users(3, "ankursrivastava", "NDQA", 5L));
            userRepository.save(new Users(4, "sushilT", "NDQA", 5L));
            userRepository.save(new Users(5, "sushilS", "NDQA", 1L));
            userRepository.save(new Users(6, "deep", "NDQA", 1L));
            userRepository.save(new Users(7, "ashmita", "NDQA", 2L));
            userRepository.save(new Users(8, "rajanish", "NDQA", 1L));
            userRepository.save(new Users(9, "shubhamchauhan", "NDQA", 2L));
            userRepository.save(new Users(10, "shubhamrajput", "NDQA", 3L));
            userRepository.save(new Users(11, "ram", "NDQA", 3L));
            userRepository.save(new Users(12, "shyam", "NDQA", 2L));
            userRepository.save(new Users(13, "sarthak", "NDQA", 2L));
            userRepository.save(new Users(14, "divya", "NDQA", 5L));
            userRepository.save(new Users(15, "ronak", "NDQA", 2L));
            userRepository.save(new Users(16, "mohan", "NDQA", 2L));
            userRepository.save(new Users(17, "sohan", "NDQA", 2L));
            userRepository.save(new Users(21, "dhirander", "NDQA", 2L));
            userRepository.save(new Users(22, "sk", "NDQA", 2L));
            userRepository.save(new Users(23, "dalip", "NDQA", 2L));
            userRepository.save(new Users(24, "Kirti", "NDQA", 2L));
            userRepository.save(new Users(25, "anjali", "NDQA", 2L));
            userRepository.save(new Users(26, "shivam", "NDQA", 2L));
            userRepository.save(new Users(27, "navneet", "NDQA", 2L));
            
            
        };
    }

}
