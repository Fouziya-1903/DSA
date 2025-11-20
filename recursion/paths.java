import java.lang.reflect.Array;
import java.util.ArrayList;

public class paths {
    public static void main(String[] args) {
        int path = countPath(3, 3);
        System.out.println(path);
        pathString("",3,3);
        ArrayList<String> result = pathRet("", 3, 3);
        System.out.println(result);
        ArrayList<String> diagPath = pathRetDiag("", 3, 3);
        System.out.println(diagPath);
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
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathString(p +"D",r-1, c);
        }
        if(c>1){
            pathString(p + "R", r, c-1);
        }
        
    }
    public static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(pathRet(p +"D",r-1, c));
        }
        if(c>1){
            list.addAll(pathRet(p + "R", r, c-1));
        }

        return list;
    }
    public static ArrayList<String> pathRetDiag(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(pathRetDiag(p +"V",r-1, c));
        }
        if(r>1 && c > 1){
            list.addAll(pathRetDiag(p + "d",r-1,c-1));
        }
        if(c>1){
            list.addAll(pathRetDiag(p + "H", r, c-1));
        }

        return list;
    }
}
