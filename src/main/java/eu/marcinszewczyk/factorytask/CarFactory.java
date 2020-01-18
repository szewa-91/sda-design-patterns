package eu.marcinszewczyk.factorytask;

import java.util.Arrays;
import java.util.List;

public class CarFactory {
    public static Car createContinentalCar(CarType carType) {

        List<String> list = Arrays.asList("A", "B", "C");

        if (carType == CarType.SEDAN) {
            return new Sedan("2007", "1.5", "benzyna", SteeringWheelPosition.LEFT);
        }
        else if (carType == CarType.HATCHBACK) {
            return new Hatchback("2017", "1.5", "gaz", SteeringWheelPosition.LEFT);
        }
        else {
            return null;
        }
    }

    public static Car createBritishCar(CarType carType) {
        if (carType == CarType.SEDAN) {
            return new Sedan("2007", "1.5", "benzyna", SteeringWheelPosition.RIGHT);
        }
        else if (carType == CarType.HATCHBACK) {
            return new Hatchback("2017", "1.5", "gaz", SteeringWheelPosition.RIGHT);
        }

        else {
            return null;
        }
    }
}
