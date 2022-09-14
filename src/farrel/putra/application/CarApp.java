package farrel.putra.application;

import farrel.putra.data.Avanza;
import farrel.putra.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
