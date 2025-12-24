package package1;

public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setUsername("username1");
        u1.setEmail("user@mail.com");
        u1.setSalary(200045.00);
        u1.setAge(25);
        
        System.out.println(u1.toString());
        
        
        
        //System.out.println(u1.getUsername() + " " + u1.getAge() + " " + u1.getSalary());
    DBLayer db = new DBLayer();
    db.insert(u1);
    }
}

class DBLayer{ 
    void insert(User u){
        String sql = "insert into employees (username, salary) values ('+u.getuserName()+')";
    }
    
    void update(){
    
    }
    void delete(){
    
    }
    
    
}