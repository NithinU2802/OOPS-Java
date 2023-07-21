/******************************************************************************

        Implementation of Abstraction 

*******************************************************************************/
import java.util.*;

abstract class Animal{
    void print(){
        System.out.println("I am Animal");
    }
    abstract void printAnimal();
}

class Dog extends Animal{
    void printAnimal(){
        System.out.println("I am Dog");
    }
}

public class Abstraction
{
	public static void main(String[] args) {
	Animal dog=new Dog();
	dog.print();
	dog.printAnimal();
	}
}
