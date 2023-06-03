import java.util.*;

public class Main{
    public static void main(String[] arg){
    Scanner x=new Scanner(System.in);
    double[] JohnMark=new double[4];
    double[] SamMark=new double[3];


    System.out.println("----Sam's Mark----");
    for(int i=0;i<3;i++){
    System.out.print("Enter Sam Mark"+(i+1)+" : ");
    SamMark[i]=x.nextDouble();
    x.nextLine();
    }


    System.out.println("----John's Mark----");
    for(int i=0;i<4;i++){
    System.out.print("Enter John Mark"+(i+1)+" : ");
    JohnMark[i]=x.nextDouble();
    x.nextLine();
    }

    Sam sam=new Sam(SamMark);
    John john=new John(JohnMark);
    System.out.println();
    System.out.println(String.format("Sam's CGPA: %.2f",sam.getCGPA()));
    System.out.println(String.format("John's CGPA: %.2f",john.getCGPA()));
    }
}
