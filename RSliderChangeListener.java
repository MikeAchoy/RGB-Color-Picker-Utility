import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class RSliderChangeListener implements ChangeListener {

    private ColorControlPanel colorControlPanel;
    private ColorDisplayPanel colorDisplayPanel;

    public RSliderChangeListener(ColorDisplayPanel colorDisplayPanelToSet, ColorControlPanel colorControlPanelToSet){
        this.colorDisplayPanel = colorDisplayPanelToSet;
        this.colorControlPanel = colorControlPanelToSet;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // Get R value.
        int rValue = this.colorControlPanel.getRSliderValue();
        // Apply changes to the color display panel.
        this.colorDisplayPanel.setDisplayR(rValue);
        this.colorControlPanel.setRColorValue(rValue);
    }
}
