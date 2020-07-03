package com.hm.castor.repos;

import com.hm.castor.model.Color;
import com.hm.castor.model.Trim;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrimsRepository extends MongoRepository<Trim, String> {

}
