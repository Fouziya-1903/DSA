import java.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class subsequencewithTargetSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of your array: ");
        int n = sc.nextInt();
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        helper(0,temp,result,0,arr, target);
        System.out.println(result);

    }
    public static void helper(int index, List<Integer> temp, List<List<Integer>> result, int sum, int[] arr, int target){
        if(index == arr.length){
            if(sum == target){
                result.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(arr[index]);
        helper(index+1,temp, result, sum + arr[index], arr, target);
        temp.remove(temp.size()-1);
        helper(index+1, temp, result, sum- (temp.size()-1), arr, target);
    }   
}
