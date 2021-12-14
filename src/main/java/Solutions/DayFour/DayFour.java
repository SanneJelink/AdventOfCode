package Solutions.DayFour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DayFour {

    public ArrayList<Integer> getInput() throws FileNotFoundException {
        var input = new ArrayList<Integer>();

        File file = new File("/Users/SanneJelink/AdventOfCode/src/main/java/Solutions/DayFour/input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            input.add(Integer.valueOf(sc.nextLine()));

        return input;
    }

    public void GiantSquid() throws FileNotFoundException {
        var input = getInput();


    }
}
