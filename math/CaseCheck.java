import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //char ch = sc.next().trim().charAt(1);
        //String s = sc.next().trim();
        //System.out.println(s);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch<= 'z') {
            System.out.println("LowerCase");
        }else{
            System.out.println("Upper Case");
        }
    }
}
