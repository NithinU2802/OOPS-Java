/******************************************************************************

Class to get and display value declare on it...

Input:
2
storm

Output:
2
storm

*******************************************************************************/

import java.util.*;

public class Main
{
    static int a;
    static String s;
	public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	a=x.nextInt();
	x.nextLine();
	s=x.nextLine();
	Main m=new Main();
	System.out.println(m.a);
	System.out.println(m.s);
	}
}
