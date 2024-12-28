// https://leetcode.com/problems/binary-search/description/
class BinarySearch704 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        return Bsearch(nums, target, start, end);
    //    int left = 0;
    //    int right = nums.length - 1;
    //    while(left <= right){
    //     int mid = left + (right - left)/2;

    //     if(nums[mid] == target){
    //         return mid;n
    //     } else if(nums[mid] > target){
    //         right = mid - 1;
    //     } else {
    //         left = mid + 1;
    //     }
    //    }
    //    return -1; 
    }

    static int Bsearch(int[] nums, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return Bsearch(nums, target, s, mid - 1);
        }else {
            return Bsearch(nums, target, mid + 1, e);
        }
        
        
    }
}