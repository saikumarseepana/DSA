// https://leetcode.com/problems/set-mismatch/description/
import java.util.*;
class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        // HashSet<Integer> hs = new HashSet<>();
        // int dp = 0, miss = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(!hs.add(nums[i])){
        //         dp = nums[i];
        //     }
        //     System.out.println(hs);     // this approach is based on hashmap
        // }                               // T.C : O(n)
                                           // S.C : O(n)
        

        // for(int i = 1; i <= nums.length; i++){
        //     if(!hs.contains(i)){
        //         miss = i;
        //     }
        // }
        
        // return new int [] {dp, miss};
        int i = 0;
        int dp = 0;                     //T.c : O(n)
        int missedNum = 0;              //S.C : O(1)
        int n = nums.length;
        while(i < n){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for(int j = 0; j < n; j++){
            if(nums[j] != j + 1){
                dp = nums[j];
                missedNum = j+1;
                break;
            }
        }
        return new int[] {dp, missedNum};
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}