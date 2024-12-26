public class Pattern8 {
    public static void main(String[] args){
        pattern8(5);
    }

    static void pattern8(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n - 1 - row; col++){
                System.out.print(" ");
            }
            for(int col = 0; col < (2*row+1); col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Pattern 8
//     *
//    ***
//   *****
//  *******
// *********
