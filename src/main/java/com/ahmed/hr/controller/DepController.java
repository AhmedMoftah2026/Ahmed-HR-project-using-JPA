package com.ahmed.hr.controller;

import com.ahmed.hr.model.Department;
import com.ahmed.hr.model.Employee;
import com.ahmed.hr.service.DepService;
import com.ahmed.hr.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepController {
    @Autowired
    private DepService depService;
    @GetMapping("/{id}")
    public ResponseEntity<Department> findEmployee(@PathVariable Long id){
        return ResponseEntity.ok(depService.findByid(id)) ;
    }
    @PostMapping("/saveDmp")
    public Department saveDep(@RequestBody Department dep){
        return depService.insertDep(dep) ;
    }
    @PutMapping("/udateDep")
    public Department udateDep(@RequestBody Department dep){
        return depService.updateDep(dep) ;
    }
    @GetMapping("/findAllDep")
    public List<Department> findAll(){
        return depService.findAll();
    }
    @DeleteMapping("/by-name/{deptName}")
    public ResponseEntity<?> deleteByName(@PathVariable String deptName) {

        return ResponseEntity.ok(depService.deleteByName(deptName));
    }
}
