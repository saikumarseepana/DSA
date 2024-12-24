https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
import java.util.*;
class DisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int j = 0; j < n; j++){
            if(nums[j] != j+1){
                list.add(j+1);
            }
        }
        return list;
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}