package pl.mentelm.trainings.toll;

import pl.mentelm.trainings.vehicles.Vehicle;
import pl.mentelm.trainings.vehicles.VehicleType;

public interface TollCollector {

    VehicleType getSupportedType();
    void collectToll(Vehicle vehicle);
}
