package balextranit;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Vehicle> vehicles;

    public Company() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public boolean scheduleVehicle(Passenger passenger) {
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                v.setAvailable(false);
                v.setCurrentPassenger(passenger);
                return true;
            }
        }
        return false;
    }
}
