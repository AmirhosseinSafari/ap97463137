package assignment7;

public class Square extends Shape{
    private double side;


    public Square(double side){
        this.side = side;
    }

    @Override
    public double getArea() {
        return side*side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public String getSize() {
        return side + "";
    }

    @Override
    public String getType() {
        return "Square";
    }

}
