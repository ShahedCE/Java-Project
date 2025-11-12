package frames;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class  Receiver extends JFrame implements ActionListener
{
	private JPanel panel;
	private JLabel lebelUsername;
	private JLabel lebelPassword;
	private JLabel lebelDepartment;
	private JTextField textuser;
	private JTextField textArea;
	private JTextField textEmail;

	private JButton buttonNext;
	private JButton buttonBack;
	private JComboBox departmentDropDownlist;
	private JLabel image;


	
	public Receiver()
	{
		this.initializeComponents();
		this.setTitle("My Basic Info");
		this.setSize(700,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void initializeComponents()
	{
		this.panel=new JPanel(null);
		
		this.lebelUsername=new JLabel("Receiver Name");
		this.lebelUsername.setBounds(50,40,400,25);
		this.panel.add(this.lebelUsername);
		
		this.textuser=new JTextField();
		this.textuser.setBounds(165,40,160,25);
		this.panel.add(this.textuser);
		
		this.lebelPassword=new JLabel("Number");
		this.lebelPassword.setBounds(50,70,110,55);
		this.panel.add(this.lebelPassword);
		
				
		this.textuser=new JTextField();
		this.textuser.setBounds(165,80,160,25);
		this.panel.add(this.textuser);
			
		
		this.lebelPassword=new JLabel("Email");
		this.lebelPassword.setBounds(50,105,110,55);
		this.panel.add(this.lebelPassword);
		
		this.textEmail=new JTextField();
		this.textEmail.setBounds(165,120,160,25);
		this.panel.add(this.textEmail);
		
		this.lebelDepartment=new JLabel("Delivary Area");
		this.lebelDepartment.setBounds(50,165,80,25);
		this.panel.add(this.lebelDepartment);
		
		String []Departments=new String[]{"DHAKA","RANGPUR","RAJSHAHI","CHOTTAGRAM","SYLHET","BARISHL",""};
		this.departmentDropDownlist=new JComboBox(Departments);
		this.departmentDropDownlist.setBounds(165,165,85,25);
		this.panel.add(this.departmentDropDownlist);
		
		
		this.lebelPassword=new JLabel("Delivary Address");
		this.lebelPassword.setBounds(50,210,120,35);
		this.panel.add(this.lebelPassword);
		
		this.textArea=new JTextField();
		this.textArea.setBounds(165,210,140,25);
		this.panel.add(this.textArea);
		
	
		this.buttonNext=new JButton("Next");
		this.buttonNext.setBounds(300,280,85,30);
		this.buttonNext.addActionListener(this);
		this.panel.add(this.buttonNext);

		this.buttonBack=new JButton("Back");
		this.buttonBack.setBounds(170,280,85,30);
		this.buttonBack.addActionListener(this);
		this.panel.add(this.buttonBack);
			
		ImageIcon imageIcon = new ImageIcon(".\\Image\\delivery-7595692.png");
		this.image = new JLabel(imageIcon);
		this.image.setBounds(0, 0, 700, 600);
		this.panel.add(this.image);
		
		
		this.add(this.panel);
		
	}
	
	public void actionPerformed(ActionEvent e){


		String buttonBack =e.getActionCommand();

		
		if (buttonBack.equals("Back")){
			new SenderFrame();
			dispose();
		}
		else if (buttonBack.equals("Next")){ 
			new Payment();
			dispose();
		}
	}
	
}

