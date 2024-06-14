import java.util.Random;

public class Main {
    public static void main(String[] arg){
        Dog dog=new Dog();
        Cat cat=new Cat();
        if(dog instanceof Pet )
            dog.play();
        if(cat instanceof Pet)
            cat.play();
        Pet p;
        Random rand=new Random();
        int n=rand.nextInt(2);
        if(n==0)
            p=new Dog();
        else
            p=new Cat();
        p.play();
    }
}
