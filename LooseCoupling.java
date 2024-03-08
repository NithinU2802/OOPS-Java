interface Vehicle{
    public void move();
}

class Car implements Vehicle{
    public void move(){
        System.out.println("Car is Moving...");
    }
}

class Truck implements Vehicle{
    public void move(){
        System.out.println("Truck is Moving...");
    }
}

class LooseCoupling{
    public static void main(String[] arg){
        Vehicle v=new Car();
        v.move();
        v=new Truck();
        v.move();
    }
}
