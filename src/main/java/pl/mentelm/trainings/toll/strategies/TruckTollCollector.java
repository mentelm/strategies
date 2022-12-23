package pl.mentelm.trainings.toll.strategies;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import pl.mentelm.trainings.toll.TollCollector;
import pl.mentelm.trainings.vehicles.Vehicle;
import pl.mentelm.trainings.vehicles.VehicleType;

@Slf4j
@Component
public class TruckTollCollector implements TollCollector {
    @Override
    public VehicleType getSupportedType() {
        return VehicleType.TRUCK;
    }

    @Override
    public void collectToll(Vehicle vehicle) {
        log.warn("Toll collected from a very heavy vehicle");
    }
}
