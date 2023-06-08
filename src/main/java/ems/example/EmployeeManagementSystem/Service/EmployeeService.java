package ems.example.EmployeeManagementSystem.Service;

import ems.example.EmployeeManagementSystem.Entity.Employee;
import ems.example.EmployeeManagementSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements ServiceMethods{
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
