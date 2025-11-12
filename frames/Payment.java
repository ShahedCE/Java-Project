package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Payment extends JFrame implements ActionListener {
    private JButton buttonConfirm, buttonPrevious, buttonExit;

    public Payment() {
        setTitle("Payment Page");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Use a layout manager instead of null
        JPanel panel = new JPanel(new BorderLayout());
        
        // Create a panel for buttons with FlowLayout
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        buttonPrevious = new JButton("Previous");
        buttonPrevious.addActionListener(this);
        buttonPanel.add(buttonPrevious);

        buttonConfirm = new JButton("Confirm Payment");
        buttonConfirm.addActionListener(this);
        buttonPanel.add(buttonConfirm);

        buttonExit = new JButton("Exit");
        buttonExit.addActionListener(this);
        buttonPanel.add(buttonExit);

        panel.add(buttonPanel, BorderLayout.SOUTH);
        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals("Previous")) {
            JOptionPane.showMessageDialog(this, "Go to Receiver Page");
        } else if (cmd.equals("Confirm Payment")) {
            JOptionPane.showMessageDialog(this, "Go to Home Page");
        } else if (cmd.equals("Exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Payment());
    }
}