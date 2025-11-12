package frames;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import oracle.jrockit.jfr.ActiveRecordingEvent;

import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class  HomePage extends JFrame implements ActionListener
{
	private JPanel panel;
	private JLabel lebelUsername;
    private JButton buttonDash;
	private JButton buttonout;
	private JButton buttonSend;
	private JLabel image;

	
	public HomePage()
	{
		this.initializeComponents();
		this.setTitle("AS TRANSPORTATION");
		this.setSize(600,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void initializeComponents()
	{
		this.panel=new JPanel(null);
		
		this.lebelUsername=new JLabel("Home");
		this.lebelUsername.setBounds(25,20,400,40);
		this.panel.add(this.lebelUsername);
		
		this.buttonSend=new JButton("Send Parcel");
		this.buttonSend.setBounds(220,140,150,30);
		this.buttonSend.addActionListener(this);
		this.panel.add(this.buttonSend);
		
	    this.buttonDash=new JButton("Dash Board");
		this.buttonDash.setBounds(245,190,100,30);
		this.panel.add(this.buttonDash);
		
		this.buttonout=new JButton("Logout");
		this.buttonout.setBounds(460,25,100,30);
		this.buttonout.addActionListener(this);
		this.panel.add(this.buttonout);

		ImageIcon imageIcon = new ImageIcon(".\\Image\\home.jpg");
		this.image = new JLabel(imageIcon);
		this.image.setBounds(0, 0, 617, 423);
		this.panel.add(this.image);
		
		
		this.add(this.panel);
		
	}
	
	public void actionPerformed(ActionEvent e){
	String buttonSend = e.getActionCommand();

	if(buttonSend.equals("Send Parcel")){
		new SenderFrame();
		dispose();
	}
	else if(buttonSend.equals("Logout")){
		new Login();
		dispose();
	}
  }
}
