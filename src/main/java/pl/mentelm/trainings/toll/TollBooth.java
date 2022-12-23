package pl.mentelm.trainings.toll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.mentelm.trainings.vehicles.Vehicle;
import pl.mentelm.trainings.vehicles.VehicleType;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Service
public class TollBooth {

    private final Map<VehicleType, TollCollector> collectorsByVehicleType;

    @Autowired
    public TollBooth(Collection<TollCollector> collectors) {
        this.collectorsByVehicleType = collectors.stream().collect(Collectors.toMap(
                TollCollector::getSupportedType,
                Function.identity()
        ));
    }

    public void collectToll(Vehicle vehicle) {
        TollCollector collector = collectorsByVehicleType.get(vehicle.getType());

        if (collector == null) {
            log.error("No collector found for vehicle type {}", vehicle.getType());
        }

        collector.collectToll(vehicle);
    }
}
