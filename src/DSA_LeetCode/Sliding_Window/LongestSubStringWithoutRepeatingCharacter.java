package DSA_LeetCode.Sliding_Window;

public class LongestSubStringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int result = 0;
        int [] map = new int [256];

        while(right < s.length()){
            map[s.charAt(right)]++;

            while(map[s.charAt(right)] > 1){
                map[s.charAt(left)]--;
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }
    public static void main(String args []){
        LongestSubStringWithoutRepeatingCharacter ls = new LongestSubStringWithoutRepeatingCharacter();
        System.out.println(ls.lengthOfLongestSubstring("pwwkew"));
    }
}
