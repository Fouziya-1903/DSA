import java.util.ArrayList;

public class permutation {
    public static void main(String[] args) {
        permut("", "abc");
        ArrayList<String> ans = permutRet("", "abc");
        System.out.println(ans);
        System.out.println(permutCount("", "abc"));
    }
    public static void permut(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0); 
        int n = p.length();
        for(int i = 0; i<=n; i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            permut(f + ch + s, up.substring(1));
        }
    }
    public static ArrayList<String> permutRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list; 
        }
        
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            ans.addAll(permutRet(f + ch + s, up.substring(1)));
            // addall iis used because, it will add all the answers that are returning from the recursion.  
        }
        return ans;
    }
    public static int permutCount(String p, String up){
        if(up.isEmpty()){
            return 1; 
        }
        
        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        int count = 0;

        for(int i = 0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            count = count + permutCount(f + ch + s, up.substring(1));
            // addall iis used because, it will add all the answers that are returning from the recursion.  
        }
        return count;
    }
}
