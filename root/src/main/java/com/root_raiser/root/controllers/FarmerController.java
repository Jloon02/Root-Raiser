package com.root_raiser.root.controllers;

import com.root_raiser.root.Repository.FarmerRepsitory;
import com.root_raiser.root.model.Farmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class FarmerController {
    @Autowired
    private FarmerRepsitory repo;

    @PostMapping("/farmer")
    public Farmer newFarmer(@RequestBody Farmer newFarmer) {
        return repo.save(newFarmer);
    }

    @GetMapping("/farmer")
    public List<Farmer> getAllPersons(){
        List<Farmer> listFarmer = repo.findAll();
        return listFarmer;
    }

    // Single item
    @GetMapping("/farmer/{id}")
    public Optional<Farmer> getFarmer(@PathVariable String id) {
        int farmerId = Integer.parseInt(id);
        return repo.findById(farmerId);

    }

    @DeleteMapping("/farmer/{id}")
    public boolean deleteFarmer(@PathVariable String id) {
        int farmerId = Integer.parseInt(id);
        repo.deleteById(farmerId);
        return true;
    }
}
