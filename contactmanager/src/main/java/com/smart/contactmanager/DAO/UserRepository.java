package com.smart.contactmanager.DAO;

import com.smart.contactmanager.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
