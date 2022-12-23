package pl.mentelm.trainings.vehicles;

public class Sedan extends Vehicle {
    @Override
    public VehicleType getType() {
        return VehicleType.PASSENGER_CAR;
    }
}
