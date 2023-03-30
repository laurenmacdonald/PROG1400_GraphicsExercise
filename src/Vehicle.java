import java.awt.*;

public abstract class Vehicle {
    private String make;
    private String model;
    private Color bodyColor;
    private int bodyHeight;
    private int bodyWidth;


//    public Vehicle(String make, String model, Color bodyColor, int height, int width) {
//        this.make = make;
//        this.model = model;
//        this.bodyColor = bodyColor;
//        this.height = height;
//        this.width = width;
//    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public int getBodyWidth() {
        return bodyWidth;
    }

    public void setBodyWidth(int bodyWidth) {
        this.bodyWidth = bodyWidth;
    }

    public abstract String sound();

    public abstract String toString();
}
