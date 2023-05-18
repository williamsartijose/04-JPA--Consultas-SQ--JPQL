package com.wsjinformatica.demo.services;

import com.wsjinformatica.demo.dto.PersonDTO;
import com.wsjinformatica.demo.dto.PersonDepartmentDTO;
import com.wsjinformatica.demo.entities.Department;
import com.wsjinformatica.demo.entities.Person;
import com.wsjinformatica.demo.repositories.DepartmentRepository;
import com.wsjinformatica.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    @Autowired
    private DepartmentRepository departmentRepository;
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department dept =  departmentRepository.getReferenceById(dto.getDepartament().getId());
        // Department dept = new Department();
        //dept.setId(dto.getDepartament().getId());

        entity.setDepartment(dept);
        entity = repository.save(entity);

        return new PersonDepartmentDTO(entity);

    }

    public PersonDTO insert(PersonDTO dto){

        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        // Department dept =  departmentRepository.getReferenceById(dto.getDepartmentId());
        Department dept = new Department();
        dept.setId(dto.getDepartmentId());

        entity.setDepartment(dept);
        entity = repository.save(entity);

        return new PersonDTO(entity);

    }

}
