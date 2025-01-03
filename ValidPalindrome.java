// https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
        public boolean isPalindrome(String s) {
            // String str = "";
            // for(int i = 0; i < s.length(); i++){
            //     if(Character.isLetterOrDigit(s.charAt(i))){
            //         str += Character.toLowerCase(s.charAt(i));
            //     }
            // }
            // int start = 0;
            // int end = str.length() - 1; 
    
            // while(start <= end){
            //     if(str.charAt(start) != str.charAt(end)){
            //         return false;
            //     }else{
            //         start++;
            //         end--;
            //     }
            // }  
    
            // return true;
            StringBuilder str = new StringBuilder();
            for(char ch : s.toCharArray()){
                if(Character.isLetterOrDigit(ch)){
                    str.append(Character.toLowerCase(ch));
                }
            }
    
            String filtered = str.toString();
            String reverse = str.reverse().toString();
            return reverse.equals(filtered);
    
        }
}
