package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.application.pojo.Employee;
import com.application.service.Services;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class MyController {

    @Autowired
    private Services service;

    // Home page
    @GetMapping({"/", "/home"})
    public String welcomeView() {
        return "index";
    }

    // Show list of employees
    @GetMapping("/list")
    public String listEmployees(Model model) {
        List<Employee> list = service.getAllEmployees();
        model.addAttribute("employees", list);
        return "list";
    }

    // Show insert form
    @GetMapping("/insert")
    public String insertView(Model model) {
        model.addAttribute("employee", new Employee());
        return "insert";
    }

    // Insert employee (POST)
    @PostMapping("/insert")
    public String insertData(@ModelAttribute Employee emp) {
        service.saveEmployee(emp);
        return "redirect:/employee/list";
    }

    // Show update form
    @GetMapping("/update/{id}")
    public String updateView(@PathVariable int id, Model model) {
        Employee emp = service.getEmployeeById(id);
        model.addAttribute("employee", emp);
        return "update";
    }

    // Update employee (POST)
    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute Employee emp) {
        service.saveEmployee(emp);
        return "redirect:/employee/list";
    }

    // View employee details
    @GetMapping("/read/{id}")
    public String readView(@PathVariable int id, Model model) {
        Employee emp = service.getEmployeeById(id);
        model.addAttribute("employee", emp);
        return "read";
    }

    // Delete employee
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "redirect:/employee/list";
    }
}
