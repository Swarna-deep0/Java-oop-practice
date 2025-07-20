class phone{
    public void who(){
        System.out.println("I am nokia 1100");
    }
    public void on(){
        System.out.println("I am a normal phone..");
    }
}
class smatphone extends phone{
    @Override
    public void on(){
        System.out.println("I am a smartphone.."); // This overriding of meth2
    }
    public void music(){
        System.out.println("Play music");
    }
}
public class overriding {
    public static void main(String[] args) {
        phone org = new phone();
        org.on();
        phone obj = new smatphone(); //Dynamic method Dispatched
        obj.on();
    }
}
