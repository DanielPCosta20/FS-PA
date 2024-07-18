package Projeto_teste.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer _id;

    private String _name;

    private String _email;

    public User(String name, String email){
        this._name = name;
        this._email = email;
    }

    public String getName(){
        return this._name;
    }

    public void SetName(String name){
         this._name = name;
    }

    public String getEmail(){
        return this._email;
    }

    public void SetEmail(String email){
         this._email = email;
    }   

}