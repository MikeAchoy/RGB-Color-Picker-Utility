import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BSliderChangeListener implements ChangeListener {
    private ColorControlPanel colorControlPanel;
    private ColorDisplayPanel colorDisplayPanel;

    public BSliderChangeListener(ColorDisplayPanel colorDisplayPanelToSet, ColorControlPanel colorControlPanelToSet){
        this.colorDisplayPanel = colorDisplayPanelToSet;
        this.colorControlPanel = colorControlPanelToSet;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // Get B value.
        int bValue = this.colorControlPanel.getBSliderValue();
        // Apply changes to the color display panel.
        this.colorDisplayPanel.setDisplayB(bValue);
        this.colorControlPanel.setBColorValue(bValue);
    }
}
