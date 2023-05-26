import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValueActionListeners {

    // R value JTextField ActionListener object.
    public static class RValueActionListener implements ActionListener{

        private final ColorDisplayPanel colorDisplayPanel;
        private final ColorControlPanel colorControlPanel;

        public RValueActionListener(ColorDisplayPanel colorDisplayPanelToSet, ColorControlPanel colorControlPanelToSet){
            this.colorDisplayPanel = colorDisplayPanelToSet;
            this.colorControlPanel = colorControlPanelToSet;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Gets R value from the text field that was updated.
            int rValue = this.colorControlPanel.getRColorValue();

            // Update the R slider and update color display with the new R Value.
            this.colorControlPanel.setRColorSlider(rValue);
            this.colorDisplayPanel.setDisplayR(rValue);
        }
    }

    // G value JTextField ActionListener object.
    public static class GValueActionListener implements ActionListener{

        private final ColorDisplayPanel colorDisplayPanel;
        private final ColorControlPanel colorControlPanel;

        public GValueActionListener(ColorDisplayPanel colorDisplayPanelToSet, ColorControlPanel colorControlPanelToSet){

            this.colorDisplayPanel = colorDisplayPanelToSet;
            this.colorControlPanel = colorControlPanelToSet;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Gets G value from the text field that was updated.
            int gValue = this.colorControlPanel.getGColorValue();

            // Update the G slider and update color display with the new G Value.
            this.colorControlPanel.setGColorSlider(gValue);
            this.colorDisplayPanel.setDisplayG(gValue);
        }
    }

    // B value JTextField ActionListener object.
    public static class BValueActionListener implements ActionListener{

        private final ColorDisplayPanel colorDisplayPanel;
        private final ColorControlPanel colorControlPanel;

        public BValueActionListener(ColorDisplayPanel colorDisplayPanelToSet, ColorControlPanel colorControlPanelToSet) {
            this.colorDisplayPanel = colorDisplayPanelToSet;
            this.colorControlPanel = colorControlPanelToSet;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // Gets G value from the text field that was updated.
            int bValue = this.colorControlPanel.getBColorValue();

            // Update the B slider and update color display with the new B Value.
            this.colorControlPanel.setBColorSlider(bValue);
            this.colorDisplayPanel.setDisplayB(bValue);
        }
    }
}
