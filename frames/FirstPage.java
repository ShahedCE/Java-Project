package frames;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.ImageIcon;



public class  FirstPage extends JFrame implements ActionListener
{
	private JPanel panel;

	private JButton buttonCancle;
	private JButton buttonOK;	
	private JButton buttonLogin;
	private JLabel lebelUsername;
	private JLabel image;

	
	public FirstPage()
	{
		this.initializeComponents();
		this.setTitle("AS TRANSPORTATION");
		this.setSize(625,455);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void initializeComponents()
	{
		this.panel=new JPanel(null);
		
		
		this.lebelUsername=new JLabel("WELCOME TO AS TRANSPORTATION !");
		this.lebelUsername.setBounds(75,65,400,40);
		lebelUsername.setFont(new Font("Calibri",Font.BOLD,25));
        lebelUsername.setForeground(Color.blue);

		this.panel.add(this.lebelUsername);

		
		
		this.buttonOK=new JButton("Signup");
		this.buttonOK.setBounds(150,235,90,30);
		this.buttonOK.addActionListener(this);
		this.panel.add(this.buttonOK);		
		
		this.buttonOK=new JButton("Login");
		this.buttonOK.setBounds(350,235,90,30);
		this.buttonOK.addActionListener(this);
		this.panel.add(this.buttonOK);
		
		this.buttonCancle=new JButton("EXIT");
		this.buttonCancle.setBounds(250,280,85,30);
		this.buttonCancle.addActionListener(this);
		this.panel.add(this.buttonCancle);

		ImageIcon imageIcon = new ImageIcon(".\\Image\\login1.jpg");
		this.image = new JLabel(imageIcon);
		this.image.setBounds(0, 0, 617, 423);
		this.panel.add(this.image);
			
		
		this.add(this.panel);
		
	}
	 public void actionPerformed(ActionEvent e){
    String buttonText = e.getActionCommand();
	if(buttonText.equals("EXIT")){
	System.exit(0);
	}
   
	  else if(buttonText.equals("Login")){
			new Login();
			dispose();
		}

    else {
      
      new Registration();
	   dispose();
    }
  
   }
	
	
}
