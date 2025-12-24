package package1;


public class User {
    private String username;
    private String email;
    private int age;
    private double salary;

    //getter //setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Username : " + username + " email : " + email + " age  :" + age; //To change body of generated methods, choose Tools | Templates.
    }

}
