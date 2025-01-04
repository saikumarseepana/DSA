public class LinearSearchRec {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7, 9, 18};
        int target = 1;
        System.out.println(search1(arr, target, 0));
    }

    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || search(arr, target, index + 1);
    }

    static int search1(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return search1(arr, target, index + 1);
    }
}
