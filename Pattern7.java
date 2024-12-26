public class Pattern7 {
    public static void main(String[] args){
        pattern7(5);
    }

    static void pattern7(int n){
        for(int row = 0; row < n; row++){
            for(int col = 0; col < row; col++){
                System.out.print(" ");
            }
            for(int col = n; col > row; col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//Pattern 7
// *****
//  ****
//   ***
//    **
//     *
