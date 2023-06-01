import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValueActionListeners {

    // Value check function.
    private static boolean checkValue(int value){
        return (value >= 0) && (value <= 255);
    }

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

            // Check rValue before it updates application objects.
            boolean goodValue = checkValue(rValue);

            if(goodValue) {
                // Update the R slider and update color display with the new R Value.
                this.colorControlPanel.setRColorSlider(rValue);
                this.colorDisplayPanel.setDisplayR(rValue);
                this.colorControlPanel.setCurrentR(rValue);
            }
            else{
                //  TODO: Add checker to check if the value entered is an int or not.
                // Set the value in the R text field to the previous accepted value.
                int prevValue = this.colorControlPanel.getCurrentR();
                this.colorControlPanel.setRColorValue(prevValue);

                // Display Error window.
                ErrorWindow errorWindow = new ErrorWindow();
                errorWindow.setVisible();
            }
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

            // Check gValue before it updates application objects.
            boolean goodValue = checkValue(gValue);

            if(goodValue){
                // Update the G slider and update color display with the new G Value.
                this.colorControlPanel.setGColorSlider(gValue);
                this.colorDisplayPanel.setDisplayG(gValue);
                this.colorControlPanel.setCurrentG(gValue);
            }
            else{
                //  TODO: Add checker to check if the value entered is an int or not.
                // Set the value in the G text field to the previous accepted value.
                int prevValue = this.colorControlPanel.getCurrentG();
                this.colorControlPanel.setGColorValue(prevValue);

                // Display error window.
                ErrorWindow errorWindow = new ErrorWindow();
                errorWindow.setVisible();
            }
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

            // Check gValue before it updates application objects.
            boolean goodValue = checkValue(bValue);

            if(goodValue){
                // Update the B slider and update color display with the new B Value.
                this.colorControlPanel.setBColorSlider(bValue);
                this.colorDisplayPanel.setDisplayB(bValue);
                this.colorControlPanel.setCurrentB(bValue);
            }
            else{
                //  TODO: Add checker to check if the value entered is an int or not.
                // Set the value in the B text field to the previous accepted value.
                int prevValue = this.colorControlPanel.getCurrentB();
                this.colorControlPanel.setBColorValue(prevValue);

                // Display error window.
                ErrorWindow errorWindow = new ErrorWindow();
                errorWindow.setVisible();
            }
        }
    }
}