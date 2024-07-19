package Projeto_teste.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Projeto_teste.demo.service.UserService;
import Projeto_teste.demo.model.User;


@RestController
public class UserControler {
    
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers(){
        System.out.println("GetAllUsers");
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}/get")
    public User getUser(@PathVariable("userId") Long id){
        System.out.println("getUser");
        return userService.getUser(id);
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping("/{userId}/delete")
    public void deleteUser(@PathVariable("userId") Long id) {
        userService.deleteUser(id);
    }

    @PutMapping("/{userId}/change")
    public User changeUser(@PathVariable("userId") Long id, @RequestBody User user) {
        return userService.changeUser(id, user);
    }

}