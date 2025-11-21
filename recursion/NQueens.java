public class NQueens {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] boolMatrix = new boolean[n][n];
        System.out.println(NQueen(boolMatrix, 0));
    }

    public static int NQueen(boolean[][] boolMatrix, int r){
        if(r == boolMatrix.length){
            display(boolMatrix);
            System.out.println();
            return 1;
        }

        int count = 0;

        for(int col = 0; col < boolMatrix.length; col++){
            // placing the queen and checking for every row and col
            if(isSafe(boolMatrix,r,col)){
                boolMatrix[r][col] = true;
                count += NQueen(boolMatrix, r+1);
                boolMatrix[r][col] = false;
            }
        }
        return count;

    }
    private static boolean isSafe(boolean[][] boolMatrix, int r, int col) {
        // check vertical row
        for(int i = 0; i<r; i++){
            if(boolMatrix[i][col]){
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(r, col);
        for(int i = 1; i<=maxLeft; i++){
            if(boolMatrix[r-i][col-i]){
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(r,boolMatrix.length-col-1);
        for(int i = 1; i<=maxRight; i++){
            if(boolMatrix[r-i][col+i]){
                return false;
            }
        }

        return true;
    }

    public static void display(boolean[][] boolMatrix){
        for(int i = 0; i< boolMatrix.length; i++){
            for(int j = 0; j<boolMatrix[0].length; j++){    
                if(boolMatrix[i][j]){
                    System.out.print('Q');
                }else{
                    System.out.print('X');
                }
            }
            System.out.println();
        }
    }
}

