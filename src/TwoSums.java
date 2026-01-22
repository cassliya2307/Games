import java.util.Arrays;

public class TwoSums {

    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for(int count = 0; count < nums.length; count++){
            for(int index = 0; index < count; index++){
                if(nums[count] + nums[index] == target){
                    indices[0] = index;
                    indices[1] = count;}
            }
        }

        return indices;
    }


    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6};
        int target = 8;

        System.out.println(Arrays.toString(TwoSums.twoSum(numbers,target)));

    }
}
