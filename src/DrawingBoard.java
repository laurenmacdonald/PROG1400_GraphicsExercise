import javax.swing.*;
import java.awt.*;

public class DrawingBoard extends JPanel {
    private Car theCar;

    protected void paintComponent(Graphics g){

        theCar = new Car();

        drawCar(g, theCar);

        carSound(g, theCar.sound());

        carDescription(g, theCar.toString());





    }

    private void drawBody(Graphics g, Car myCar){
        myCar = theCar;
        //setting pen's color to the bodyColor of the car
        g.setColor(myCar.getBodyColor());
        g.fillRect(300,200,myCar.getBodyWidth(),myCar.getBodyHeight());

    }

    private void drawWindShield(Graphics g, Car myCar){
        myCar = theCar;
        //setting pen's color to black for the outline of the windshield
        g.setColor(Color.BLACK);
        g.drawRect(325,125, myCar.getGetWindshieldWidth(), myCar.getWindshieldHeight());
    }

    private void drawLeftTire(Graphics g, Car myCar){
        myCar = theCar;
        //setting pen's color to black for tires
        g.setColor(Color.BLACK);
        g.fillOval(325, 300, myCar.getTireWidth(), myCar.getTireHeight());
    }
    private void drawRightTire(Graphics g, Car myCar){
        myCar = theCar;
        //setting pen's color to black for tires
        g.setColor(Color.BLACK);
        g.fillOval(575, 300, myCar.getTireWidth(), myCar.getTireHeight());
    }

    private void drawCar(Graphics g, Car myCar){
        myCar = theCar;

        drawBody(g, myCar);
        drawWindShield(g, myCar);
        drawLeftTire(g, myCar);
        drawRightTire(g, myCar);

    }

    private void carSound(Graphics g, String msg){
        g.setFont(new Font("Times New Roman", Font.BOLD,24));
        g.setColor(Color.BLUE);
        g.drawString(msg, 200, 200);
    }
    private void carDescription(Graphics g, String msg){
        g.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        g.setColor(Color.red);
        g.drawString(msg, 100,100);
    }
}
