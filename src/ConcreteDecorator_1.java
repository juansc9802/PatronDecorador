public class ConcreteDecorator_1 extends AbstractDecorator{
    public void notif(){
        super.notif();

        System.out.println("Mensaje Correo electronico: 'Tienes 1 día para devolver el libro'");
    }
}
