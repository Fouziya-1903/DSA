import java.util.*;
class printOneSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        List<Integer> path = new ArrayList<>();
        int targetSum = 2;
        boolean isSubsequence = subsequence(0, new ArrayList<>(), nums, 0, targetSum);
    
    }
    public static boolean subsequence(int index, List<Integer> path, int[] nums, int sum, int targetSum){
        if(index == nums.length){
            if(sum == targetSum){
                System.out.println(path);
                return true;
            }
            return false;
        }
        path.add(nums[index]);
        sum += nums[index];
        if(subsequence(index+1, path, nums, sum, targetSum)) return true;
        
        path.remove(path.size()-1);
        sum -= nums[index];
        if(subsequence(index+1, path, nums, sum, targetSum)) return true;
        
        return false;
    }
}