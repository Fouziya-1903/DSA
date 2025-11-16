import java.util.ArrayList;

public class subsequenceClass {
    public static void main(String[] args) {
        subsequence("", "abc");
    }
    public static void subsequence(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        
        char ch = up.charAt(0);
        subsequence(p + ch, up.substring(1));
        subsequence(p, up.substring(1));

    }
    private static ArrayList<String> subsequenceRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }  
        
        char ch = up.charAt(0);

        ArrayList<String> left = subsequenceRet(p + ch, up.substring(1));
        ArrayList<String> right = subsequenceRet(p, up.substring(1));

        left.addAll(right);
        return left; // returning left or right would result in the same answer
    }
}
    