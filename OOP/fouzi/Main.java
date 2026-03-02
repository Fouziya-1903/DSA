package fouzi;

public class Main {
    public static void main(String[] args) {
        //Box -->  l,h,w
        //BoxWeight ---> l,h,w,weight
        Box box1 = new Box(); 
        BoxWeight box2 = new BoxWeight();
        Box box3 = new BoxWeight();
        
        // System.out.println(box1.h+" "+ box1.w); 
        // System.out.println(box2.h+" "+ box2.weight); 

        // System.out.println(box3.weight); //this is not possible
        box1.display();
        box2.display();
        box3.display();

    }
}
