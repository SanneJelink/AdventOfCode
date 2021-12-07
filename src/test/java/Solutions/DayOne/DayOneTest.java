package Solutions.DayOne;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class DayOneTest {
    PartTwo sut;

    DayOneTest() {
        sut = new PartTwo();
    }

    @Test
    void PartTwoWorks() throws FileNotFoundException {
        var input = sut.getInput();
        System.out.println(sut.sonarSweep(input));

//        Wrong: 1598,1596
    }
}
