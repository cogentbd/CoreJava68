package collection;

import java.util.*;


public class Test {
   
    
    public static void main(String[] args) {
       EmployeeDAO eDAO = new EmployeeDAO();
       List<Employee> eList = eDAO.getAllEmployees(); //list of employees
        
        for (Employee employee : eList) {
            System.out.println(employee);
        }
       
        Employee e1 = new Employee(1001, "Mr. A", 25, new SalaryStructure(15000, 20000, 25000, "NORMAL", 2500), new EmployeeAddress("Kakrail", 4, "Motijheel", 1000));
        //System.out.println(e1);
        //System.out.println(e1.getAddr().getPostalCode());
        
        EmployeeAddress e2Addr = new EmployeeAddress("NewBazar", 7, "Rampura", 1212);
        SalaryStructure e2Salary = new SalaryStructure(15000, 20000, 25000, "NORMAL", 2500);
        Employee e2 = new Employee(1002, "Mr. B", 30, e2Salary, e2Addr);

        EmployeeAddress e3Addr = new EmployeeAddress("Gulshan2", 10, "Gulshan", 1217);
        SalaryStructure e3Salary = new SalaryStructure(15000, 20000, 25000, "NORMAL", 2500);
        Employee e3 = new Employee(1003, "Mr. C", 35, e3Salary, e3Addr);
        
        //Employer employer = new Employer();
        //Employer[] emps = {e1, e2, employer};
        //emps[2] = e3;
        //Employee[] emps = new Employee[2];
        //System.out.println(emps[2]);
        
        List l = new ArrayList();
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add("Hello");
        l.add(e1);
        l.add(e2);
        l.add(e3);
        l.add(new Employer());
        
        //System.out.println(l.size());
        for (int i = 0; i < l.size(); i++) {
            System.out.println(i + " " + l.get(i));
        }

        List empList = new ArrayList();
        empList.add(e1);
        empList.add(e1);
        empList.add(e3);
        System.out.println("--------------------List--------------------");
        for (Object o : empList) {
            System.out.println(o);
        }
        
        Set set = new LinkedHashSet();
        set.add(e1);
        set.add(e1);
        set.add(e2);
        
        System.out.println("--------------------Set--------------------");

        for (Object o : set) {
            System.out.println(o);
        }
        
//     ---------------- Type Safety :: Generics -------------------------          
        /*
        placeholders (commonly a single uppercase letter like 
        <T> for Type, 
                <E> for Element, 
                        <K> for Key, or 
                                <V> for Value)
                                    */
        List<Employee> nL = new ArrayList<Employee>();
        nL.add(e1);
        nL.add(e2);
        nL.add(e3);
        
//      -------------------------- Map -------------------------
        System.out.println("--------------------Map--------------------");
        Map map = new HashMap();
        //map.put(key, value);
        map.put("A", e1);
        map.put(2, e2);
        map.put(1.0, e3); 
        
        System.out.println(map.get(2));
        
        Map<Integer, Employee> map1 = new HashMap();
        map1.put(1, e3);
        
        
        // ------------------------------- Queue ----------------------
        //FIFO
        //LIFO
        System.out.println("--------------------Queue--------------------");
        Queue q = new PriorityQueue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println(q);
        System.out.println(q.poll()); //removes and retrieve the head element
        System.out.println(q);
        System.out.println(q.peek()); //retrieve the head element
        System.out.println(q);
        
        q.remove(); //removes the head element
        System.out.println(q);
        
        System.out.println(q.remove(3));
        System.out.println(q);
        
         // ------------------------------- Example ----------------------
        System.out.println("--------------------Example--------------------");
        Map<String, String> m = new HashMap();
        m.put("A", "AA");
        m.put("B", "BB");
        m.put("C", "CC");
        for (String s : m.keySet()) {
            System.out.println(s);
        }
        System.out.println(m.get("A"));
        


        
        
    }
}




















