import javax.swing.*;
import java.awt.*;

public class ColorDisplayPanel extends JPanel {

    private int r;
    private int g;
    private int b;

    private final ValueDisplayPanel valueDisplayPanel;

    public ColorDisplayPanel(ValueDisplayPanel valueDisplayPanelToSet){
        this.r = 0;
        this.g = 0;
        this.b = 0;
        this.valueDisplayPanel = valueDisplayPanelToSet;

        this.setPreferredSize(new Dimension(400, 350));
        this.setBackground(new Color(this.r, this.g, this.b));
        this.valueDisplayPanel.update(this.r, this.g, this.b);
    }

    public void setDisplayR(int value){
        if(value >= 0 && value <= 255){
            this.r = value;
            this.setBackground(new Color(this.r, this.g, this.b));
            this.valueDisplayPanel.update(this.r, this.g, this.b);
        }
    }

    public void setDisplayG(int value){
        if(value >= 0 && value <= 255){
            this.g = value;
            this.setBackground(new Color(this.r, this.g, this.b));
            this.valueDisplayPanel.update(this.r, this.g, this.b);
        }
    }

    public void setDisplayB(int value){
        if(value >= 0 && value <= 255){
            this.b = value;
            this.setBackground(new Color(this.r, this.g, this.b));
            this.valueDisplayPanel.update(this.r, this.g, this.b);
        }
    }

    public int getR(){
        return this.r;
    }

    public int getG(){
        return this.g;
    }

    public int getB(){
        return this.b;
    }
}