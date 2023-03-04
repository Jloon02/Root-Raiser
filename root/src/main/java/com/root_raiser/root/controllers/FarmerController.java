package com.root_raiser.root.controllers;

import com.root_raiser.root.model.Farmer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class FarmerController {

    private final List<Farmer> farmerList;

    FarmerController(List<Farmer> farmer) {
        this.farmerList = farmer;
    }

    @PostMapping("/farmer")
    public boolean newFarmer(@RequestBody Farmer newFarmer) {
        return farmerList.add(newFarmer);
    }

    @GetMapping("/farmer")
    public List<Farmer> getAllPersons(){
        return farmerList;
    }

    // Single item
    @GetMapping("/farmer/{name}")
    @ResponseBody
    public Farmer getFarmer(@PathVariable String name) {
        return farmerList.stream().filter(x -> x.equals(name)).collect(Collectors.toList()).get(0);

    }

    @DeleteMapping("/farmer/{name}")
    public void deleteFarmer(@PathVariable String name) {
        farmerList.removeIf(x -> x.equals(name));
    }
}
