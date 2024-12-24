import java.util.*;
class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        sort(nums);
        for(int i = 0;i < n; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return n;
    }

    static void sort(int[] nums){//cyclic sort because the numbers are in range
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(correct < nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}