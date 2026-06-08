import java.util.*;
class printCountOfSubsequences {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        List<Integer> path = new ArrayList<>();
        int targetSum = 2;
        int countSubsequence = printCountOfSubsequences(0, nums, 0, targetSum);
        System.out.print(countSubsequence);
    }
    public static int printCountOfSubsequences(int index, int[] nums, int sum, int targetSum){
        if(index == nums.length){
            if(sum == targetSum){
                return 1;
            }else{
                return 0;
            }
        }
        
        sum += nums[index];
        int l = printCountOfSubsequences(index+1, nums, sum, targetSum);
    
        sum -= nums[index];
        int r = printCountOfSubsequences(index+1, nums, sum, targetSum);
        
        return l + r;
    }
}