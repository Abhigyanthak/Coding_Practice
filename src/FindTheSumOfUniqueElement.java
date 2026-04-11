/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class FindTheSumOfUniqueElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 7, 8, 1, 1, 8, 8, 7};
        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);
    }
}
