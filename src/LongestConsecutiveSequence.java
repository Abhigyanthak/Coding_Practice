import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutiveSequence(int[] nums) {
        HashSet <Integer> set = new HashSet<>();
        int maxConsLen =0, currConsLen =0;
        for(Integer i : nums) {
            set.add(i);
        }
        for(int i: set) {
            if(!set.contains(i -1)) {
                currConsLen =1;
                while(set.contains(++i)){
                    currConsLen++;
                }
            }
            maxConsLen = Math.max(maxConsLen,currConsLen);
        }
        return maxConsLen;
    }
    public static void main(String[] args) {
        LongestConsecutiveSequence lcs = new LongestConsecutiveSequence();
        System.out.println(lcs.longestConsecutiveSequence(new int[]{100,4,200,1,3,2}));
    }
}
