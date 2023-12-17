import java.util.*;
import calculator.*;

public class Main {
    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    System.out.print("First Element: ");
    int a=x.nextInt();
    System.out.print("Second Element: ");
    int b=x.nextInt();
    int ch=0;
    do{
    System.out.println("\n1.Addition\n2.Subraction\n3.Mutliplication\n4.Exit\n");
    ch=x.nextInt();
    switch(ch){
        case 1:
            Addition add=new Addition(a,b);
            add.print();
            break;
        case 2:
            Subraction sub=new Subraction(a,b);
            sub.print();
            break;
        case 3:
            Multiplication mul=new Multiplication(a,b);
            mul.print();
            break;
        case 4:
            break;
        default:
            System.out.println("Invalid Choice..!");
    }
    }while(ch!=4);
    }
}
