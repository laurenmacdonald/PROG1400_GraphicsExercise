import java.awt.*;

public class Car extends Vehicle {

    private int tireHeight;
    private int tireWidth;
    private int windshieldHeight;
    private int getWindshieldWidth;


    public Car(){
        super.setMake("Honda");
        super.setModel("Civic");
        super.setBodyColor(Color.RED);
        super.setBodyHeight(150);
        super.setBodyWidth(400);
        this.setWindshieldHeight(75);
        this.setGetWindshieldWidth(350);
        this.setTireHeight(100);
        this.setTireWidth(100);
    }

    public int getTireHeight() {
        return tireHeight;
    }

    public void setTireHeight(int tireHeight) {
        this.tireHeight = tireHeight;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    public int getWindshieldHeight() {
        return windshieldHeight;
    }

    public void setWindshieldHeight(int windshieldHeight) {
        this.windshieldHeight = windshieldHeight;
    }

    public int getGetWindshieldWidth() {
        return getWindshieldWidth;
    }

    public void setGetWindshieldWidth(int getWindshieldWidth) {
        this.getWindshieldWidth = getWindshieldWidth;
    }

    @Override
    public String sound() {
        return "Pffffft";
    }


    @Override
    public String toString() {
        return "This is an annoying loud " + super.getMake() + " " + super.getModel() + ".";
    }
}
