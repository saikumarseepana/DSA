class Solution {
    public void reverseString(char[] s) {
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
}