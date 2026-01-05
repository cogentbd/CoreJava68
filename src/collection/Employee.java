package collection;

class EmployeeAddress {
    private String address;
    private int road;
    private String area;
    private int postalCode;

    public EmployeeAddress(String address, int road, String area, int postalCode) {
        this.address = address;
        this.road = road;
        this.area = area;
        this.postalCode = postalCode;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoad() {
        return road;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return address + " " + area; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

class SalaryStructure {
    private double minSalary;
    private double currSalary;
    private double maxSalary;
    private String increamentType;
    private double incrementValue;

    public SalaryStructure(double minSalary, double currSalary, double maxSalary, String increamentType, double incrementValue) {
        this.minSalary = minSalary;
        this.currSalary = currSalary;
        this.maxSalary = maxSalary;
        this.increamentType = increamentType;
        this.incrementValue = incrementValue;
    }

    
    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getCurrSalary() {
        return currSalary;
    }

    public void setCurrSalary(double currSalary) {
        this.currSalary = currSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getIncreamentType() {
        return increamentType;
    }

    public void setIncreamentType(String increamentType) {
        this.increamentType = increamentType;
    }

    public double getIncrementValue() {
        return incrementValue;
    }

    public void setIncrementValue(double incrementValue) {
        this.incrementValue = incrementValue;
    }

    @Override
    public String toString() {
        return increamentType + " " + maxSalary + " " + currSalary; 
    }
    
    
}

public class Employee {
    private int id;
    private String employeeName;
    private Integer age;
    private SalaryStructure salary;
    private EmployeeAddress addr;

    public Employee(int id, String employeeName, Integer age, SalaryStructure salary, EmployeeAddress addr) {
        this.id = id;
        this.employeeName = employeeName;
        this.age = age;
        this.salary = salary;
        this.addr = addr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public SalaryStructure getSalary() {
        return salary;
    }

    public void setSalary(SalaryStructure salary) {
        this.salary = salary;
    }

    public EmployeeAddress getAddr() {
        return addr;
    }

    public void setAddr(EmployeeAddress addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return id + " " + employeeName + " " + age + salary + " " + addr; 
    }
     
}

