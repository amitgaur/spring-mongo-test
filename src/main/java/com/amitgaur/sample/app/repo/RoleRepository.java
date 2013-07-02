package com.amitgaur.sample.app.repo;

import com.amitgaur.sample.app.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/1/13
 * Time: 5:21 PM
 * To change this template use File | Settings | File Templates.
 */
public interface RoleRepository extends MongoRepository<Role,String> {
}
