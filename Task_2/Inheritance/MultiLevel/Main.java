class College{
    void college(){
        System.out.println("K Ramakrishnan College of Technology");
    }
}

class Student extends College{
    void student(){
        System.out.println("I am Nithin");
    }
}

class Staff extends Student{
    
    void Advisor(){
        System.out.println("My Advisor Malarmanan");
    }
}

class About extends Staff{
    void print(){
        System.out.println("Hello Everyone....!");
    }
}

public class Main{
    public static void main(String[] args){
    About about=new About();
    about.print();
    about.student();
    about.Advisor();
    about.college();
    }   
    
}
