
public class FindTarget{
    public static void main(String[] args){
    int[] arr = {1,5,12};

    int result = helper(arr, 12, 0);
    System.out.print(result);
    }

    public static int helper(int[] arr, int target, int index){
        if(index == arr.length) return -1; // Base case: finished searching
        
        if(arr[index] == target) return index; // Found target
        
        return helper(arr, target, index+1); // Recursive step
    }
}

