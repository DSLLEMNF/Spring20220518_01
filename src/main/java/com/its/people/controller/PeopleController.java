package com.its.people.controller;

import com.its.people.dto.PeopleDTO;
import com.its.people.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PeopleController {
    @Autowired
    private PeopleService peopelservice;

    @GetMapping("/save-form")
    public String saveForm() {
        return "save-form";
    }

    @PostMapping("/save")
    public String save(@RequestParam("name1") String name,
                       @RequestParam("age1") int age) {
        System.out.println("name1 = " + name + ", age1 = " + age);
        peopelservice.save(name, age);
        return null;
    }

    @PostMapping("/save1")
    public String save1(@RequestParam("name1") String name,
                        @RequestParam("age1") int age) {
        System.out.println("name1 = " + name + ", age1 = " + age);
        PeopleDTO peopleDTO = new PeopleDTO();
        peopleDTO.setName1(name);
        peopleDTO.setAge1(age);
        peopelservice.save1(peopleDTO);
        return null;
    }

    @PostMapping("/save2")
    public String save2(@ModelAttribute PeopleDTO peopleDTO) {
        peopelservice.save2(peopleDTO);
        return null;
    }
}

