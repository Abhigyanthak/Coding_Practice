/*
 * Decompiled with CFR 0.152.
 */
public class FindTheDigitEndingWithSix {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 34, 56, 66, 36};
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 10 != 6) continue;
            System.out.println(arr[i]);
        }
    }
}
