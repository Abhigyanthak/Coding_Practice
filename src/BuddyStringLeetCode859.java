 public class BuddyStringLeetCode859 {
    public static void main(String args []){
       String s ="aaaaaaabc";
       String gaol = "aaaaaaacb";
       System.out.println(BuddyStringLeetCode859.buddyString(s,gaol));
    }
    public static boolean buddyString(String s, String goal){
        // Strings must have same length
        if(s.length() != goal.length()){
            return false;
        }

        // If strings are equal, check if there's a duplicate character
        if(s.equals(goal)){
            // Count character frequencies
            java.util.Set<Character> seen = new java.util.HashSet<>();
            for(char c : s.toCharArray()){
                if(seen.contains(c)){
                    return true; // Found duplicate
                }
                seen.add(c);
            }
            return false; // No duplicate character
        }

        // If strings are different, find positions where they differ
        java.util.List<Integer> diffPositions = new java.util.ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                diffPositions.add(i);
            }
        }

        // Should have exactly 2 differences
        if(diffPositions.size() != 2){
            return false;
        }

        // Check if swapping those two characters makes them equal
        int pos1 = diffPositions.get(0);
        int pos2 = diffPositions.get(1);

        return s.charAt(pos1) == goal.charAt(pos2) && s.charAt(pos2) == goal.charAt(pos1);
    }
}
