package com.example.HelloWorld;

@RestController
public class HelloWorldController {

    @RequestMapping("/")
    public String index()
    {
        return "Hello World!";
    }
}
