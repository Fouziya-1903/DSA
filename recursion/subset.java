import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(arr);
        for(int i = 0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for(int num : arr){
            int n = outerList.size();
            for(int i = 0; i<n; i++){
                List<Integer> innerList = new ArrayList<>(outerList.get(i)); 
                innerList.add(num); 
                outerList.add(innerList);
            }
        }
        return outerList;
    }

    public static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int j = 0; j<arr.length; j++){
            start = 0;
            if( j>0 && arr[j] == arr[j-1]){
                start = end +1;
            }
            end = outerList.size() -1;
            int n = outerList.size();
            for(int i = 0; i<n; i++){
                List<Integer> innerList = new ArrayList<>(outerList.get(i)); 
                innerList.add(arr[i]); 
                outerList.add(innerList);
            }
        }
        return outerList;
    }
}
