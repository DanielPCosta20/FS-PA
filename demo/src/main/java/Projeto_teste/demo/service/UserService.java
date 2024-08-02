package Projeto_teste.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Projeto_teste.demo.repository.UserRepository;
import Projeto_teste.demo.exceptions.UserInvalidArguments;
import Projeto_teste.demo.exceptions.UserNotFoundException;
import Projeto_teste.demo.model.User;

import java.util.List;



//@Service
public class UserService {

    /*@Autowired
    UserRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll().stream().toList();
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }
    

    public User saveUser(User user) {
        //if(user.getName()!= null && user.getEmail() != null){
            return userRepository.save(user);
        /* }
        else{ throw new UserInvalidArguments();}*/


    /*public void deleteUser(Long id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
    }

    public User changeUser(Long id, User updatedUser) {
        User existingUser = getUser(id);

        if (existingUser == null) {
            return null; 
        }

        if (updatedUser.getName() != null) {
            existingUser.setName(updatedUser.getName());
        }


        if (updatedUser.getEmail() != null) {
            existingUser.setEmail(updatedUser.getEmail());
        }

        userRepository.save(existingUser);
        return existingUser;
    }*/
    
}