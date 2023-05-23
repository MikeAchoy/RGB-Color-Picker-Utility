import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RValueActionListener implements ActionListener{

    private ColorControlPanel colorControlPanel;
    private ColorDisplayPanel colorDisplayPanel;

    public RValueActionListener (ColorDisplayPanel colorDisplayPanelToSet, ColorControlPanel colorControlPanelToSet){
        this.colorDisplayPanel = colorDisplayPanelToSet;
        this.colorControlPanel = colorControlPanelToSet;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         // Get R value.
         int rValue = this.colorControlPanel.getRValue();
         // Apply changes to the color display panel.
         this.colorDisplayPanel.setDisplayR(rValue);
         this.colorControlPanel.setRSliderValue(rValue);
    }
}
