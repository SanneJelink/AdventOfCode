package Solutions.DayOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DayOne {

    public ArrayList<Integer> getInput() throws FileNotFoundException {
        var input = new ArrayList<Integer>();

        File file = new File("/Users/SanneJelink/AdventOfCode/src/main/java/Solutions/DayOne/input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            input.add(Integer.valueOf(sc.nextLine()));

        return input;
    }

    public int sonarSweepPartOne(List<Integer> depths) {
        var biggerThanLast = IntStream
                .range(1, depths.size())
                .filter(i -> depths.get(i) > depths.get(i - 1))
                .mapToObj(depths::get)
                .collect(Collectors.toList());

        return biggerThanLast.size();
    }

    public int sonarSweepPartTwo(List<Integer> depths) {
        var sums = new ArrayList<Integer>();

        for (int i = 2; i < depths.size(); i++) {
            sums.add(depths.get(i) + depths.get(i - 1) + depths.get(i - 2));
        }

        var biggerThanLast = IntStream
                .range(1, sums.size())
                .filter(i -> sums.get(i) > sums.get(i - 1))
                .mapToObj(sums::get)
                .collect(Collectors.toList());

        return biggerThanLast.size();
    }
}
