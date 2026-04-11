/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;

public class FindTheProductOfFirstTwoElements {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 5, 6, 9, 2, 4};
        List<Integer> list = Arrays.stream(arr).boxed().limit(2L).toList();
        int ans = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(ans);
    }
}
