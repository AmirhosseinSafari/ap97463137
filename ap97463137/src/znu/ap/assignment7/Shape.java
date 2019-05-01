package assignment7;

public abstract class Shape implements Comparable<Shape>{

    @Override
    public String toString(){
        return this.getType() + "\t" + this.getSize() + "\t" + getArea() + "\t" + getPerimeter() + "\n";
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String getSize();
    public abstract String getType();

    @Override
    public int compareTo(Shape shape) {
        if(shape.getPerimeter() > this.getPerimeter())
            return -1;
        if(shape.getPerimeter()<this.getPerimeter())
            return 1;
        return 0;
    }
}

