package Solutions.DayTwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class DayTwo {

    public ArrayList<String> getInput() throws FileNotFoundException {
        var input = new ArrayList<String>();

        File file = new File("/Users/SanneJelink/AdventOfCode/src/main/java/Solutions/DayTwo/input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            input.add(valueOf(sc.nextLine()));

        return input;
    }

    public void divePartOne(List<String> commands) {
        var horizontal = 0;
        var depth = 0;
        for (String command : commands) {
            String[] splited = command.split("\\s+");
            switch (splited[0]) {
                case "forward":
                    horizontal += Integer.parseInt(splited[1]);
                    break;
                case "down":
                    depth += Integer.parseInt(splited[1]);
                    break;
                case "up":
                    depth -= Integer.parseInt(splited[1]);
                    break;
            }
        }
        System.out.println(horizontal);
        System.out.println(depth);
    }

    public void divePartTwo(List<String> commands) {
        var horizontal = 0;
        var depth = 0;
        var aim = 0;
        for (String command : commands) {
            String[] splited = command.split("\\s+");
            switch (splited[0]) {
                case "forward":
                    horizontal += Integer.parseInt(splited[1]);
                    depth += aim * Integer.parseInt(splited[1]);
                    break;
                case "down":
                    aim += Integer.parseInt(splited[1]);
                    break;
                case "up":
                    aim -= Integer.parseInt(splited[1]);
                    break;
            }
        }
        System.out.println(horizontal);
        System.out.println(depth);
    }
}
