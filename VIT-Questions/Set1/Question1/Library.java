import java.util.*;

class Library implements BookStatus{
    private static int Acc_Num;
    private static String Title,Author;
    public void input(){
        Scanner x=new Scanner(System.in);
        System.out.print("Enter Account No: ");
        Acc_Num=x.nextInt();
        x.nextLine();
        System.out.print("Enter Title: ");
        Title=x.nextLine();
        System.out.print("Enter Author Name: ");
        Author=x.nextLine();
   }
   public static void main(String[] arg){
    Library library=new Library();
    library.input();
    library.compute();
    BookStatus.display(Acc_Num,Title,Author);
   }
}
