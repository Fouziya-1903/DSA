import java.lang.reflect.Array;
import java.util.ArrayList;

public class paths {
    public static void main(String[] args) {
        int path = countPath(3, 3);
        System.out.println(path);
        pathString("",3,3);
        ArrayList<String> result = pathRet("", 3, 3);
        System.out.println(result);
    }
    public static int countPath(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = countPath(r-1, c);
        int right = countPath(r, c-1);

        return left + right;
    }
    public static void pathString(String p, int r, int c){
        if(r == 1 || c == 1){
            System.out.println(p);
            return;
        }

        pathString(p +"D",r-1, c);
        pathString(p + "R", r, c-1);
    }
    public static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 || c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        list.addAll(pathRet(p +"D",r-1, c));
        list.addAll(pathRet(p + "R", r, c-1));

        return list;
    }
}
