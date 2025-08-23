import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordsCounterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter str: ");
        String str = scanner.nextLine();

        System.out.println("Enter count: ");
        int count = scanner.nextInt();

        wordCounter(str, count);
    }

    private static void wordCounter(String s, int n) {
        Map<String, Integer> map = new HashMap<>();
        String[] words = s.split(" ");
        for (String w : words) {
            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }
        for (var entry : map.entrySet()) {
            if (entry.getValue() == n) {
                System.out.println(entry.getKey());
            }
        }
    }
}