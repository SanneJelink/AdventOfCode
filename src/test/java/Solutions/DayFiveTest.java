package Solutions;

import Solutions.DayFive.DayFive;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class DayFiveTest {
    DayFive sut;

    DayFiveTest() {
        sut = new DayFive();
    }

    @Test
    void PartOneWorks() throws FileNotFoundException {
        System.out.println(sut.HydrothermalVenture());
    }

    @Test
    void PartTwoWorks() throws FileNotFoundException {

    }
}
