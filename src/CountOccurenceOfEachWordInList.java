/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccurenceOfEachWordInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "mat", "bat", "apple", "banana", "Apple");
        Map<String, Long> frequency = words.stream().map(String::toLowerCase).collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.print(frequency);
    }
}
