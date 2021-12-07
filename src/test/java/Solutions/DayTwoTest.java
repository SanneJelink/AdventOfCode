package Solutions;

import Solutions.DayTwo.DayTwo;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

public class DayTwoTest {
    DayTwo sut;

    DayTwoTest() {
        sut = new DayTwo();
    }

    @Test
    void PartTwoWorks() throws FileNotFoundException {
        var input = sut.getInput();
        sut.dive(input);

    }
}
