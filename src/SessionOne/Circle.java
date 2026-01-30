package SessionOne;

public class Circle extends Shape{
    protected double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        System.out.println("Circle Constructor called");
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with radius: " + radius + " and color: " + color);
    }
}
