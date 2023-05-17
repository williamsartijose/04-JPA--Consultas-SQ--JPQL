package com.wsjinformatica.demo.services;

import com.wsjinformatica.demo.dto.PersonDepartmentDTO;
import com.wsjinformatica.demo.entities.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){

        Person entity = new Person();

        return dto;
    }
}
