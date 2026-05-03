package DSA_LeetCode.Two_Pointer;

/**
 * A utility class that provides functionality to reverse only alphabetic characters
 * in a string while keeping non-alphabetic characters (special characters, digits, etc.)
 * in their original positions.
 *
 * <p>This implementation uses the Two-Pointer technique to efficiently solve the problem
 * in O(n) time complexity and O(n) space complexity.</p>
 *
 * @author Abhigyan
 * @version 1.0
 */
public class ReverseOnlyCharacters {

    /**
     * Reverses only the alphabetic characters in the given string while maintaining
     * the positions of all non-alphabetic characters.
     *
     * <p>Algorithm:
     * <ul>
     *   <li>Initialize two pointers: left at the start and right at the end</li>
     *   <li>Move left pointer right if it points to a non-letter character</li>
     *   <li>Move right pointer left if it points to a non-letter character</li>
     *   <li>When both pointers point to letters, swap them and move both pointers</li>
     *   <li>Continue until left >= right</li>
     * </ul>
     * </p>
     *
     * @param s the input string containing alphabetic and non-alphabetic characters
     * @return a new string with only alphabetic characters reversed, while special
     *         characters remain in their original positions
     *
     * @example
     * Input: "ab$cd"
     * Output: "dc$ba"
     * (The letters 'a', 'b', 'c', 'd' are reversed to 'd', 'c', 'b', 'a',
     *  while '$' remains in position 2)
     *
     * @throws NullPointerException if the input string is null
     *
     * @time O(n) where n is the length of the string
     * @space O(n) for the character array conversion
     */
    /**
     * Reverses only the alphabetic characters and prints the swap operations.
     *
     * @param s the input string
     * @return the reversed string
     */
    public static String reverseOnlyCharactersWithSwaps(String s){
        int n = s.length();
        int left = 0;           // Left pointer starting from beginning
        int right = n-1;        // Right pointer starting from end
        char[] chars = s.toCharArray();  // Convert string to character array for manipulation

        System.out.println("Original String: " + s);
        // Two-pointer approach: move pointers towards each other
        while(left < right){
            // Skip non-letter characters on the left
            if(!Character.isLetter(chars[left])){
                left++;
            }
            // Skip non-letter characters on the right
            else if(!Character.isLetter(chars[right])){
                right--;
            }
            // Both pointers point to letters: swap them
            else{
                char leftChar = chars[left];
                char rightChar = chars[right];
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                System.out.println("Swap '" + leftChar + "' and '" + rightChar + "'");
                left++;
                right--;
            }
        }
        return String.valueOf(chars);
    }

    public static String reverseOnlyCharacters(String s){
        int n = s.length();
        int left = 0;           // Left pointer starting from beginning
        int right = n-1;        // Right pointer starting from end
        char[] chars = s.toCharArray();  // Convert string to character array for manipulation

        // Two-pointer approach: move pointers towards each other
        while(left < right){
            // Skip non-letter characters on the left
            if(!Character.isLetter(chars[left])){
                left++;
            }
            // Skip non-letter characters on the right
            else if(!Character.isLetter(chars[right])){
                right--;
            }
            // Both pointers point to letters: swap them
            else{
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(chars);
    }

    /**
     * Main method to demonstrate the reverseOnlyCharacters functionality.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        String result = reverseOnlyCharactersWithSwaps("ab$cd");
        System.out.println("Result: " + result);
    }
}
