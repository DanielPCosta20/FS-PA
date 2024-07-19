package Projeto_teste.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonPropertyOrder({"id", "name", "email"}) 
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Integer _id;

    @JsonProperty("name")
    private String _name;

    @JsonProperty("email")
    private String _email;

    public User(){

    }

    public User(String name, String email){
        this._name = name;
        this._email = email;
    }

    public String getName(){
        return this._name;
    }

    public void setName(String name){
         this._name = name;
    }

    public String getEmail(){
        return this._email;
    }

    public void setEmail(String email){
         this._email = email;
    }   

}