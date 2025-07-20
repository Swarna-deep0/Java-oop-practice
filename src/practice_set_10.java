class circle{
    public int radius;
    circle(int r){
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends circle{
    public int height;
    Cylinder(int r,int h){
        super(r);
        this.height=h;
    }
    public double volume(){
        return area()*this.height;
    }
}
public class practice_set_10 {
    public static void main(String[] args) {
        // Q1.
        Cylinder cy = new Cylinder(3,8);
        System.out.println("volume of cylinder : " + cy.volume());
        System.out.println("area of cylinder : " + cy.area());
    }
}
