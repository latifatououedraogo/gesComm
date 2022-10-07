package gestionComm.gesComm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/")
    public String hello(){
        System.out.println("hello");
        return "hiii,how are you????????";
    }

}
