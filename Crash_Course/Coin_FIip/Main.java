package Crash_Course.Coin_FIip;

public class Main {
    public static void main(String[] arg){
        Coin coin=new Coin(Coin.HEAD);
        for(int i=0;i<10;i++){
            coin.flip();
            System.out.println("Filp: "+coin.result());
        }
    }
}
