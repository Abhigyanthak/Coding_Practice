/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacterAndItsCount {
    public static void main(String[] args) {
        String s = "Abhigyan".toLowerCase();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] ch = s.toCharArray();
        int n = ch.length;
        for (int i = 0; i < n; ++i) {
            Character c2 = Character.valueOf(ch[i]);
            map.put(c2, map.getOrDefault(c2, 0) + 1);
        }
        java.util.Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if ((Integer)entry.getValue() <= 1) continue;
            System.out.println("Duplicate Character in String is " + String.valueOf(entry.getKey()) + " and count is " + String.valueOf(entry.getValue()));
        }
        LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> Character.valueOf((char)c)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.entrySet().stream().filter(e -> e.getValue() > 1L).forEach(e -> System.out.println(String.valueOf(e.getKey()) + "->" + String.valueOf(e.getValue())));
    }
}
