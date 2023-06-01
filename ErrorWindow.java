import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorWindow extends JFrame {


    // TODO: Creat e nice layout for the error window.
    // Set the text and make the button smaller and centered.

    public ErrorWindow(){
        // Set window init settings.
        final int ERROR_WINDOW_WIDTH = 250;
        final int ERROR_WINDOW_HEIGHT = 200;
        final String ERROR_WINDOW_TITLE = "Value Error";

        this.setSize(new Dimension(ERROR_WINDOW_WIDTH, ERROR_WINDOW_HEIGHT));
        this.setTitle(ERROR_WINDOW_TITLE);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create window components.
        JLabel errorMessage = new JLabel();
        String errorMessageText = "<h1>Error:</h1> <p1>Something test.</p1>";

        errorMessage.setText(errorMessageText);

        JButton okButton = new JButton("Ok");
        okButton.addActionListener(e -> {
            this.dispose();
        });

        // Add window components to the window.
        this.getContentPane().add(errorMessage);
        this.getContentPane().add(okButton);
    }

    public void setVisible(){
        this.setVisible(true);
    }
}
