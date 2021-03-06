package com.awseb.repository;

import com.awseb.model.Result;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TempRepository extends MongoRepository<Result, String> {

    Page<Result> findByCategory();

}
