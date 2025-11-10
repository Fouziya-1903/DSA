import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of factorial: ");
        int n = sc.nextInt();
        int facto = 1;
        for(int i = 1; i<=n; i++){

            facto = facto * i;
        }
        System.out.println(facto);
    }
}
