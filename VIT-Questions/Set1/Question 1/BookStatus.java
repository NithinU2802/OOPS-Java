import java.util.Scanner;

interface BookStatus{
     static int Acc_Num=0;
     static String Title="",Author="";

     public void input();

     static void display(int Acc_Num, String Title, String Author) {
        System.out.println("Accession Number: " + Acc_Num);
        System.out.println("Title: " + Title);
        System.out.println("Author: " + Author);
    }

     default void compute(){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter Number Of Days Late: ");
        int days=x.nextInt();
        System.out.println("Fine: "+days*2+"\n");
       }

}