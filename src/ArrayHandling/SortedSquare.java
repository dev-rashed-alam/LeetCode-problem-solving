package ArrayHandling;

public class SortedSquare {

    static int[] sortedSquares(int[] nums) {
        int[] listOfSquares = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            listOfSquares[i] = nums[i] * nums[i];
        }
        return sortByAsc(listOfSquares);
    }

    static int[] sortByAsc(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] k = {-7,-3,2,3,11};
        int[] result = sortedSquares(k);

        for (int j = 0; j < result.length; j++){
            System.out.println(result[j]);
        }
    }
}
