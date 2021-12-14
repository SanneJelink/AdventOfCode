package Solutions.DayFive;

public class line {
    public int voorKomma;
    public int naKomma;

    public line(String input) {
        var values = input.split(",");
        voorKomma = Integer.parseInt(values[0]);
        naKomma = Integer.parseInt(values[1]);
    }
}
