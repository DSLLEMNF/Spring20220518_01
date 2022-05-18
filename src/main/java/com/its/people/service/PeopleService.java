package com.its.people.service;

import com.its.people.dto.PeopleDTO;
import com.its.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peoplerepository;

    public void save(String name, int age){
        System.out.println("PeopleService.save");
        System.out.println("name1 = " + name + ", age1 = " + age);
        peoplerepository.save(name,age);
    }

    public void save1(PeopleDTO peopleDTO) {
        peoplerepository.save1(peopleDTO);
    }

    public void save2(PeopleDTO peopleDTO) {
        peoplerepository.save2(peopleDTO);
    }
}