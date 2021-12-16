package pack1;
interface perimeter{
    public void perimeter();

}
interface area{
    public void area();
}
abstract class Shape implements perimeter,area{
    int len,width,bottom1,bottom2,high,perimeter,area;
    public Shape(int len,int width,int bottom1,int bottom2,int high){
        this.len = len;
        this.width = width;
        this.bottom1 = bottom1;
        this.bottom2 = bottom2;
        this.high = high;
    }
}
class Rectangle extends Shape{
    public Rectangle(int len,int width,int bottom1,int bottom2,int high){
        super(len,width,bottom1,bottom2,high);
    }
    public void perimeter(){
        perimeter = (len + width)*2;
        System.out.println("矩形的周长: " + perimeter);
    }
    public void area(){
        area = len * width;
        System.out.println("矩形的面积: " + area);
    }
}
class Parallelogram extends Shape{
    public Parallelogram(int len,int width,int bottom1,int bottom2,int high){
        super(len,width,bottom1,bottom2,high);
    }
    public void perimeter(){
        perimeter = (bottom1 + bottom2)*2;
        System.out.println("平行四边形的周长: " + perimeter);
    }
    public void area(){
        area = bottom1*high;
        System.out.println("平行四边形的面积: " + area);
    }
}
public class GraphCalculate {
    public static void main(String[] args) {
        Rectangle re = new Rectangle(10,12,0,0,0);
        re.perimeter();
        re.area();
        Parallelogram pa = new Parallelogram(0,0,10,12,8);
        pa.perimeter();
        pa.area();
    }
}
