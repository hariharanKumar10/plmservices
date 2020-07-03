package com.hm.castor.hm.castor.dal;

import com.hm.castor.model.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

public class ColorDALImpl implements ColorDAL {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Color> getAllColors() {
        return mongoTemplate.findAll(Color.class);
    }
}
