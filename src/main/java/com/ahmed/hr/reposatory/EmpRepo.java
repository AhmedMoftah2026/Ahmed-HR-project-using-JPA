package com.ahmed.hr.reposatory;

import com.ahmed.hr.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository <Employee,Long> {
    public List<Employee> findByDepartmentId(Long depId);
}
