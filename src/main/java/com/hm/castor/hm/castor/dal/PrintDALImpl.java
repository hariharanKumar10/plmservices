package com.hm.castor.hm.castor.dal;

import com.hm.castor.model.Color;
import com.hm.castor.model.Print;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

public class PrintDALImpl implements PrintDAL{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Print> getAllPrints() {
        return mongoTemplate.findAll(Print.class);
    }
}
