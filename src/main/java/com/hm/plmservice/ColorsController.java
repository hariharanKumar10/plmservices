package com.hm.plmservice;

import com.hm.castor.model.Color;
import com.hm.castor.repos.ColorRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ColorsController {


	private final ColorRepository colorRepository;
	public ColorsController(ColorRepository colorRepository) {
		this.colorRepository = colorRepository;
	}

	@GetMapping("/colors")
	@ResponseBody
	public List<Color> getColors(){

		return colorRepository.findAll();


	}
}
