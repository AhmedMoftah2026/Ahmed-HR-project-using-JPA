package com.ahmed.hr.reposatory;

import com.ahmed.hr.model.Department;
import com.ahmed.hr.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepRepo extends JpaRepository <Department,Long> {
}
