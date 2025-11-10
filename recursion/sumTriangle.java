import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class sumTriangle {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,5,82,57,68));
        triangle(list);
    }
    public static void triangle(ArrayList<Integer> list){
        if(list.size() == 1){
            System.out.println(list);
            return;
        }

        ArrayList<Integer> next = sum(list,0);
        triangle(next);
        System.out.println(list);
        


    }
    public static ArrayList<Integer> sum(ArrayList<Integer> list, int index){
        if(index == list.size()-1){
            return new ArrayList<>();
        } 
    
        ArrayList<Integer> newList = sum(list, index+1);
        newList.add(0 , list.get(index)+list.get(index+1));
        return newList; 
    }
}
