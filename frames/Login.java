package frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Login extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel lebelUsername;
    private JLabel lebelPassword;
    private JTextField textuser;
    private JPasswordField textPassword;
    private JButton buttonLogin;
    private JButton buttonBack;
    private JLabel image;

    public Login() {
        this.initializeComponents();
        this.setTitle("AS TRANSPORTATION");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initializeComponents() {
        this.panel = new JPanel(null);

        JLabel header = new JLabel("PLEASE LOGIN....!");
        header.setBounds(185, 40, 400, 40);
        header.setFont(new Font("Cooper Black", Font.BOLD, 25));
        header.setForeground(Color.BLACK);
        this.panel.add(header);

        this.lebelUsername = new JLabel("Username");
        this.lebelUsername.setBounds(140, 95, 300, 45);
        this.panel.add(this.lebelUsername);

        this.textuser = new JTextField();
        this.textuser.setBounds(230, 105, 150, 30);
        this.panel.add(this.textuser);

        this.lebelPassword = new JLabel("Password");
        this.lebelPassword.setBounds(140, 140, 390, 40);
        this.panel.add(this.lebelPassword);

        this.textPassword = new JPasswordField();
        this.textPassword.setBounds(230, 145, 150, 30);
        this.panel.add(this.textPassword);

        this.buttonLogin = new JButton("LOGIN");
        this.buttonLogin.setBounds(320, 260, 85, 30);
        this.buttonLogin.addActionListener(this);
        this.panel.add(this.buttonLogin);

        this.buttonBack = new JButton("BACK");
        this.buttonBack.setBounds(200, 260, 85, 30);
        this.buttonBack.addActionListener(this);
        this.panel.add(this.buttonBack);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Asus\\Downloads\\login1.jpg");
        this.image = new JLabel(imageIcon);
        this.image.setBounds(0, 0, 617, 423);
        this.panel.add(this.image);

        this.add(this.panel);
    }

    public void actionPerformed(ActionEvent e) {
        String buttonText = e.getActionCommand();

        if (buttonText.equals("LOGIN")) {
            String user = textuser.getText().trim();
            String pass = new String(textPassword.getPassword()).trim();

            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                // ✅ Dynamic path to history.txt
                String projectDir = System.getProperty("user.dir"); // project root
                String filePath = projectDir + "\\Data\\history.txt";

                List<String> allLines = Files.readAllLines(Paths.get(filePath));
                boolean found = false;

                for (int i = 0; i < allLines.size(); i++) {
                    String line = allLines.get(i).trim();
                    if (line.equalsIgnoreCase("User Name : " + user)) {
                        if (i + 1 < allLines.size() && allLines.get(i + 1).trim().equalsIgnoreCase("Password : " + pass)) {
                            JOptionPane.showMessageDialog(null, "Login Successful!");
                            new HomePage(); // open homepage
                            dispose(); // close login window
                            found = true;
                            break;
                        }
                    }
                }

                if (!found) {
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password!", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error reading file: " + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else if (buttonText.equals("BACK")) {
            new FirstPage();
            dispose();
        }
    }
}
