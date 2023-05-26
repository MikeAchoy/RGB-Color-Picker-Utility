
import com.sun.jdi.Value;

import java.awt.*;
import javax.swing.*;

public class ColorControlPanel extends JPanel {
    private final JSlider rColorSlider;
    private final JSlider gColorSlider;
    private final JSlider bColorSlider;
    private final JTextField rColorValue;
    private final JTextField gColorValue;
    private final JTextField bColorValue;

    public ColorControlPanel(ColorDisplayPanel colorDisplayPanelRefToSet) {

        this.setPreferredSize(new Dimension(400, 200));
        this.setLayout(new GridLayout(3, 2));

        this.rColorValue = new JTextField("0");
        this.gColorValue = new JTextField("0");
        this.bColorValue = new JTextField("0");

        this.rColorSlider = new JSlider(0, 255, 0);
        this.gColorSlider = new JSlider(0, 255, 0);
        this.bColorSlider = new JSlider(0, 255, 0);

        this.add(this.rColorSlider);
        this.add(this.rColorValue);

        this.add(this.gColorSlider);
        this.add(this.gColorValue);

        this.add(this.bColorSlider);
        this.add(this.bColorValue);

        // Add change listeners to color value sliders.
        this.rColorSlider.addChangeListener(new SliderChangeListeners.RSliderChangeListener(colorDisplayPanelRefToSet, this));
        this.gColorSlider.addChangeListener(new SliderChangeListeners.GSliderChangeListener(colorDisplayPanelRefToSet, this));
        this.bColorSlider.addChangeListener(new SliderChangeListeners.BSliderChangeListener(colorDisplayPanelRefToSet, this));

        // Add action listeners to color value text fields.
        this.rColorValue.addActionListener(new ValueActionListeners.RValueActionListener(colorDisplayPanelRefToSet, this));
        this.gColorValue.addActionListener(new ValueActionListeners.GValueActionListener(colorDisplayPanelRefToSet, this));
        this.bColorValue.addActionListener(new ValueActionListeners.BValueActionListener(colorDisplayPanelRefToSet, this));
    }

    // Slider color value functions:
    // Slider setter functions.
    public void setRColorSlider(int value){
        this.rColorSlider.setValue(value);
    }

    public void setGColorSlider(int value){
        this.gColorSlider.setValue(value);
    }

    public void setBColorSlider(int value){
        this.bColorSlider.setValue(value);
    }

    // Slider getter functions.
    public int getRSliderValue(){
        return this.rColorSlider.getValue();
    }

    public int getGSliderValue(){
        return this.gColorSlider.getValue();
    }

    public int getBSliderValue(){
        return this.bColorSlider.getValue();
    }

    // Text field color value functions:
    // Text field setter functions.
    public void setRColorValue(int colorValue){
        this.rColorValue.setText(Integer.toString(colorValue));
    }

    public void setGColorValue(int colorValue){
        this.gColorValue.setText(Integer.toString(colorValue));
    }

    public void setBColorValue(int colorValue){
        this.bColorValue.setText(Integer.toString(colorValue));
    }

    // Text field getters functions.
    public int getRColorValue(){
        return Integer.parseInt(this.rColorValue.getText());
    }

    public int getGColorValue(){
        return Integer.parseInt(this.gColorValue.getText());
    }

    public int getBColorValue(){
        return Integer.parseInt(this.bColorValue.getText());
    }
}
