import java.util.ArrayList;
import java.util.List;

// The range is between 2-9 only 
//abc def ghi jkl mno pqrs tuv wxyz
public class letterCombination {
    public static void main(String[] args) {
        List<String> result = dial("", "92");
        System.out.println(result);
    }
    public static List<String> dial(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        List<String> list = new ArrayList();

        if(digit == 7){
            for(int i = (digit-2)*3; i<= (digit-1)*3; i++){
                char ch = (char)('a' + i);
                list.addAll(dial(p+ch, up.substring(1)));
            }
        }
        if(digit == 8){
            for(int i = ((digit - 2)*3) + 1;i< (((digit - 1)*3) + 1); i++){
                char ch = (char)('a' + i);
                list.addAll(dial(p+ch, up.substring(1)));
            }
        }
        if(digit == 9){
            for(int i = ((digit - 2)*3) + 1;i<= (((digit - 1)*3) + 1); i++){
                char ch = (char)('a' + i);
                list.addAll(dial(p+ch, up.substring(1)));
            }
        }

        if(digit !=  7 && digit != 8 && digit != 9){
            for(int i = (digit - 2)*3; i<(digit-1)*3; i++){
                char ch = (char)('a' + i);
                list.addAll(dial(p+ch, up.substring(1)));
            }
        }
        return list;
    }
}
