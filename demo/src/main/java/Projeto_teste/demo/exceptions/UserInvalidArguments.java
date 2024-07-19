package Projeto_teste.demo.exceptions;

public class UserInvalidArguments extends RuntimeException {
    public UserInvalidArguments() {
        super("User must have a name and an email");
    }
}