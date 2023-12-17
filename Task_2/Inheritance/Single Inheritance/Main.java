class Parent{
    void print(){
        System.out.println("I am Parent Class..!");
    }
    String name="Nithin";
}

class Child extends Parent{
    void print(){
    super.print();
    System.out.println("I am Child Class..!");
    }
}

public class Main extends Parent{
    public static void main(String[] arg){
    Child child=new Child();
    child.print();
    }
}
