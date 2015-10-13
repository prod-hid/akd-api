package com.eacademy.app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    public List<ExampleClass> records = new ArrayList<>();



    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        records.clear();
        records.add(new ExampleClass(1, "somename"));
        records.add(new ExampleClass(2, "someOthername"));
        return new Greeting(records);
    }

    @RequestMapping("/resultList")
    public String resultlist(){
        return "hey";
    }
}
