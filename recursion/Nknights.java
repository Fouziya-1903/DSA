public class Nknights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] matrix = new boolean[n][n];
        knight(matrix, 0,0, 4);
    }
    public static void knight(boolean[][] matrix, int r, int c, int knights){
        if(knights == 0){
            display(matrix);
            System.out.println();  
            return;

        }

        // int count = 0;

        if(r == matrix.length-1 && c == matrix.length){
            return;
        }

        if (c == matrix.length) {
            knight(matrix, r + 1, 0, knights);
            return;
        }

        if(isSafe(matrix, r, c, knights)){
            matrix[r][c] = true;
            knight(matrix,r,c+1,knights-1);
            matrix[r][c] = false;
        }

        knight(matrix, r, c+1, knights);
    }
    private static void display(boolean[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]){
                    System.out.print("K");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
    private static boolean isSafe(boolean[][] matrix, int r, int c, int knights){
        if(isValid(matrix, r-1, c+2)){
            if(matrix[r-1][c+2]){
                return false;
            }
        }
        if(isValid(matrix, r-1, c-2)){
            if(matrix[r-1][c-2]){
                return false;
            }
        }
        if(isValid(matrix, r-2, c+1)){
            if(matrix[r-2][c+1]){
                return false;
            }
        }
        if(isValid(matrix, r-2, c-1)){
            if(matrix[r-2][c-1]){
                return false;
            }
        }
        return true;
    }
    private static boolean isValid(boolean[][] matrix, int r, int c) {
        if (r >= 0 && r < matrix.length && c >= 0 && c < matrix[0].length) {
            return true;
        }
        return false;
    }

}
 