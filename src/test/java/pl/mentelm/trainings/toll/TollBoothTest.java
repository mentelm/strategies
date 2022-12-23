package pl.mentelm.trainings.toll;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.mentelm.trainings.vehicles.Hatchback;
import pl.mentelm.trainings.vehicles.Sedan;
import pl.mentelm.trainings.vehicles.Tank;
import pl.mentelm.trainings.vehicles.Truck;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest()
class TollBoothTest {

    @Autowired
    TollBooth testee;

    @Test
    void hey() {
        // given
        var vehicles = List.of(
                new Hatchback(),
                new Sedan(),
                new Truck(),
                new Tank());

        // when
        vehicles.forEach(testee::collectToll);
    }
}
