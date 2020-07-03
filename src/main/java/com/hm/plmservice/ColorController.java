package com.hm.plmservice;

import com.hm.castor.model.Color;
import com.hm.castor.repos.ColorRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ColorController {


	private static final String template = "Random Color Data from Castor, %s in %s State!";
	private final AtomicLong counter = new AtomicLong();


	private final ColorRepository colorRepository;

	public ColorController(ColorRepository colorRepository) {
		this.colorRepository = colorRepository;
	}

	@GetMapping("/color")
	@ResponseBody
	public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Color : ") String name) {

		List<Color> colors = colorRepository.findAll();

		Random rand = new Random();

		int rand_int1 = rand.nextInt(1000);
		int rand_int2 = rand.nextInt(1000);

		System.out.println(rand_int2);

		Color color = colors.get(rand_int1);

		System.out.println(color);

		return new Greeting(counter.incrementAndGet(), String.format(template, color.getColorValue(), color.getStatus()));

	}
}
