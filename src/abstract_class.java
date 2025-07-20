abstract class parent{ //abstract class set a standard for sub classes
    public parent(){
        System.out.println("I am a parent");
    }
    abstract void foo();
    abstract void hoo();
}
class child extends parent{
    @Override
    public void foo(){
        System.out.println("i am boy child");
    }
    public void hoo(){
        System.out.println("I am girl child");
    }
}
public class abstract_class {
    public static void main(String[] args) {
//        parent hu = new parent();  - Error
        child animesh = new child();
        animesh.foo();
    }
}
