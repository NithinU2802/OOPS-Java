class College{
    void print(){
        System.out.println("College...!");
    }
}

class Student extends College{
    @Override
    void print(){
        System.out.println("Student...!");
    }
}

class Staff extends College{
    @Override
    void print(){
        System.out.println("Staff...!");
    }
}


public class Overriding {
    public static void main(String[] arg){
    College college=new Student();
    college.print();
    college=new Staff();
    college.print();
    }
}
