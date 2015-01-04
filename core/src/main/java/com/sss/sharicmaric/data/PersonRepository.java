package com.sss.sharicmaric.data;

import com.sss.sharicmaric.bean.Person;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by netcrk on 1/2/15.
 */
public interface PersonRepository extends CrudRepository<Person,Long>, JpaSpecificationExecutor<Person> {
}
