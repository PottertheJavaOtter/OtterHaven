package com.example.controller;

import com.example.Clam;
import com.example.Otter;
import com.example.repository.OtterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by minlee on 6/17/16.
 */
@RestController
public class OtterController {

    @Autowired
    private OtterRepository otterRepo;

    @RequestMapping("/")
    public Iterable<Otter> giveMePotter(){
        Otter potter = new Otter();
        potter.setName("Potter");
        potter.setCutenessLevel(100.00);
        Set<Clam> clams = new HashSet<>();
        clams.add(new Clam());
        potter.setClams(clams);
        otterRepo.save(potter);
        return otterRepo.findAll();
    }

    @RequestMapping("/name")
    public Iterable<Otter> giveMePotterByName(){
        return otterRepo.findByName("Potter");
    }

}
