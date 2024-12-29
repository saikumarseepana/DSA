public class PowerofFour342 {
    public boolean isPowerOfFour(int n) {
        boolean ans = false;
        while(n % 4 == 0 && n > 0){ // basic approach and optimal 
                                    // can do with recursion
            n /= 4;
        }
        if(n == 1){
            ans = true;
        }
        return ans;
    }
}
