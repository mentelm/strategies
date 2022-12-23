package pl.mentelm.trainings.toll;

import pl.mentelm.trainings.vehicles.VehicleType;

public class UnsupportedVehicleTypeException extends RuntimeException {
    public UnsupportedVehicleTypeException(VehicleType type) {
        super("No collector for vehicle type %s".formatted(type));
    }
}
