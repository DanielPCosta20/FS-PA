package Projeto_teste.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Projeto_teste.demo.service.UserService;
import Projeto_teste.demo.model.User;


@RestController
@RequestMapping("/")
public class UserControler {
    
    private UserService userService;

    //@GetMapping
        @CrossOrigin(origins = "http://localhost:8080")
        @RequestMapping(
            value = "home",
        method=RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String[] hello(){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        return cars;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(
        value = "/",
        method=RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<User> getAllUsers(){
        //System.out.println("GetAllUsers");
        return userService.getAllUsers();
        //String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        //return cars;
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

    @CrossOrigin(origins = {"http://localhost:8080","http://localhost:4200/"})
    @DeleteMapping("/{userId}/delete")
    public void deleteUser(@PathVariable("userId") Long id) {
        userService.deleteUser(id);
    }

    @CrossOrigin(origins = {"http://localhost:8080","http://localhost:4200/"})
    @PutMapping("/{userId}/change")
    public User changeUser(@PathVariable("userId") Long id, @RequestBody User user) {
        return userService.changeUser(id, user);
    }

}