import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {12,45,56,87,89,2,51,8,21,44,44521,245,54,4,52};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int low, int high) {
        if(low >= high) return;

        int mid = low+(high-low)/2;
        int pivot = arr[mid];

        int start = low;
        int end = high;

        while(start< end){

            while(arr[start]<pivot){
                start++;
            }
            while (arr[end]>pivot) {
                end--;
            }

            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }

            sort(arr, low, end);
            sort(arr, start, high);
        }
    }
}
