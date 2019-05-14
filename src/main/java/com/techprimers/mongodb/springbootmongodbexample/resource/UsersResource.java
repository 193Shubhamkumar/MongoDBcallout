package com.techprimers.mongodb.springbootmongodbexample.resource;

import com.techprimers.mongodb.springbootmongodbexample.document.Users;
import com.techprimers.mongodb.springbootmongodbexample.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UserRepository userRepository;

    public UsersResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<Users> getAll() {
        return userRepository.findAll();
    }
        
        @GetMapping(value = "/{name}")
        public Users findByName(@PathVariable final String name){
            return userRepository.findByName(name);
        }
        
        @GetMapping("/id/{id}")
        public Users getId(@PathVariable("id") final Integer id) {
            return userRepository.findOne(id);
        }
        
      
        
        @GetMapping("/update/{id}/{name}")
        public Users update(@PathVariable("id") final Integer id, @PathVariable("name")
                             final String name) {


            Users users = getId(id);
            users.setName(name);

    return userRepository.save(users);
        }
        		
        
        @PostMapping(value = "/load")
        public Users load(@RequestBody final Users users) {
        	userRepository.save(users);
            return userRepository.findByName(users.getName());
        }
    }

