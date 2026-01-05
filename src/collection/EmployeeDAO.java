package collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO { //Data Access Object
    
    
    List<Employee> getAllEmployees(){
        String sql = "select * from employees";
        Employee e1 = new Employee(1001, "Mr. A", 25, new SalaryStructure(15000, 20000, 25000, "NORMAL", 2500), new EmployeeAddress("Kakrail", 4, "Motijheel", 1000));
        Employee e2 = new Employee(1002, "Mr. B", 30, new SalaryStructure(15000, 20000, 25000, "NORMAL", 2500), new EmployeeAddress("Kakrail", 4, "Motijheel", 1000));
        Employee e3 = new Employee(1003, "Mr. C", 29, new SalaryStructure(15000, 20000, 25000, "NORMAL", 2500), new EmployeeAddress("Kakrail", 4, "Motijheel", 1000));
        Employee e4 = new Employee(1004, "Mr. D", 24, new SalaryStructure(15000, 20000, 25000, "NORMAL", 2500), new EmployeeAddress("Kakrail", 4, "Motijheel", 1000));
        Employee e5 = new Employee(1005, "Mr. E", 35, new SalaryStructure(15000, 20000, 25000, "NORMAL", 2500), new EmployeeAddress("Kakrail", 4, "Motijheel", 1000));
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        return empList;
    }
    
    Employee getByID(){
        String sql = "select * from employees where id = 10";
        Employee e1 = new Employee(1001, "Mr. A", 25, new SalaryStructure(15000, 20000, 25000, "NORMAL", 2500), new EmployeeAddress("Kakrail", 4, "Motijheel", 1000));
        return e1;
    }
    


}
