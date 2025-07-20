class animal{
    public void py(){ //method
        System.out.println("I am super class");
    }
    animal(){ //constructor
        System.out.print("Animal class");
    }
    animal(int x){ //constructor overloaded
        System.out.println("I have "+ x + " species");
    }
}
class fish extends animal{ // inheritance of class animal
    public void py(){
        System.out.println("I am sub class"); //this is method overriding
    }
    fish(){
        super(3000); // calling the overload constructor
        System.out.println("We are marine animals");
    }
    fish(int x,int y){ //constructor overloading of fish
        super(x);
        System.out.println("earth has " + y + " ocean ");
    }
}
class human extends fish{ // inheritance of upper 2 class
    human(){
        System.out.println(" hey there i am human ");
    }
    human(int x, int y, int z){
        super(x,y);
        System.out.println("biggest population "+ z);
    }
}
public class constructor_inheritance {
    public static void main(String[] args) {
//        fish shark = new fish();
//          fish shark = new fish(3000,6);
        human swarna = new human(300,20,80); //it will print all overload constructor one by one.
        fish fi = new fish();
        fi.py();
    }
}
