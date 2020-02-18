package com.bazalytskyi.hw2_distribured.repository;

import com.bazalytskyi.hw2_distribured.entity.nosql.UserNoSql;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoSqlUserRepository extends MongoRepository<UserNoSql, String> {

}