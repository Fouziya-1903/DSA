public class TrianglePattern {
    public static void main(String[] args){
        invertedTriangle(5,0);
        triangle(5, 0);
    }
    public static void invertedTriangle(int rows, int cols){
        if(rows == 0) return;
        
        if(cols<rows){
            System.out.print('*');
            invertedTriangle(rows,cols+1);
        }else{
            System.out.println();
            invertedTriangle(rows-1,0);
        }
    }
    public static void triangle(int rows, int cols){

        if(rows == 0) return;
        if(cols < rows){
            triangle(rows, cols+1);
            System.out.print('*');
        }else{
            triangle(rows-1, 0);
            System.out.println();
        }
    }
}
