package Projeto_teste.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Projeto_teste.demo.repository.UserRepository;
import Projeto_teste.demo.model.User;

import java.util.List;



@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User getUser(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User ChangeUser(Long id, String mail, String name ){
        User user = getUser(id);
        
        if(mail != null){
            user.SetEmail(mail);
        }
        if (name != null){
            user.SetName(name);
        }

        userRepository.save(user);

        return user; 
    }
    
}