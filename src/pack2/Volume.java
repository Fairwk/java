package pack2;
interface SolidVolume {
    public void SolidVolume();//体积
}
abstract class Solid implements SolidVolume{
    double radius,high,volume;
    public Solid(double radius,double high){
        this.radius = radius;
        this.high = high;
    }
}
class Cone extends Solid{//圆锥体
    public Cone(double radius,double high){

        super(radius,high);
    }
    public void SolidVolume(){
        volume= (Math.PI*radius*radius*high)/3;
        System.out.println("圆锥体的体积是: " + volume);
    }
}
class Cylinder extends Solid{//圆柱体
    public Cylinder(double radius,double high){
        super(radius,high);
    }
    public void SolidVolume(){
        volume= Math.PI*radius*radius*high;
        System.out.println("圆柱体的体积是: " + volume);
    }
}
public class Volume {
    public static void main(String[] args) {
        Cone co = new Cone(2,5);
        co.SolidVolume();
        Cylinder cy = new Cylinder(2,5);
        cy.SolidVolume();
    }
}
