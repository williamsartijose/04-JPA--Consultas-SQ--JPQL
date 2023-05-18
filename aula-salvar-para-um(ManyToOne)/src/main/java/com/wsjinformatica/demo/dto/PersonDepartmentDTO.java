package com.wsjinformatica.demo.dto;

import com.wsjinformatica.demo.entities.Department;
import com.wsjinformatica.demo.entities.Person;

public class PersonDepartmentDTO {

    private Long id;
    private String name;
    private Double salary;

    private DepartmentDTO departament;

    public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO departament) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departament = departament;
    }
    public PersonDepartmentDTO(Person entity) {
       id = entity.getId();
       name = entity.getName();
       salary = entity.getSalary();
       departament = new DepartmentDTO(entity.getDepartment());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public DepartmentDTO getDepartament() {
        return departament;
    }
}
