import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderChangeListeners {

    // R Slider
    public static class RSliderChangeListener implements ChangeListener{

        private final ColorControlPanel colorControlPanel;
        private final ColorDisplayPanel colorDisplayPanel;

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

    // G Slider
    public static class GSliderChangeListener implements ChangeListener{

        private final ColorDisplayPanel colorDisplayPanel;
        private final ColorControlPanel colorControlPanel;

        public GSliderChangeListener(ColorDisplayPanel colorDisplayPanelToSet, ColorControlPanel colorControlPanelToSet){
            this.colorDisplayPanel = colorDisplayPanelToSet;
            this.colorControlPanel = colorControlPanelToSet;
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            // Get G value.
            int gValue = this.colorControlPanel.getGSliderValue();
            // Apply changes to value text field and color display.
            this.colorControlPanel.setGColorValue(gValue);
            this.colorDisplayPanel.setDisplayG(gValue);
        }
    }

    // B Slider
    public static class BSliderChangeListener implements ChangeListener{

        private final ColorDisplayPanel colorDisplayPanel;
        private final ColorControlPanel colorControlPanel;

        public BSliderChangeListener(ColorDisplayPanel colorDisplayPanelToSet, ColorControlPanel colorControlPanelToSet){
            this.colorDisplayPanel = colorDisplayPanelToSet;
            this.colorControlPanel = colorControlPanelToSet;
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            // Get B value.
            int bValue = this.colorControlPanel.getBSliderValue();
            // Apply changes to value text field and color display.
            this.colorControlPanel.setBColorValue(bValue);
            this.colorDisplayPanel.setDisplayB(bValue);
        }
    }
}