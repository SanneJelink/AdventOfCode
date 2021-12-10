package Solutions.DayThree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DayThree {

    public ArrayList<String> getInput() throws FileNotFoundException {
        ArrayList<String> input = new ArrayList<>();

        File file = new File("/Users/SanneJelink/AdventOfCode/src/main/java/Solutions/DayThree/input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            input.add(String.valueOf(sc.nextLine()));

        return input;
    }

    public int binaryDiagnostic(ArrayList<String> input) {
        StringBuilder gamma = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();

        for (int i = 0; i < String.valueOf(input.get(0)).length(); i++) {
            int finalI = i;

            var bytes = input.stream()
                    .map(in -> Integer.parseInt(String.valueOf(in.charAt(finalI))))
                    .collect(Collectors.toList());
            var total = bytes.stream().mapToInt(Integer::intValue).sum();

            if (total > input.size() / 2) {
                gamma.append(1);
                epsilon.append(0);
            } else {
                gamma.append(0);
                epsilon.append(1);
            }
        }

        return Integer.parseInt(String.valueOf(gamma), 2) * Integer.parseInt(String.valueOf(epsilon), 2);
    }
}
