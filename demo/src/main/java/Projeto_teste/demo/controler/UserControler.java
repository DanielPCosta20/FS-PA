package Projeto_teste.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import Projeto_teste.demo.service.UserService;
import Projeto_teste.demo.model.User;


@RestController
@RequestMapping("/api/")
public class UserControler {
    
    @Autowired
    private UserService userService;


    @RequestMapping(
        value = "/users",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<User> getAllUsers() {
        System.out.println("GetAllUsers");
        return userService.getAllUsers();
    }

    @GetMapping(
        value = "/{userId}/get",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public User getUser(@PathVariable("userId") Long id) {
        System.out.println("getUser");
        return userService.getUser(id);
    }

    @PostMapping(
        value = "/save",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @DeleteMapping(
        value = "/{userId}/delete",
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public void deleteUser(@PathVariable("userId") Long id) {
        userService.deleteUser(id);
    }

    @PutMapping(
        value = "/{userId}/change",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public User changeUser(@PathVariable("userId") Long id, @RequestBody User user) {
        return userService.changeUser(id, user);
    }

}