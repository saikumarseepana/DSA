class Solution {
    public void reverseString(char[] s) {
        // reverse(s, 0, s.length - 1); *** recursive approach has O(n) space complexity where as 
                                        //iterative two pointer approach has O(1)                        

        int start = 0;
        int end = s.length - 1;
        while(start <= end){
            swap(s, start, end);
            start++;
            end--;
        }
    }

    static void swap(char[] s, int first, int second){
        char temp = s[first];
        s[first] = s[second];
        s[second] = temp;
    }

    // static void reverse(char[] s, int start, int end){ // recursion approach
    //     if(start >= end){
    //         return;
    //     }

    //     char temp = s[start];
    //     s[start] = s[end];
    //     s[end] = temp;

    //     reverse(s, start + 1, end - 1);
    // }

    
}