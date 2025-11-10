import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {89,2,8,32556,5584,56,2352,22,5,5662,5,86,68,865,3,7};
        System.out.println(Arrays.toString(sort(arr)));
        // if we want to modify te original array , arr = sort(arr);
    }
    public static int[] sort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    public static int[] merge(int[] left, int right[]){
        int i = 0;
        int j = 0;
        int index = 0;
        int size = left.length + right.length;

        int[] result = new int[size];
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                result[index++] = left[i++];
            }else{
                result[index++] = right[j++];
            }
        }
        while(i < left.length) {
            result[index++] = left[i++];
        }
        while(j < right.length) {
            result[index++] = right[j++];
        }

        return result;
    }
}
