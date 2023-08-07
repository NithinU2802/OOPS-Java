
class Calculator{

    int add(int a,int b){
        return a+b;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }
}

public class Overloading {
    public static void main(String[] args){
    Calculator calculator=new Calculator();
    System.out.println(calculator.add(1,2));
    System.out.println(calculator.add(2,3,4));
    }
}
