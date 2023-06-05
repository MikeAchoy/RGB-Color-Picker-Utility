import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){
        // Window dimensions and title options to set.
        int WINDOW_WIDTH = 550;
        int WINDOW_HEIGHT = 600;
        String WINDOW_TITLE = "RGB Color Picker";

        // Set window options.
        this.setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        this.setTitle(WINDOW_TITLE);
        this.setBackground(new Color(35, 35, 35));
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create instance of window objects.
        ValueDisplayPanel valueDisplayPanel = new ValueDisplayPanel();
        ColorDisplayPanel colorDisplay = new ColorDisplayPanel(valueDisplayPanel);
        ColorControlPanel colorControlPanel = new ColorControlPanel(colorDisplay);

        // Add Color display and control panel objects to the window.
        this.getContentPane().add(valueDisplayPanel, BorderLayout.NORTH);
        this.getContentPane().add(colorDisplay, BorderLayout.CENTER);
        this.getContentPane().add(colorControlPanel, BorderLayout.SOUTH);
    }

    public void setVisible(){
        this.setVisible(true);
    }
}
