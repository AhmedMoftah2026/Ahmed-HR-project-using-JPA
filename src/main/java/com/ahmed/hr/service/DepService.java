package com.ahmed.hr.service;

import com.ahmed.hr.model.Department;
import com.ahmed.hr.model.Employee;
import com.ahmed.hr.reposatory.DepRepo;
import com.ahmed.hr.reposatory.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepService {
    @Autowired
    private DepRepo depRepo;
    public Department findByid(Long id){
        return depRepo.findById(id).orElseThrow();

    }

    public Department insertDep(Department dep){
        return depRepo.save(dep);
    }

    public Department updateDep(Department dep){
        return depRepo.save(dep);
    }
    public List<Department> findAll(){
        return depRepo.findAll();
    }

}
