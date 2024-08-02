package Projeto_teste.demo;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import Projeto_teste.demo.model.User;
import Projeto_teste.demo.repository.UserRepository;
import Projeto_teste.demo.service.UserService;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    
    /*@Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserService userService;

    @Test
    public void testUserModification() {
        // Arrange
        User user = new User("user", "email");

        when(userRepository.save(any(User.class))).thenReturn(user);

        // Act
        User savedUser = userService.saveUser(user);

        // Assert
        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getName()).isEqualTo("user");
        assertThat(savedUser.getEmail()).isEqualTo("email");

        verify(userRepository, times(1)).save(user);
    }*/
}
