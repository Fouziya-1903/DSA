import java.util.ArrayList;

public class diceThrow {
    public static void main(String[] args) {
        dice("", 4);
        ArrayList<String> result = diceRet("", 4);
        System.out.println(result);
    }
    public static void dice(String p, int target){
        if(target <= 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i<=6 && i<=target; i++){
            dice(p+i, target-i);
        }
    }

    public static ArrayList<String> diceRet(String p, int target){
        if(target <= 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i<=6 && i<=target; i++){
            
            list.addAll(diceRet(p+i, target-i));
        }

        return list;
    }
}
