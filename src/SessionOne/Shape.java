package SessionOne;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
        System.out.println("Shape constructor");
    }

    public abstract double area();

    public void draw() {
        System.out.println("Drawing shape with color: " + color);
    }
}
