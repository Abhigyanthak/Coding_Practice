/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 3, 4, 5};
        List<Integer> arrayList = Arrays.asList(1, 2, 2, 3, 4, 5);
        HashSet set = new HashSet();
        List duplicates = arrayList.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
        System.out.println(duplicates);
    }
}
