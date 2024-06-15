import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Click Me");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Enter Text");
    private JRadioButton radio1 = new JRadioButton("Select 1");
    private JRadioButton radio2 = new JRadioButton("Select 2");
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI() {
        super("Simple GUI");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);

        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }
    class ButtonEventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = "";
            message += "Button was clicked\n";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Select 1 " : "Select 2 ") + "is selected\n";
            message += "Check is " + (check.isSelected()? "checked" : "unchecked") + "\n";
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
