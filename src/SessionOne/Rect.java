package SessionOne;

public class Rect extends  Polygon {
    protected double length;
    protected double width;

    public Rect(String color, double length, double width) {
        super(color, 4); // A rectangle has 4 sides
        this.length = length;
        this.width = width;
        System.out.println("Rectangle Constructor called");
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with length: " + length + ", width: " + width + ", and color: " + color);
    }
}
