import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido");

        Calendar fechaAct = new GregorianCalendar(2022, Calendar.APRIL, 24);
        Calendar fechaEnt = new GregorianCalendar(2022, Calendar.APRIL, 28);
        ConcreteComponent compOG = new ConcreteComponent();
        ConcreteDecorator_1 compEmail = new ConcreteDecorator_1();
        ConcreteDecorator_2 compMsg = new ConcreteDecorator_2();


        String Menu = """ 
                        Elige una opción:
                        1. Email
                        2. Mensaje de texto""";
        System.out.println(Menu);

        int resp = lector.nextInt();
        if (resp == 1){
            compEmail.setComponent(compOG);
            System.out.println("------------------------------------------------------------");
                if (fechaAct.get(Calendar.MONTH) == fechaEnt.get(Calendar.MONTH) && fechaAct.get(Calendar.DAY_OF_MONTH) == ((fechaEnt.get(Calendar.DAY_OF_MONTH))-1)){
                compEmail.notif();
            }
        }
        else if(resp==2) {compMsg.setComponent(compOG);
            System.out.println("------------------------------------------------------------");
            if (fechaAct.get(Calendar.MONTH) == fechaEnt.get(Calendar.MONTH) && fechaAct.get(Calendar.DAY_OF_MONTH) == ((fechaEnt.get(Calendar.DAY_OF_MONTH))-1)){
                compMsg.notif();
            }
        }

    }
}