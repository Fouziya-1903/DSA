import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your big number: ");
        int n = sc.nextInt();
        System.out.println("Enter the number whose no. of occurrences should be checked: ");
        int o = sc.nextInt();
        int count = 0;

        while(n!= 0){
            if(n%10 == o) count++;
            n = n/10;
        }
        System.out.println(count);
    }
}
