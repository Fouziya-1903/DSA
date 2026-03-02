package patterns;
public class Pattern {
    public void pattern1(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern2(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public void pattern3(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        
    }

    public void pattern4(int n){
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
        
    }

    public void pattern5(int n){
        for(int i = n; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    public void pattern6(int n){
        for(int i = n; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        
    }

    public void pattern7(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
             
            for(int k = 0; k< 2*i+1; k++){
                System.out.print("*");
            }

            for(int l = 0; l<n-i-1; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern8(int n){
        for(int i = 0; i<n; i++){
            for(int k= 0; k<i; k++){
                System.out.print(" ");
            }

            for(int j = 0; j<2*n-2*i-1; j++){
                System.out.print("*");
            }

            for(int l = 0; l<i; l++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
    public void pattern9(int n){
        pattern7(n);
        pattern8(n);
    }
    
    public void pattern10(int n){
        for(int i = 0; i<2*n; i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j = 0; j< stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                if((i + j)%2 == 0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    public void pattern12(int n){
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(j+1);
            }
            for(int k = 0; k<2*n-2*i; k++){
               System.out.print(" "); 
            }
            for(int l = i; l>0; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public void pattern13(int n){
        int count = 1;
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(count);
                count++;
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void pattern14(int n){
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<i; j++){
                System.out.print((char)('A'+ j));
            }
            System.out.println();
        }
        
    }

    public void pattern15(int n){
        for(int i = n; i>0; i--){
            for(int j = 0; j<i; j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }

    public void pattern16(int n){
        for(int i = 0; i<n; i++){
            char c = (char)('A'+ i);
            for(int j = 0; j<=i; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void pattern17(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j< n-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k<=i; k++){
                System.out.print((char)('A' + k));
            }
            for(int l = i-1; l>=0; l--){
                System.out.print((char)('A' + l));
            }
            System.out.println();
        }
    }

    public void pattern18(int n){
        for(int i = 0; i<n; i++){
            char c = (char)('A' + n-1-i);
            for(int j = 0; j<=i; j++){
                System.out.print((char)(c + j));
            }
            System.out.println();
        }
    }

    public void pattern19(int n){
        int stars = 0;
        int space = 0;
        for(int i = 0; i<2*n; i++){
            if(i<n){
                stars = n - i;
                space = 2*i;
            }else{
                stars = i-n + 1;
                space = 2*(2*n - i - 1);
            }

            for(int j = 0; j<stars; j++){
                System.out.print("*");
            }
            for(int k = 0; k<space; k++){
                System.out.print(" ");
            }
            for(int j = 0; j<stars; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public void pattern20(int n){
        int stars = 0;
        int spaces = 0;
        for(int i = 0; i<=2*n-1 ; i++){
            if(i < n){
                stars = i;
                spaces = 2*(n-stars);
            }else{
                stars = 2*n-i;
                spaces = 2*(n-stars);
            }
            for(int j = 0; j<stars; j++){
                System.out.print("*");
            }
            for(int k = 0; k<spaces; k++){
                System.out.print(" ");
            }
            for(int l = 0; l<stars; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern21(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i == 0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void pattern22(int n){
        int limit = 2*n - 1;
        for(int i = 0; i<limit; i++){
            for(int j = 0; j<limit; j++){
                // System.out.print(n-(Math.min(i,j)));
                int top = i;
                int left = j;
                int bottom = limit-1-i;
                int right = limit-1-j;

                int ans = n - Math.min(Math.min(top, bottom) , Math.min(left, right));
                System.out.print(ans);
            }
            System.out.println();
        }
    }
}
