package OOP;

public class wrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 43;

        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 43;

        swap(a,b);
        swap(arr,arr[0],arr[1]);
        System.out.println(a + " " + b);
        System.out.println(arr);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The values of a and b in function are: "+a+" "+b);
    }

    public static void swap(int[] arr, int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    
}
