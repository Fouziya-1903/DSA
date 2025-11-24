public class human {

    String message = "Hello World";

    public static void display(human woman){
        System.out.println(woman.message);
    }

    public static void main(String[] args) {
        human Fouzi = new human();
        Fouzi.message = "Fouzi's message";
        human.display(Fouzi);
    }

}