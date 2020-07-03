package com.hm.castor.repos;

import com.hm.castor.model.Color;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends MongoRepository<Color, String> {

}
