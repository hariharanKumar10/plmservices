package com.hm.castor.repos;

import com.hm.castor.model.Print;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrintRepository  extends MongoRepository<Print, String> {


}
