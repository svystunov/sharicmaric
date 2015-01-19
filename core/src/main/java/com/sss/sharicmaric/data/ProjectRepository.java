package com.sss.sharicmaric.data;

import com.sss.sharicmaric.bean.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by svystunov on 1/9/2015.
 */
public interface ProjectRepository extends MongoRepository<Project,String> {
    List<Project> findByName(String name);
}
