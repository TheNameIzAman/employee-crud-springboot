package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    // 1) CREATE  (POST)
    @PostMapping
    public EmployeeEntity add(@RequestBody EmployeeEntity emp) {
        // id mat bhejna, DB khud generate karega
        return repo.save(emp);
    }

    // 2) READ ALL  (GET)
    @GetMapping
    public List<EmployeeEntity> getAll() {
        return repo.findAll();
    }

    // 3) READ BY ID  (GET /employee/{id})
    @GetMapping("/{id}")
    public EmployeeEntity getById(@PathVariable Integer id) {
        return repo.findById(id).orElse(null);
    }

    // 4) UPDATE  (PUT /employee/{id})
    @PutMapping("/{id}")
    public String update(@PathVariable Integer id,
                         @RequestBody EmployeeEntity empData) {

        EmployeeEntity emp = repo.findById(id).orElse(null);
        if (emp == null) {
            return "Employee Not Found!";
        }

        emp.setName(empData.getName());
        emp.setDepartment(empData.getDepartment());
        emp.setSalary(empData.getSalary());

        repo.save(emp);
        return "Employee Updated!";
    }

    // 5) DELETE  (DELETE /employee/{id})
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        if (!repo.existsById(id)) {
            return "Employee Not Found!";
        }
        repo.deleteById(id);
        return "Employee Deleted!";
    }
}
