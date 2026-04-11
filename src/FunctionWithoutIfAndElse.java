/*
 * Decompiled with CFR 0.152.
 */
public class FunctionWithoutIfAndElse {
    public static int Function(int n) {
        return n == 7 ? 11 : 7;
    }

    public static void main(String[] args) {
        System.out.println(FunctionWithoutIfAndElse.Function(11));
    }
}
