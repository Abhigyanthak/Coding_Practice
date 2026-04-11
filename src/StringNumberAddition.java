import java.util.Scanner;

public class StringNumberAddition {
    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? (num1.charAt(i) - '0') : 0;
            int digit2 = (j >= 0) ? (num2.charAt(j) - '0') : 0;

            int sum = digit1 + digit2 + carry;
            result.insert(0, sum % 10); // Insert the current digit at the beginning
            carry = sum / 10;

            i--;
            j--;
        }

        // Handle leading zeros if the result is not just "0"
        if (result.length() > 1 && result.charAt(0) == '0') {
            return result.substring(1);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("123", "456")); // Output: 579
        System.out.println(addStrings("99", "1"));   // Output: 100
        System.out.println(addStrings("0", "0"));   // Output: 0
        System.out.println(addStrings("1234567890123456789", "9876543210987654321")); // Large numbers
    }
}
