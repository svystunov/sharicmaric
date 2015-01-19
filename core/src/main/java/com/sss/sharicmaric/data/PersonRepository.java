package com.sss.sharicmaric.data;

import com.sss.sharicmaric.bean.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by netcrk on 1/2/15.
 */
public interface PersonRepository extends MongoRepository<Person,String > {
    List<Person> findByName(String name);
}
