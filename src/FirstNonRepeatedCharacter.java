/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String s = "aabcbdeef";
        Character character = s.chars().mapToObj(c -> Character.valueOf((char)c)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(e -> (Long)e.getValue() == 1L).map(Map.Entry::getKey).findFirst().get();
        System.out.println(character);
    }
}
