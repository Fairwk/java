package pack1;
public class Rectangle implements perimeter,area {
    double len,width,perimeter,area;

    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return (len + width)*2;
    }

    public void setPerimeter(double perimeter) {

        this.perimeter = perimeter;
    }

    public double getArea() {

        return len * width;
    }

    public void setArea(double area) {

        this.area = area;
    }

    public Rectangle(double len, double width){
        this.len = len;
        this.width = width;
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
