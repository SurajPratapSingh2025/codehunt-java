package com.application.service;

import com.application.pojo.Employee;
import java.util.List;

public interface Services {
    void saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    void deleteEmployee(int id);
}
