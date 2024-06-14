package Crash_Course.Coin_FIip;

import java.util.Random;

public class Coin {
    public final static int HEAD=1;
    public final static int TAIL=0;
    static int value=-1;

    public Coin(int head){
        value=head;
    }

    void flip(){
        Random ran=new Random();
        value=ran.nextInt(2);
    }

    String result(){
        if(value==HEAD)
            return "HEAD";
        else if(value==TAIL)
            return "TAIL";
        else 
            return "INVALID";
    }

}
