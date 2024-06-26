import java.awt.*;

public class Car {

    // BluePrint
    // double -> decimal 34.5, 32.1
    // String -> "Value"
    // Color -> from awt library
    // boolean -> true or false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTailingWorking;

    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTaillightsWorking) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTailingWorking = inputAreTaillightsWorking;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    public double speedingUp(double currentSpeed){
        currentSpeed+=100.0;
        return currentSpeed;
    }

}
