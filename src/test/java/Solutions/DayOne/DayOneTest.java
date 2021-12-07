package Solutions.DayOne;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class DayOneTest {
    PartOne sut;

    DayOneTest() {
        sut = new PartOne();
    }

    @Test
    void PartTwoWorks() throws FileNotFoundException {
        var input = sut.getInput();
        System.out.println(sut.sonarSweepPartTwo(input));

//        Wrong: 1598,1596
    }
}
