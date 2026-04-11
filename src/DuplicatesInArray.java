/*
 * Decompiled with CFR 0.152.
 */
public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 10, 4, 6, 8, 4, 6, 6, 10, 10};
        System.out.println("Duplicate elements found:");
        block0: for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == -1) continue;
            for (int j = i + 1; j < numbers.length; ++j) {
                if (numbers[i] != numbers[j]) continue;
                System.out.println(numbers[j]);
                numbers[j] = -1;
                continue block0;
            }
        }
    }
}
