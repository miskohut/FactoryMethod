package factoryimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by misko on 11.1.2015.
 */
public class Main {

    Factory factory;

    List<Vehicle> vehicles;

    public Main() {
        factory = new Factory();
        vehicles = new ArrayList<>();

        vehicles.add(factory.create("audi", "fast and elegant"));
        vehicles.add(factory.create("bmw", "expensive and reliable"));
        vehicles.add(factory.create("skoda", "best low car"));
        vehicles.add(factory.create("vad0", "bla bla"));
        vehicles.add(factory.create("renault", "very hmm ... good"));
    }

    public void printCars() {
        for (Vehicle vehicle : vehicles) {
            try {
                System.out.println(vehicle.getDescription());
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.printCars();
    }
}
