public class Spider extends Insect{
    public int age;
    public boolean isPoisonous;
    public Spider(int age,boolean isPoisonous){
        super(age,8);
        this.age=age;
        this.isPoisonous=isPoisonous;
    }

    public void says(){
        System.out.println("HSSS");
    }

}
