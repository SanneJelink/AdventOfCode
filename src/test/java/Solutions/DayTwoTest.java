package Solutions;

import Solutions.DayTwo.DayTwo;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class DayTwoTest {
    DayTwo sut;

    DayTwoTest() {
        sut = new DayTwo();
    }

    @Test
    void PartOneWorks() throws FileNotFoundException {
        var input = sut.getInput();
        sut.divePartOne(input);

    }

    @Test
    void PartTwoWorks() throws FileNotFoundException {
        var input = sut.getInput();
        sut.divePartTwo(input);
    }
}
