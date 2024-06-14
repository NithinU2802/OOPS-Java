import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car(25.5,
                "1BC32E",
                Color.BLUE, true);

        Car car = new Car(13.9,
                "3D2OBN",
                Color.BLACK,
                false);

        System.out.println("My Car's License Plate: " + myCar.licensePlate);
        System.out.println("Sally's License Plate: " + car.licensePlate);

        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());

        double speed=50;
        speed=myCar.speedingUp(50);
        System.out.println(speed);

    }
}
