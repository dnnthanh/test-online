import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String str[] = {"aw", "aa", "ee", "oo", "ow", "uw", "dd", "w"};
        String input = "hfdawhwhcoomdd";
        Stream<String> stream = Arrays.stream(str);
        long count = stream.filter(
                s -> input.contains(s)
        ).count();
        System.out.println(count);
    }
}
