package com.bazalytskyi.hw2_distribured.repository.sql;

import com.bazalytskyi.hw2_distribured.entity.sql.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
