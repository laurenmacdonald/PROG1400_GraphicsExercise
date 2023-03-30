import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        this.setBounds(50, 50, 800, 600);
        this.setTitle("Cool Car");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Instantiating DrawingBoard JPanel
        DrawingBoard drawing = new DrawingBoard();
        drawing.setBackground(Color.lightGray);
        this.add(drawing);
    }
}
