package assignment7;

public class Rectangle extends Shape {
    private double width;
    private double length;


    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public void WidthSetter(double width){
        this.width = width;
    }
    public void LengthSetter(double length){
        this.length = length;
    }


    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + length);
    }

    @Override
    public String getSize() {
        return this.width + "*" + this.length;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

}
