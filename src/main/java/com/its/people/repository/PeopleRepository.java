package com.its.people.repository;

import com.its.people.dto.PeopleDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PeopleRepository {
    @Autowired
    private SqlSessionTemplate sql;
    public void save(String name, int age) {
        // 넘겨받은 name, age 를 PeopleDTO 객체에 담자
        PeopleDTO peopleDTO = new PeopleDTO();
        peopleDTO.setName1(name);
        peopleDTO.setAge1(age);
        sql.insert("People.save",peopleDTO);
    }
    public void save1(PeopleDTO peopleDTO) {
        sql.insert("Peaple.save",peopleDTO);
    }

    public void save2(PeopleDTO peopleDTO) {
        sql.insert("People.sav",peopleDTO);
    }
}
