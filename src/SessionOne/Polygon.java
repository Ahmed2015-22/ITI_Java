package SessionOne;

public abstract class Polygon extends Shape {
    protected int sides;

    public Polygon(String color, int sides) {
        super(color);
        this.sides = sides;
        System.out.println("Polygon Constructor with sides parameter called");
    }

    //public abstract double perimeter();

    @Override
    public void draw() {
        System.out.println("Drawing polygon with " + sides + " sides and color: " + color);
    }
}
