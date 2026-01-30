package SessionOne;

public class ColoredRect extends Rect implements Colorable {
    private String hexColor;

    public ColoredRect(String color, double width, double height, String hexColor) {
        super(color, width, height);
        this.hexColor = hexColor;
        System.out.println("ColoredRect constructor");
    }

    @Override
    public void applyColor() {
        System.out.println("Applying color hex: " + hexColor);
    }

    @Override
    public void draw() {
        super.draw();
        applyColor();
    }
}
