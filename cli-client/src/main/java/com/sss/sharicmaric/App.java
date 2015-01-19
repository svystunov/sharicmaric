package com.sss.sharicmaric;

import com.sss.sharicmaric.bean.Assignment;
import com.sss.sharicmaric.bean.Person;
import com.sss.sharicmaric.bean.Position;
import com.sss.sharicmaric.bean.Project;
import com.sss.sharicmaric.data.PersonRepository;
import com.sss.sharicmaric.data.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
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
    @Autowired
    private ProjectRepository projectRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Hello World!");
        personRepository.deleteAll();
        personRepository.save(new Person("asd"));
        List<Person> personList;
        personList = personRepository.findAll();
        System.out.println(personList);
        personList = personRepository.findByName("asd");
        System.out.println("personList.size() = " + personList.size());

//        projectRepository.deleteAll();
        Project project = new Project("pr1");
        Position poz1 = new Position("poz1");
        poz1.setAssignments(Arrays.asList(new Assignment(Date.from(Instant.now()),Date.from(Instant.now()) )));
        project.setPositions(Arrays.asList(poz1, new Position("poz2")));
//        projectRepository.save(project);
        System.out.println("project = " + project);

        List<Project> pr1 = projectRepository.findByName("pr1");
        Project project1 = pr1.get(0);
        System.out.println("project1 = " + project1);

    }
}
