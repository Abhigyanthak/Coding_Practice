/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterUsingHashMap {
    public static void main(String[] args) {
        String s = "aaefccbdde";
        char[] ch = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (char c : ch) {
            map.put(Character.valueOf(c), map.getOrDefault(Character.valueOf(c), 0) + 1);
        }
        java.util.Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if ((Integer)entry.getValue() != 1) continue;
            System.out.println(entry.getKey());
            break;
        }
    }
}
