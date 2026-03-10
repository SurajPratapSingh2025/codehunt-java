package com.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dao.Crud;
import com.application.pojo.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImpl implements Services {

    @Autowired
    private Crud crud;

    @Override
    public void saveEmployee(Employee employee) {
        crud.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return crud.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        Optional<Employee> opt = crud.findById(id);
        return opt.orElse(null);
    }

    @Override
    public void deleteEmployee(int id) {
        crud.deleteById(id);
    }
}
