package patterns;

public class Pattern {
    public void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern3(int n){
        for(int i = 0; i < n; i++){
            // Fixed: j <= i ensures the first row prints something
            for(int j = 0; j <= i; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public void pattern4(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    public void pattern5(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern6(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public void pattern7(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern8(int n){
        for(int i = 0; i < n; i++){
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * n - 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void pattern9(int n){
        pattern7(n);
        pattern8(n);
    }
    
    public void pattern10(int n){
        // Fixed: Bounded at 2*n - 1 to establish a true center point axis
        for(int i = 1; i < 2 * n; i++){
            int stars = (i <= n) ? i : 2 * n - i;
            for(int j = 0; j < stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int n){
        for(int i = 0; i < n; i++){
            // Fixed: Adjusted tracking state flag initialization
            int start = (i % 2 == 0) ? 1 : 0;
            for(int j = 0; j <= i; j++){
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public void pattern12(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = 0; k < 2 * n - 2 * i; k++){
               System.out.print(" "); 
            }
            for(int l = i; l >= 1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public void pattern13(int n){
        int count = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public void pattern14(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }

    public void pattern15(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }

    public void pattern16(int n){
        for(int i = 0; i < n; i++){
            char c = (char)('A' + i);
            for(int j = 0; j <= i; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void pattern17(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for(int k = 0; k < 2 * i + 1; k++){
                System.out.print(ch);
                if(k < breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }

    public void pattern18(int n){
        for(int i = 0; i < n; i++){
            for(char ch = (char)('A' + n - 1 - i); ch <= (char)('A' + n - 1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public void pattern19(int n){
        // Top half
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++) System.out.print("*");
            for(int j = 0; j < 2 * i; j++) System.out.print(" ");
            for(int j = 0; j < n - i; j++) System.out.print("*");
            System.out.println();
        }
        // Bottom half
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++) System.out.print("*");
            for(int j = 0; j < 2 * n - 2 * i - 2; j++) System.out.print(" ");
            for(int j = 0; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    public void pattern20(int n){
        // Fixed: Unified mapping formula for standard dynamic symmetric wings
        for(int i = 1; i < 2 * n; i++){
            int stars = (i <= n) ? i : 2 * n - i;
            int spaces = 2 * n - 2 * stars;
            
            for(int j = 0; j < stars; j++) System.out.print("*");
            for(int j = 0; j < spaces; j++) System.out.print(" ");
            for(int j = 0; j < stars; j++) System.out.print("*");
            System.out.println();
        }
    }

    public void pattern21(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1){
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern22(int n){
        int limit = 2 * n - 1;
        for(int i = 0; i < limit; i++){
            for(int j = 0; j < limit; j++){
                int top = i;
                int left = j;
                int bottom = limit - 1 - i;
                int right = limit - 1 - j;

                int ans = n - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}