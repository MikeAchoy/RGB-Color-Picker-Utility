import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

public class ValueDisplayPanel extends JPanel {

    private final JLabel rgbLabel;
    private final JLabel hexLabel;

    public ValueDisplayPanel(){
        // Set panel settings.
        this.setPreferredSize(new Dimension(400, 50));
        this.setBackground(Color.WHITE);
        this.setLayout(new GridLayout(1, 6));

        // Create instance of value display labels.
        this.rgbLabel = new JLabel();
        this.hexLabel = new JLabel();
        this.rgbLabel.setPreferredSize(new Dimension(150, 50));
        this.hexLabel.setPreferredSize(new Dimension(150, 50));

        JButton copyRGB = new JButton("Copy");
        JButton copyHex = new JButton("Copy");

        // Set button listeners.
        copyRGB.addActionListener(e -> {
            String myString = this.rgbLabel.getText();
            StringSelection stringSelection = new StringSelection(myString);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        });

        copyHex.addActionListener(e -> {
            String myString = this.hexLabel.getText();
            StringSelection stringSelection = new StringSelection(myString);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        });

        // Add labels and buttons to the value display panel.
        this.add(new JLabel("RGB:"));
        this.add(this.rgbLabel);
        this.add(copyRGB);

        this.add(new JLabel("Hex:"));
        this.add(this.hexLabel);
        this.add(copyHex);
    }

    public void update(int r, int g, int b){
        // Create formatted labels.
        String rgbValue = r + ", " + g + ", " + b;
        String hexValue = String.format("#%02x%02x%02x", r, g, b);

        // Set labels.
        this.rgbLabel.setText(rgbValue);
        this.hexLabel.setText(hexValue);
    }
}
