package Projeto_teste.demo.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@RequestMapping("/api/")
public class HomeController {

    //@GetMapping
    @RequestMapping(
            value = "home",
        method=RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String Welcome(){
        return "Seja bem-vindo";
    }
    
}
