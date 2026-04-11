/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Map;

public class CountRepeatedNumberOfWordsInString {
    public static void main(String[] args) {
        String str = "Abhigyan is the the best";
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String[] words = str.split("\\s+");
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((Integer)entry.getValue() < 2) continue;
            System.out.println("Repeated words are :" + (String)entry.getKey());
        }
    }
}
