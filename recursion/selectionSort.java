import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args){
        int[] arr = {4,5,58,28,9};
        sort(arr, 0, arr.length-1);
        System.out.print(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int start, int end){
        if(end <= start) return;
        int maxIndex = findmaxIndex(arr, start, end, start);
        if(maxIndex != end){
            swap(arr, maxIndex, end);
        }else{
            sort(arr, start, end-1);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int findmaxIndex(int[] arr, int start, int end, int maxIndex){
        if(start > end) return maxIndex;
        if(arr[start] > arr[maxIndex]){
            maxIndex = start;
        }
        return findmaxIndex(arr, start+1, end, maxIndex);
    }
}
