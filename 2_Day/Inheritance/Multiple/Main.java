interface Student{
    String name="Nithin";
    int age=21;
    static void print(){
        System.out.println("Student: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

interface Staff{
    String name="Malarmanan";
    int age=33;
    default void print(){
        System.out.println("Staff: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class College implements Student,Staff{

    public void print(){
        Student.print();
        System.out.println();
        Staff.super.print();
    }

    void studentName(){
        System.out.println(Student.name);
    }

}


public class Main {
    public static void main(String[] arg){
    College college=new College();
    college.print();
    }   
}
