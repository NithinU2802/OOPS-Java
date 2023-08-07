import java.util.*;

class Student{

    private String name;
    private int age;

    void setName(String name){
        this.name=name;
    }
    
    void setAge(int age){
        this.age=age;
    } 

    String getName(){
        return name;
    }
    
    int getAge(){
        return age;
    }

}

public class Encapsulation {
    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    Student student=new Student();
    System.out.print("Enter Student Name: ");
    student.setName(x.nextLine());
    System.out.print("Enter Age:");
    student.setAge(x.nextInt());

    System.out.println("Name: "+student.getName());
    System.out.println("Age: "+student.getAge());
    }
}
