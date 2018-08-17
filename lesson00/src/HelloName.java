import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String name = lector.nextLine();
        System.out.println("Hola " + name);
    }
}
