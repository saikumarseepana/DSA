import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {3, 5, 4, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int n = arr.length-1;
        boolean swapped;
        for(int i = 0; i <= n;i++){
            swapped = false;
            for(int j = 1; j < n - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
