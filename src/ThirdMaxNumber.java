import java.util.Arrays;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(ThirdMaxNumber.thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
}
