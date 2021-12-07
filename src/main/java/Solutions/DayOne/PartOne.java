package Solutions.DayOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PartOne {

    public void getInput() throws FileNotFoundException {
        var input = new ArrayList<Integer>();

        File file = new File("Solutions/DayOne/input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            input.add(Integer.valueOf(sc.nextLine()));
    }

    public int sonarSweep(List<Integer> depths) throws FileNotFoundException {
        var biggerThanLast = IntStream
                .range(1, depths.size())
                .filter(i -> depths.get(i) > depths.get(i - 1))
                .mapToObj(depths::get)
                .collect(Collectors.toList());

        return biggerThanLast.size();
    }
}
