package homework3;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("Алексей", "Александр", "Максим", "Иван", "Олег", "Кирилл",
                "Макс", "Саня", "Кирилл", "Александр", "Евгений", "Роман", "Лев", "Сергей");

        System.out.println(" ");
        System.out.println("Сводка:");

        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : words) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Без повторов: ");

        Set<String> unique = new HashSet<>(words);
        unique.forEach(System.out::println);

    }

}
