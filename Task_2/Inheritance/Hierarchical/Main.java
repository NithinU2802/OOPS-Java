class Parent{
    void print(){
        System.out.println();
        System.out.println("I am Parent Class..!");
    }
}

class Child1 extends Parent{
    void print(){
        System.out.println();
        super.print();
        System.out.println("I am Child1 Class..!");
    }
}

class Child2 extends Parent{
    void print(){
        System.out.println();
        super.print();
        System.out.println("I am Child2 Class..!");
    }
}


public class Main {
    public static void main(String[] arg){
    Parent parent=new Parent();
    parent.print();
    Child1 child1=new Child1();
    child1.print();
    Child2 child2=new Child2();
    child2.print();
    }
}
