package com.hm.plmservice;

import com.hm.castor.model.Color;
import com.hm.castor.model.Trim;
import com.hm.castor.repos.ColorRepository;
import com.hm.castor.repos.TrimsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TrimsController {

	private final TrimsRepository trimsRepository;

	public TrimsController(TrimsRepository trimsRepository) {
		this.trimsRepository = trimsRepository;
	}

	@GetMapping("/trims")
	@ResponseBody
	public List<Trim> getTrims(){
		return trimsRepository.findAll();
	}
}
