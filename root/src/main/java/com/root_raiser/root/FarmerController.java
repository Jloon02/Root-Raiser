package com.root_raiser.root;

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
    boolean newFarmer(@RequestBody Farmer newFarmer) {
        return farmerList.add(newFarmer);
    }

    // Single item
    @GetMapping("/farmer/{name}")
    @ResponseBody
    List<Farmer> getFarmer(@RequestParam String name) {
        return farmerList.stream().filter(x -> x.equals(name)).collect(Collectors.toList());

    }

    @DeleteMapping("/farmer/{name}")
    void deleteFarmer(@PathVariable String name) {
        farmerList.removeIf(x -> x.equals(name));
    }
}
