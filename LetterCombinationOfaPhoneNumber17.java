import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfaPhoneNumber17 {
     public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        return keyPad("", digits);
    }

    static ArrayList<String> keyPad(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        String[] keypad = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        int digit = up.charAt(0) - '0';
        String letters = keypad[digit];

        ArrayList<String> result = new ArrayList<>(); 

        for(int i = 0; i < letters.length(); i++){
             result.addAll(keyPad(p + letters.charAt(i), up.substring(1)));
        }
        return result;
    }
}
