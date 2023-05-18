package com.wsjinformatica.demo.dto;

import com.wsjinformatica.demo.entities.Department;

public class DepartmentDTO {

    private Long id;
    private String name;

    public DepartmentDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department entity) {
        id = entity.getId();
        name = entity.getName();
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
