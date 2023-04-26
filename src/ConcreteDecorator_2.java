public class ConcreteDecorator_2 extends AbstractDecorator{
    public void notif(){
        super.notif();

        System.out.println("Mensaje de Texto: 'Tienes 1 día para devolver el libro'");
    }
}
