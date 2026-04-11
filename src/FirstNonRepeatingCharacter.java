/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "Programming";
        LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> Character.valueOf((char)c)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Character c2 = collect.entrySet().stream().filter(e -> e.getValue() == 1L).map(Map.Entry::getKey).findFirst().get();
        System.out.println(c2);
    }
}
