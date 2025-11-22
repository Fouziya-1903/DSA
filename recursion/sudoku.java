public class sudoku {
    public static void main(String[] args) {
        
    }
    public static boolean solve(int[][] matrix){
        //check if the sudoku is already solved
        boolean emptyleft = true;
        int n = matrix.length;
        int r = -1;
        int c = -1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<c; j++){
                if(matrix[i][j] == 0){
                    r = i;
                    c = j;
                    emptyleft = false;
                    break;
                }
            }
            if(!emptyleft) break;
        }

        //if there are no empty cells, then sudoku is solved
        if(emptyleft) return true;


        //backtracking
        for (int number = 1; number <= 9; number++) {
            if (isSafe(matrix, r, c, number)) {
                matrix[r][c] = number;
                if (solve(matrix)) {
                    // found the answer
                    return true;
                } else {
                    // backtrack
                    matrix[r][c] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] matrix, int r, int c, int number) {
        for(int i = 0; i<r; i++){
            if(matrix[i][j] == number) return false;
        }

        for(int[] nums: matrix){
            if(nums[c] == number) return false;
        }

        int sqrt = (int)(Math.sqrt, number))
    }
    private static void display(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
