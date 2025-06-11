package n;

public class NumberChecker {
    public static String check(int number) {
        if (number > 0) return "positive";
        else if (number < 0) return "negative";
        else return "zero";
    }
}

