package com.wsjinformatica.demo.repositories;

import com.wsjinformatica.demo.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository <Department, Long> {
}
