package com.program.demomongo.repository;

import com.program.demomongo.model.info;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface infoRepository extends MongoRepository<info,Integer> {
}
