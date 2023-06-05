import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorWindow extends JFrame {

    public ErrorWindow(char invalidValue){
        // Set up window settings.
        final int WINDOW_WIDTH = 300;
        final int WINDOW_HEIGHT = 100;
        final String WINDOW_NAME = "Error";

        this.setSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        this.setTitle(WINDOW_NAME);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Create window objects.
        JPanel errorMessagePanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,3));

        JLabel errorMessage = new JLabel();

        if(invalidValue == '0'){
            errorMessage.setText("Value entered is not an integer!");
        }
        else{
            errorMessage.setText("Invalid Value: " + invalidValue + " bounds are [0, 250]");
        }

        JButton okButton = new JButton("Ok");

        okButton.addActionListener(e -> {
            this.dispose();
        });

        // Add empty labels and button to messagePanel to center button.
        errorMessagePanel.add(errorMessage);
        for(int i = 0; i < 3; i++){
            if(i == 1){
                buttonPanel.add(okButton);
            }
            else{
                buttonPanel.add(new JLabel());
            }
        }

        // Add window objects to the window.
        this.getContentPane().add(errorMessagePanel, BorderLayout.NORTH);
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    public void setVisible(){
        this.setVisible(true);
    }
}
