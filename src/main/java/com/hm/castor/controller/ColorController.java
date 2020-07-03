package com.hm.castor.controller;

import com.hm.castor.model.Color;
import com.hm.castor.repos.ColorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/color")
public class ColorController {

    private final ColorRepository colorRepository;

    public ColorController(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Color> getAllUsers() {
        return colorRepository.findAll();
    }

}
