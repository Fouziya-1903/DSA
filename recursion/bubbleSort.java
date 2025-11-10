import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] arr = {65,6,5,7,60,4,85,30,54,8,98,45,0315,32,4,89};
        sort(arr,arr.length-1, 0);
        System.out.print(Arrays.toString(arr));
    }
    public static void sort(int[] arr, int i, int j){
        if(i == 0) return;

        if(j<i){
            if(arr[j]>arr[j+1]){
            swap(arr, j , j+1 ); 
            }
            sort(arr, i, j+1);
        }else{
            sort(arr, i-1, 0);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
