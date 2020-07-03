package com.hm.plmservice;


import com.hm.castor.model.Print;
import com.hm.castor.model.Trim;
import com.hm.castor.repos.PrintRepository;
import com.hm.castor.repos.TrimsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PrintsController {

    private final PrintRepository printRepository;

    public PrintsController(PrintRepository printRepository) {
        this.printRepository = printRepository;
    }

    @GetMapping("/prints")
    @ResponseBody
    public List<Print> getPrints(){
        return printRepository.findAll();
    }

}
