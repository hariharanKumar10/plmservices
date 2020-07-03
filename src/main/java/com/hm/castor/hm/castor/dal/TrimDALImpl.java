package com.hm.castor.hm.castor.dal;

import com.hm.castor.model.Color;
import com.hm.castor.model.Trim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

public class TrimDALImpl implements TrimDAL {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Trim> getAllTrims() {
        return mongoTemplate.findAll(Trim.class);
    }
}
