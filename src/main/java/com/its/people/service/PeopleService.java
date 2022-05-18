package com.its.people.service;

import com.its.people.dto.PeopleDTO;
import com.its.people.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public boolean save2(PeopleDTO peopleDTO) {
        int saveResult = peoplerepository.save2(peopleDTO);
        if(saveResult > 0){
            return true;
        }else{
            return false;
        }
    }

    public List<PeopleDTO> findAll() {
        List<PeopleDTO> peopleDTOList = peoplerepository.findAll();
        return peopleDTOList;
    }
}
