public class skipChar {
    public static void main(String[] args) {
        // String a = "";
        // String b = "abajkjdjaaakjfkjfdnlaj";
        skip("","abajkjdjaaakjfkjfdnlaj");
        String result = stringRet("abajkjdjaaakjfkjfdnlaj");
        System.out.println(result);

    }
    public static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p + ch, up.substring(1));
        }
    }

    // same answer but using a return type of string just to return the answer
    public static 
    String stringRet(String s){
        if(s.isEmpty()) return "";

        char ch = s.charAt(0);

        if(ch == 'a'){
            return (stringRet(s.substring(1)));
        }else{
            return (ch + stringRet(s.substring(1)));
        }
    }
}
