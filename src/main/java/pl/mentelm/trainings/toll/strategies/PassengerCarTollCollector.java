package pl.mentelm.trainings.toll.strategies;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.mentelm.trainings.toll.TollCollector;
import pl.mentelm.trainings.vehicles.Vehicle;
import pl.mentelm.trainings.vehicles.VehicleType;

@Slf4j
@Component
public class PassengerCarTollCollector implements TollCollector {

    @Override
    public VehicleType getSupportedType() {
        return VehicleType.PASSENGER_CAR;
    }

    @Override
    public void collectToll(Vehicle vehicle) {
        log.info("Collected toll from a passenger car!");
    }
}
