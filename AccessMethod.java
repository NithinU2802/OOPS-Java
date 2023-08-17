/******************************************************************************

        To load and access the elements of methods and variables.

*******************************************************************************/

class Student{
     String s="I am Student";
    Student(){
        System.out.println(s);
    }
   // s="I feel Sorry...!";
    Student(String a){
        System.out.println(a+"..! I am Student");
    }
    
    private void print(){
        System.out.println("I Got Something Special..!");
    }
    // Student(){
    //     System.out.println("I am College Student");
    // }
}

class College extends Student{
    College(){
        super("Nithin");
    }
    
    public void print(){
        System.out.println("Hey..! Not Special..?");
    }
}


public class Main
{
	public static void main(String[] args) {
	Student s=new Student();
	s=new Student("Hey");
	College c=new College();
	c.print();
	
	}
}
