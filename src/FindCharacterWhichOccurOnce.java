/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharacterWhichOccurOnce {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Long> collect = str.chars().mapToObj(c -> Character.valueOf((char)c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream().filter(e -> e.getValue() == 1L).forEach(e -> System.out.println(e.getKey()));
    }
}
