package Solutions;

import Solutions.DayThree.DayThree;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class DayThreeTest {
    DayThree sut;

    DayThreeTest() {
        sut = new DayThree();
    }

    @Test
    void partOneWorks() throws FileNotFoundException {
        var input = sut.getInput();
        System.out.println(sut.binaryDiagnostic(input));
    }
}
