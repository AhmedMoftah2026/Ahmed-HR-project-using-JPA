package com.ahmed.hr.service;

import com.ahmed.hr.model.Employee;
import com.ahmed.hr.reposatory.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;
    public Employee findByid(Long id){
        return empRepo.findById(id).orElseThrow();
    }
     public Employee insertEmp(Employee emp){
        return empRepo.save(emp);
    }
     public Employee udateEmp(Employee emp){
        return empRepo.save(emp);
    }
    public List<Employee> findByDepartmentId(Long depId){
        return empRepo.findByDepartmentId(depId);
    }
    public List<Employee> findAll(){
            return empRepo.findAll();
        }

}
