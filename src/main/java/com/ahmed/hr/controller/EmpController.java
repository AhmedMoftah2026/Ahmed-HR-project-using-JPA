package com.ahmed.hr.controller;

import com.ahmed.hr.model.Employee;
import com.ahmed.hr.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("/{id}")
    public Employee findEmployee(@PathVariable Long id){
        return empService.findByid(id) ;
    }
    @PostMapping ("/saveEmp")
    public Employee saveEmp(@RequestBody Employee emp){
        return empService.insertEmp(emp) ;
    }
    @PutMapping("/udateEmp")
    public Employee udateEmp(@RequestBody Employee emp){
        return empService.udateEmp(emp) ;
    }
    @GetMapping("/findByDepartmentId")
    public List<Employee> findByDepartmentId(Long depId){
        return empService.findByDepartmentId(depId);
    }
    @GetMapping("/findAll")
    public List<Employee> findAll(){
        return empService.findAll();
    }
//    @GetMapping("/salary")
//    public ResponseEntity<?> findBySalary(@RequestParam Double salary, @RequestParam String name) {
//
//        return  ResponseEntity.ok(empService.findBySalary(salary , name)) ;
//    }
}
