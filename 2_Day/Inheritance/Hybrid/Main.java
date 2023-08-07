class GrandParent{
    void seniorPrint(){
        System.out.println("I am GrandParent..!");
    }
}

interface Parent1{
    default void mother(){
        System.out.println("I am Mother...!");
    }
}

interface Parent2{
    default void father(){
        System.out.println("I am Father...!");
    }
}

class Child extends GrandParent implements Parent1,Parent2{
    public void print(){
        System.out.println("I am Child...!");
    }
}



public class Main {
    public static void main(String[] arg){
    Child child=new Child();
    child.seniorPrint();
    child.father();
    child.mother();
    child.print();
    }
}
