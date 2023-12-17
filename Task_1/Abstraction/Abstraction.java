
abstract  class Student{
    abstract void print();
}

class stud1 extends Student{

    void print(){
        System.out.println("Name:Nithin\n71\n");
    }
}

class stud2 extends Student{

    void print(){
        System.out.println("Name:Aslam\n61\n");
    }
}

class stud3 extends Student{

    void print(){
        System.out.println("Name:Jameer\nAge:62\n");
    }
}

class Abstraction{
    public static void main(String[] arg){
    Student student =new stud1();
    student.print();
    student=new stud2();
    student.print();
    student=new stud3();
    student.print();
    }
}