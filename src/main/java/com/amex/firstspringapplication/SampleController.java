package com.amex.firstspringapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
//http://localhost:8080/sample/sayHello
    @GetMapping("/sayHello")
    public String hello() {
        return "Hello World!";
    }
//http://localhost:8080/sample/sayBye
    @GetMapping("/sayBye")
    public String sayBye(){
        return "Goodbye!";
    }
//http://localhost:8080/sample/sayHello/Bapun
    @GetMapping("/sayHello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name ;
    }


}
