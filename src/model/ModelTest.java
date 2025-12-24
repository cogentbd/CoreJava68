package model;

class Trainee {
    int id;
    String traineeName;
    int round;
    String courseName;
    String address;
    String contactNumber;
    String email;

    public void setId(int id) {
        this.id = id;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName;
    }

    public int getId() {
        return id;
    }

    public String getTraineeName() {
        return traineeName;
    }

}

class Change{
    void changeValue(Trainee t){
        t.id = 5;
    }
}

public class ModelTest {

    public static void main(String[] args) {
        System.out.println("Hello");
        Trainee t = new Trainee();
        t.id = 10;
        new Change().changeValue(t);
        System.out.println(t.id);
        //String name = t.traineeName = "Mr. Holud"; //set
        //System.out.println(name); //get

        //t.setId(10);
        //t.setTraineeName("Mr. violet");
        //System.out.println(t.getId());
        //System.out.println(t.getTraineeName());
        
        StringBuffer s = new StringBuffer("Cat");
        s.append("Dog");
        System.out.println(s);
        StringBuilder s1 = new StringBuilder("Cat");
        s1.append("Dog");
        System.out.println(s1);
        
    }
}
