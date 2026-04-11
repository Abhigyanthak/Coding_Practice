/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfEachBiagram {
    public static void main(String[] args) {
        String paragraph = "java is best and I love Java Java is powerful";
        String[] words = paragraph.toLowerCase().replaceAll("[^a-z\\s]", "").split(" ");
        List<String> list = IntStream.range(0, words.length - 1).mapToObj(i -> words[i] + " " + words[i + 1]).toList();
        Map collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
