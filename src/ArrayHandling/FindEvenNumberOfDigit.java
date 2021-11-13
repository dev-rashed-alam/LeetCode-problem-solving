package ArrayHandling;

public class FindEvenNumberOfDigit {

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += checkOddOrEven(nums[i]);
        }
        return count;
    }

    static int checkOddOrEven(int num) {
        if (String.valueOf(num).length() % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] res = {12,345,2,6,7896};
        System.out.println(findNumbers(res));
    }
}
