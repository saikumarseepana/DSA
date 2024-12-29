public class PowerofTwo231 {
        public boolean isPowerOfTwo(int n) {
           return power(n);
        }
    
        static boolean power(int n){
            if(n <= 0){
                return false;
            }
            if(n == 1){
                return true;
            }
            if(n%2 != 0){
                return false;
            }
            return power(n/2);
        }
    
        // static boolean power(int n, int m, int x){// correct but not optimal
        //     if(Math.pow(m, x) > n){
        //         return false;
        //     }
    
        //     if(Math.pow(m, x) == n){
        //         return true;
        //     }else{
        //         return power(n, m, x + 1);
        //     }
        // }
}
