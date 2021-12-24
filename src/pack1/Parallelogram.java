package pack1;

public class Parallelogram implements perimeter,area{
    double bottom1,bottom2,high,perimeter,area;

    public double getBottom1() {
        return bottom1;
    }

    public void setBottom1(double bottom1) {
        this.bottom1 = bottom1;
    }

    public double getBottom2() {
        return bottom2;
    }

    public void setBottom2(double bottom2) {
        this.bottom2 = bottom2;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getPerimeter() {
        return (bottom1 + bottom2)*2;
    }

    public void setPerimeter(double perimeter) {

        this.perimeter = perimeter;
    }

    public double getArea() {

        return bottom1*high;
    }

    public void setArea(double area) {

        this.area = area;
    }

    public Parallelogram(double bottom1, double bottom2, double high){
        this.bottom1 = bottom1;
        this.bottom2 = bottom2;
        this.high = high;
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
