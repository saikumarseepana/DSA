class RomanToInteger13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> list = new HashMap<>();
        list.put('I', 1);
        list.put('V', 5);
        list.put('X', 10);
        list.put('L', 50);
        list.put('C', 100);
        list.put('D', 500);
        list.put('M', 1000);
        int ans = 0;
        int i = s.length() - 1;
        while(i >= 0){
            if (i > 0 && list.get(s.charAt(i)) > list.get(s.charAt(i - 1))) {
                // Subtractive case
                ans += list.get(s.charAt(i)) - list.get(s.charAt(i - 1));
                i -= 2;
            } else {
                // Normal case
                ans += list.get(s.charAt(i));
                i--;
            }

            
        }

        return ans;
    }
}