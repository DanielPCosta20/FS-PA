package Projeto_teste.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import Projeto_teste.demo.service.UserService;
import Projeto_teste.demo.model.User;


@RestController
public class UserControler {
    
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUsers(){
        System.out.println("GetAllUsers");
        return userService.getAllUsers();
    }

    @GetMapping("/user/{userId}/get")
    public User getUser(@PathVariable Long id){
        System.out.println("getUser");
        User user = userService.getUser(id);
        

        
        return user;
    }

    @PostMapping("/")
    public User saveUser(User user) {
        System.out.println("saveUser");
        return userService.saveUser(user);
    }

    @DeleteMapping("/user/{userId}/delete")
    public void deleteUser(@PathVariable Long id) {
        System.out.println("deleteUser");
        userService.deleteUser(id);
    }

    @PutMapping("/user/{userId}/change")
    public User ChangeUser(@PathVariable Long id, String mail, String name ){
        System.out.println("ChangeUser");
        return userService.ChangeUser(id, mail, name);
    }

}