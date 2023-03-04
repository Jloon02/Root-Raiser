package com.root_raiser.root.controllers;

import com.root_raiser.root.model.Page;
import org.springframework.web.bind.annotation.*;

@RestController
public class PageController {

    @GetMapping("/page")
    public Page getAllPersons(){
        // TODO: get page data from database
        Page page = new Page(1,"Tomato",10,5, 1234,10,"attachment");
        return page;
    }

    @PostMapping("/page/newpage")
    public void addPerson(@RequestBody Page page){
        // TODO: add page in database
        System.out.println("Saving page information");
    }

    @DeleteMapping("/page/{id}")
    public void deletePage(@PathVariable int id) {
        // TODO: delete page in database
    }

    @PutMapping("/page/buy/{id}")
    public void purchasedItem(@PathVariable Long id) {
        Page page = new Page(1, "Tomato", 10, 5, 1234, 10, "attachment");
        page.decreProductRemaining();
    }
}
