package Solutions.DayFive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DayFive {
    public ArrayList<String> getInput() throws FileNotFoundException {
        ArrayList<String> input = new ArrayList<>();

        File file = new File("/Users/SanneJelink/AdventOfCode/src/main/java/Solutions/DayThree/example.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            input.add(String.valueOf(sc.nextLine()));

        return input;
    }

    public int HydrothermalVenture() throws FileNotFoundException {
        var input = getInput();
        var formattedInput = formatInput(input);
        //TODO right size
        int[][] values = new int[80][80];

        for (int i = 0; i < input.size(); i++) {
            var start = formattedInput[i][0];
            var end = formattedInput[i][1];

            //TODO fixen
            if (start.voorKomma == end.voorKomma) {
                if (start.naKomma < end.naKomma) {
                    values = noteerLijnen(start, end, false, values);
                } else {
                    values = noteerLijnen(end, start, false, values);
                }
            } else if (start.naKomma == end.naKomma) {
                if (start.voorKomma < end.voorKomma) {
                    values = noteerLijnen(start, end, true, values);
                } else {
                    values = noteerLijnen(end, start, true, values);
                }
            }

        }
        //TODO Return cells values > 2
        return CheckTwo(values);

    }

    private int[][] noteerLijnen(line beginning, line end, boolean horizontaal, int[][] values) {
        if (horizontaal) {
            for (int i = beginning.voorKomma; i <= end.voorKomma - beginning.voorKomma; i++) {
                values[i][beginning.naKomma] += 1;
            }
        } else {
            for (int i = beginning.naKomma; i <= end.naKomma - beginning.naKomma; i++) {
                values[beginning.voorKomma][i] += 1;
            }
        }
        return values;
    }

    private line[][] formatInput(ArrayList<String> input) {
        line[][] values = new line[input.size()][2];

        for (int i = 0; i < input.size(); i++) {
            String[] stringarray = input.get(i).split(" -> ");
            values[i][0] = new line(stringarray[0]);
            values[i][1] = new line(stringarray[1]);
        }
        return values;
    }

    private int CheckTwo(int[][] values) {
        var total = 0;
        for (int x = 0; x < 80; x++) {
            for (int y = 0; y < 80; y++) {
                if (values[x][y] >= 2) {
                    total++;
                }
            }
        }
        return total;
    }
}
