/******************************************************************************

Modifiers in class...

Input:
2
private Method

Output:
2
private Method
public Method

*******************************************************************************/

import java.util.*;

class demo{
    public static int a=10;          //public 
    protected static void print(){             // protected
        System.out.println("Public Method");
        // System.out.println(s); // s is declared as private..
    }
}

public class Main extends demo
{
    private static String s; //private
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	a=x.nextInt();
	x.nextLine();
	s=x.nextLine();
	Main m=new Main();
	System.out.println(a);
	System.out.println(m.s);
	print();
	}
}

