import java.awt.*;
import java.awt.event.*;
public class AwtControlDemo{
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel ControlPanel;
    public AwtControlDemo(){
        prepareGUI();
    }
    public static void main(String... args){
        AwtControlDemo awtControlDemo = new AwtControlDemo();
        awtControlDemo.showEventDemo();
    }
    private void prepareGUI(){
        mainFrame = new Frame("Java AWT Example");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);
        ControlPanel = new Panel();
        ControlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(ControlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
        ControlPanel.setBackground(Color.YELLOW);
    }
    private void showEventDemo(){
        headerLabel.setText("Control in action: Button");
        Button okButton =new Button("OK");
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");
        okButton.setActionCommand("Ok");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("CAncel");
        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());
        ControlPanel.add(okButton);
        ControlPanel.add(submitButton);
        ControlPanel.add(cancelButton);
        mainFrame.setVisible(true);
    }
    private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String command =e.getActionCommand();
            if(command.equals("OK")){
                statusLabel.setText("Ok Button Clicked");
            }
            else if(command.equals("Submit")){
                statusLabel.setText("Submit Button CLicked");
            }
            else{
                statusLabel.setText("Cancel Button Clicked");
            }
        }
    }
}
