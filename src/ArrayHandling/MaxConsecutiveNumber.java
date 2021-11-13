package ArrayHandling;

public class MaxConsecutiveNumber {

    static int findMaxConsecutiveNumbers(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,1,1,1,0,1};
        int result = findMaxConsecutiveNumbers(nums);
        System.out.println(result);
    }
}
