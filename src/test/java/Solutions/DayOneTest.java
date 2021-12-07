package Solutions;

import Solutions.DayOne.DayOne;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class DayOneTest {
    DayOne sut;

    DayOneTest() {
        sut = new DayOne();
    }

    @Test
    void PartTwoWorks() throws FileNotFoundException {
        var input = sut.getInput();
        System.out.println(sut.sonarSweepPartTwo(input));

//        Wrong: 1598,1596
    }
}
