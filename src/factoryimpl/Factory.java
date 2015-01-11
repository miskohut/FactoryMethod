package factoryimpl;

import factoryimpl.cars.*;

/**
 * Created by misko on 11.1.2015.
 */
public class Factory {

    public Car create(String car, String description) {

        switch(car.toLowerCase()) {
            case "audi":
                return new Audi(description);
            case "bmw":
                return new BMW(description);
            case "mercedes":
                return new Mercedes(description);
            case "nissan":
                return new Nissan(description);
            case "renault":
                return new Renault(description);
            case "skoda":
                return new Skoda(description);
            default:
                return null;
        }
    }
}

