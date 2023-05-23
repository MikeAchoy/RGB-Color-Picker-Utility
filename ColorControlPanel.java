
import java.awt.*;
import javax.swing.*;

public class ColorControlPanel extends JPanel {
    private JSlider rColorSlider;
    private JSlider gColorSlider;
    private JSlider bColorSlider;
    private JTextField rColorValue;
    private JTextField gColorValue;
    private JTextField bColorValue;

    private ColorDisplayPanel colorDisplayPanelRef;

    public ColorControlPanel(ColorDisplayPanel colorDisplayPanelRefToSet) {
        this.colorDisplayPanelRef = colorDisplayPanelRefToSet;

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

        this.rColorSlider.addChangeListener(new RSliderChangeListener(this.colorDisplayPanelRef, this));
        this.gColorSlider.addChangeListener(new GSliderChangeListener(this.colorDisplayPanelRef, this));
        this.bColorSlider.addChangeListener(new BSliderChangeListener(this.colorDisplayPanelRef, this));

        this.rColorValue.addActionListener(new RValueActionListener(this.colorDisplayPanelRef, this));
    }

    public int getRSliderValue(){
        return this.rColorSlider.getValue();
    }

    public int getGSliderValue(){
        return this.gColorSlider.getValue();
    }

    public int getBSliderValue(){
        return this.bColorSlider.getValue();
    }

    public void setRColorValue(int colorValue){
        this.rColorValue.setText(Integer.toString(colorValue));
    }

    public void setGColorValue(int colorValue){
        this.gColorValue.setText(Integer.toString(colorValue));
    }

    public void setBColorValue(int colorValue){
        this.bColorValue.setText(Integer.toString(colorValue));
    }
}
