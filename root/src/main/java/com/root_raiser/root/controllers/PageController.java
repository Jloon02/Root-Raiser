package com.root_raiser.root.controllers;

import com.root_raiser.root.Repository.PageRepository;
import com.root_raiser.root.model.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class PageController {

    @Autowired
    private PageRepository repo;

    @GetMapping("/page")
    public List<Page> getAllPages(){
        List<Page> listPages = repo.findAll();
        //model.addAttribute("listPages", listPages);
        return listPages;
    }

    @GetMapping("/page/{id}")
    public Optional<Page> getPage(@PathVariable String id){
        int pageId = Integer.parseInt(id);
        return repo.findById(pageId);
    }

    @PostMapping("/page/newpage")
    public Page create(@RequestBody Map<String, String> body){
        String pageId = body.get("pageId");
        String productName = body.get("productName");
        String productRemaining = body.get("productRemaining");
        String userId = body.get("userId");
        String productId = body.get("productId");
        String price = body.get("price");
        String attachments = body.get("attachments");
        return repo.save(new Page(Integer.parseInt(pageId), productName, Integer.parseInt(productRemaining), Integer.parseInt(userId), Integer.parseInt(productId),Integer.parseInt(price),attachments));
    }

    @DeleteMapping("/page/{id}")
    public boolean deletePage(@PathVariable String id) {
        int pageId = Integer.parseInt(id);
        repo.deleteById(pageId);
        return true;
    }
}
