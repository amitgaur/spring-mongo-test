package com.amitgaur.sample.app.repo;

import com.amitgaur.sample.app.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created with IntelliJ IDEA.
 * User: agaur
 * Date: 7/1/13
 * Time: 5:19 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends MongoRepository<User,String> {
}
