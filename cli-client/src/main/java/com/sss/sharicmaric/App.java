package com.sss.sharicmaric;

import com.sss.sharicmaric.data.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class App 
{
    @Autowired
    private PersonRepository personRepository;

    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);


    }

    public void run(String[] args) {

    }

}
