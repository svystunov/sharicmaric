package com.sss.sharicmaric;

import com.sss.sharicmaric.bean.Person;
import com.sss.sharicmaric.data.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Hello world!
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class App implements CommandLineRunner {
    @Autowired
    private PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Hello World!");
        personRepository.deleteAll();
        personRepository.save(new Person("1","asd"));
        List<Person> all = personRepository.findAll();
        System.out.println(all);

    }
}
