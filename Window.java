import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    private ColorDisplayPanel colorDisplay;
    private ColorControlPanel colorControlPanel;

    public Window(){
        // Window dimensions and title.
        int WINDOW_WIDTH = 400;
        int WINDOW_HEIGHT = 600;
        String WINDOW_TITLE = "RGB Color Picker";

        //
        this.setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        this.setTitle(WINDOW_TITLE);
        this.setBackground(new Color(35, 35, 35));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //
        this.colorDisplay = new ColorDisplayPanel();
        this.colorControlPanel = new ColorControlPanel(this.colorDisplay);

        this.getContentPane().add(colorDisplay, BorderLayout.NORTH);
        this.getContentPane().add(colorControlPanel, BorderLayout.SOUTH);
    }

    public void setVisible(){
        this.setVisible(true);
    }
}
