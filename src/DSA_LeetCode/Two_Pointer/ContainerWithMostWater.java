package DSA_LeetCode.Two_Pointer;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxArea = 0;
        int area = 0;
        while (left < right) {

            if(height[right]> height[left]){
                area = height[left] * (right - left);
                left++;
            } else {
                area = height[right] * (right - left);
                right--;
            }

            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        ContainerWithMostWater cw = new ContainerWithMostWater();
        System.out.println(cw.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}
