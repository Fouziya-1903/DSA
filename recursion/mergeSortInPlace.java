    import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int arr[] = {56,546,84,12,1,915,4,6,5,24,1,5,5,7,5,312,98,71,2,2389,3,81232,56,56,4,5,42,};
        inPlacesort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void inPlacesort(int[] arr, int start, int end){
        if(end-start <= 1) return;

        int mid = start +(end-start)/2;

        inPlacesort(arr, start, mid);
        inPlacesort(arr, mid, end);

        mergeInPlace(arr,start,mid,end);
    }
    public static void mergeInPlace(int[] arr, int start, int mid, int end){

        int[] mergeArr = new int[end-start];
        
        int f = start;
        int j = mid;
        int index = 0;

        while (f<mid && j < end) {
            if(arr[f] <= arr[j]){
                mergeArr[index++] = arr[f++];
            }else{
                mergeArr[index++] = arr[j++];
            }
        }

        while (f<mid) {
            mergeArr[index++] = arr[f++];
        }

        while (j<end) {
            mergeArr[index++] = arr[j++];
        }

        for(int l = 0; l<mergeArr.length; l++){
            arr[start+l] = mergeArr[l];
        }
    }
    
}

// Merge sort in the original array