// https://leetcode.com/problems/find-the-duplicate-number/description/
import java.util.*;
class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int i = 0;
        int ans = -1;
        while(i < n){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int j = 0; j < n; j++){
            if(nums[j] != j+1){
                ans = nums[j];
            }
        }
        return ans;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}