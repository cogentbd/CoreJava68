package service;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeService {
    public Employee save(Employee e){
        EmployeeDAO edao = new EmployeeDAO();
        return edao.insert(e);
    }
}
