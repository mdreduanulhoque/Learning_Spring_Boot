package com.example.SocialMedia;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;


@RestController
public class RestApi {
    @GetMapping("/hi")
    String hello(){
        return "Hello !! I am reduan";
    }

    @PostMapping("/age")
    String condit(@RequestParam Integer age){
        if(age < 18){
            return "You are too young";
        }else if(age >= 18 && age < 100) {
            return "You are too old";
        }else if(age >= 100){
            return "You are a living legend";
        }
        return "Input a valid age";
    }
}
