public class skipWord {
    public static void main(String[] args) {
        String result = skip("skmkdknjnapplem");
        System.out.println(result);
    }
    public static String skip(String up){
        if (up.isEmpty()) {
            return "";
        }


        if(up.startsWith("apple")){
            return skip(up.substring(5));
        }else{
            return up.charAt(0) + skip(up.substring(1));
        }

    }
}
