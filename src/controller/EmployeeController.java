package controller;

import model.Employee;
import service.EmployeeService;

public class EmployeeController {
    public Employee create(Employee e){
        EmployeeService es = new EmployeeService();
        Employee abc = es.save(e);
        return abc;
    }
    

}
