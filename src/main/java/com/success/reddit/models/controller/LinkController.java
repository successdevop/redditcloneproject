package com.success.reddit.models.controller;

import com.success.reddit.models.Link;
import com.success.reddit.repository.LinkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/links")
public class LinkController {
    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository){
        this.linkRepository = linkRepository;
    }

    @GetMapping("/all")
    public List<Link> links(){
        return linkRepository.findAll();
    }

    @PostMapping("/create")
    public Link create(@ModelAttribute Link link){
        return linkRepository.save(link);
    }

    @GetMapping("/{id}")
    public Link read(@PathVariable Long id){
        return linkRepository.findById(id).get();
    }

    @PutMapping("/update/{id}")
    public Link update(@PathVariable Long id){
        Link link = linkRepository.findById(id).get();
        return linkRepository.save(link);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        linkRepository.deleteById(id);
    }
}
