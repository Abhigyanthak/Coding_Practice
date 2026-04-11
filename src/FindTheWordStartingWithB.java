/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class FindTheWordStartingWithB {
    public static void main(String[] args) {
        String s = "apple box fox beat bear max";
        char ch = 'b';
        Arrays.stream(s.split(" ")).filter(word -> word.startsWith(String.valueOf(ch))).forEach(System.out::println);
    }
}
