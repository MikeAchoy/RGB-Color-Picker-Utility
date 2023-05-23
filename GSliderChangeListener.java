import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class GSliderChangeListener implements ChangeListener {

    private ColorControlPanel colorControlPanel;
    private ColorDisplayPanel colorDisplayPanel;

    public GSliderChangeListener(ColorDisplayPanel colorDisplayPanelToSet, ColorControlPanel colorControlPanelToSet){
        this.colorDisplayPanel = colorDisplayPanelToSet;
        this.colorControlPanel = colorControlPanelToSet;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // Get G value.
        int gValue = this.colorControlPanel.getGSliderValue();
        // Apply changes to the color display panel.
        this.colorDisplayPanel.setDisplayG(gValue);
        this.colorControlPanel.setGColorValue(gValue);
    }
}
