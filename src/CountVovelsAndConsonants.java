/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.stream.Collectors;

public class CountVovelsAndConsonants {
    public static void main(String[] args) {
        String s = "Hello World";
        Map<Boolean, Long> collect = s.chars().filter(Character::isLetter).boxed().collect(Collectors.partitioningBy(c -> "aeiou".indexOf((int)c) != -1, Collectors.counting()));
        System.out.println("vovels are " + String.valueOf(collect.get(true)));
        System.out.println("consonants are " + String.valueOf(collect.get(false)));
    }
}
