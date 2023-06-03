import myshop.MyPizza;
import java.util.*;

public class MyAddon {
    public static void main(String[] arg){ 
    Scanner x=new Scanner(System.in);
    MyPizza pizza=new MyPizza();
    System.out.print("Enter Pizza Cost: ");
    pizza.pizza=x.nextInt();
    x.nextLine();
    System.out.print("Enter Pepsi Cost: ");
    pizza.pepsi=x.nextInt();
    System.out.println("Addon Cost: "+pizza.addonCost());
    System.out.println("Pizza Cost: "+pizza.pizzaCost());
    }
}
