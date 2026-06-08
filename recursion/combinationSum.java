import java.util.*;
class combinationSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<Integer> path = new ArrayList<>();
        int targetSum = 2;
        combinationSum(0, new ArrayList<>(), nums, targetSum);
    }
    public static void combinationSum(int index, List<Integer> path, int[] nums, int targetSum){
        if(index == nums.length){
            if(targetSum == 0){
                System.out.println(path);
            }
            return;
        }
        if(nums[index] <= targetSum){
            path.add(nums[index]);
            combinationSum(index, path, nums, targetSum-nums[index]);  
            path.remove(path.size()-1);
        }

        combinationSum(index+1, path, nums, targetSum);
        
    }
}