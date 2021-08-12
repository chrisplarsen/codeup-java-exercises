package shapes;

public class Rectangle extends Quadrilateral implements{

    public Rectaangle(double length, double width){
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }
}
