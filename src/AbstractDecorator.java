public class AbstractDecorator extends ConcreteComponent{
    protected  Component OG;

    public void notif() {
        if (OG != null) {
            OG.notif();
        }
    }
    public void setComponent(Component cpm){
            OG = cpm;
    }
}
