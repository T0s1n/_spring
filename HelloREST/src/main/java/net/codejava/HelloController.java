package net.codejava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {
 
    @RequestMapping("/")
    public String hello() {
        return "Hello World RESTful with Spring Boot";
    } 
    @RequestMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }
    @GetMapping("/getproduct")
    public Product getProduct() {
        return new Product(1, "iPhone", 999.99f);
    }
}
