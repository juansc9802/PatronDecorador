import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido");

        ConcreteComponent compOG = new ConcreteComponent();
        ConcreteDecorator_1 compEmail = new ConcreteDecorator_1();

        //compOG.notif();
        System.out.println("Mensaje nuevo");
        System.out.println("------------------------------------------------------------");

        compEmail.setComponent(compOG);
        compEmail.notif();

        System.out.println("------------------------------------------------------------");

    }
}