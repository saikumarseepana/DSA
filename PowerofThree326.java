public class PowerofThree326 {
        public boolean isPowerOfThree(int n) {
            return power3(n);
            // boolean ans = false;
            // while(n % 3 == 0 && n > 0){    // alternative and better approach
            //     n /= 3;
            // }
            // if(n==1){
            //     ans = true;
            // }
            // return ans;
        }
    
        static boolean power3(int n){
            if(n <= 0){
                return false;
            }
            if(n == 1){
                return true;
            }
            if(n % 3 != 0){
                return false;
            }
            return power3(n/3);
        }



}
