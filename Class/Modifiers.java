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

public class Modifiers extends demo
{
    private static String s; //private
	public static void main(String[] args) {
	try (Scanner x = new Scanner(System.in)) {
		a=x.nextInt();
		x.nextLine();
		s=x.nextLine();
	}
	// Modifiers m=new Modifiers();
	System.out.println(a);
	System.out.println(Modifiers.s);
	print();
	}
}

