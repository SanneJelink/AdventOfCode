package Solutions.DayOne.PartOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SonarSweep {

    public void getInput() throws FileNotFoundException {
        var input = new ArrayList<Integer>();

        File file = new File("Solutions/DayOne/PartOne/input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            input.add(Integer.valueOf(sc.nextLine()));
    }

    public int sonarSweep(List<Integer> depths) throws FileNotFoundException {
        var biggerThanLast = IntStream
                .range(0, depths.size())
                .filter(i -> i > 1 && depths.get(i - 1) > depths.get(i - 2))
                .mapToObj(depths::get)
                .collect(Collectors.toList());

        return biggerThanLast.size();
    }
}
