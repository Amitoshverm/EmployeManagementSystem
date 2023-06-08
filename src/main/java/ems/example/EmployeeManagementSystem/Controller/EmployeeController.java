package ems.example.EmployeeManagementSystem.Controller;

import ems.example.EmployeeManagementSystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String getAllEmployees(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());
        return "index";
    }

}
