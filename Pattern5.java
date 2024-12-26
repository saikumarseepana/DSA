public class Pattern5 {
    public static void main(String[] args){
        pattern5(5);
    }

    static void pattern5(int n){
        for(int row = 0; row < (2*n - 1); row++){
            if(row < n){// to print * upto n
                for(int col = 0; col <= row; col++){
                        System.out.print("*");
                }
            }else{// to print remaining part of the pattern
                for(int col = 0; col < (2*n - 1 - row); col++){
                    System.out.print("*");
                }
            }
            
            System.out.println();
        }
    }
}
//Pattern 5
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
