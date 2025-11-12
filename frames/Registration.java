package frames;
import javax.swing.*;
import javax.swing.ImageIcon;
import oracle.jrockit.jfr.ActiveRecordingEvent;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame implements ActionListener{
  private JPanel panel;
  private Font f;
  private Font f2;
  private Font f3;
 
  private JLabel labelUsername;
  private JLabel labelPassword;
  private JLabel labelConfirm;
  private JLabel labelGender;
  private JLabel labelEmail;
  private JLabel top;
  
  private ButtonGroup genderGroup;
  private JTextField textUser;
  private JPasswordField textPassword;
  private JPasswordField textConfirm;
  private JTextField textEmail;
  private JButton buttonBack;
  private JButton buttonConfirm;
  private JButton buttonExit;
 
  private JRadioButton radioMale;
  private JRadioButton radioFemale;
  private JRadioButton radioOthers;
  private JLabel image;

  public Registration() {
    this.initializeComponents();
    this.setTitle("Page 2nd");
    this.setSize(800, 900);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    
  }

private void initializeComponents(){

  this.panel = new JPanel(null);
  f=new Font("Time New Roman",Font.BOLD,20);
  f2=new Font("Time New Roman",Font.BOLD,20);
  f3=new Font("Calibri",Font.PLAIN,15);

  
  

this.top=new JLabel("Please Sign Up");
this.top.setBounds(240,130,300,40);
top.setFont(new Font("Calibri",Font.BOLD,38));
top.setForeground(Color.red);

this.panel.add(this.top);

this.labelUsername=new JLabel("Username:");
this.labelUsername.setBounds(50,245,150,20);
labelUsername.setFont(new Font("Calibri",Font.BOLD,25));
labelUsername.setForeground(Color.BLACK);
this.panel.add(this.labelUsername);

this. textUser=new JTextField();
this.textUser.setBounds(270,240,250,35);
textUser.setFont(new Font("Calibri",Font.PLAIN,20));
textUser.setBackground(Color.WHITE);
this.panel.add(this.textUser);

this.labelPassword=new JLabel("Password:");
this.labelPassword.setBounds(50,300,150,50);
labelPassword.setFont(new Font("Calibri",Font.BOLD,25));
labelPassword.setForeground(Color.BLACK);
this.panel.add(this.labelPassword);

this.textPassword=new JPasswordField();
this.textPassword.setBounds(270,308,250,35);
textPassword.setFont(new Font("Calibri",Font.PLAIN,20));
textPassword.setBackground(Color.WHITE);
this.panel.add(this.textPassword);
//Lebel Confirm Password//
this.labelConfirm=new JLabel("Confirm Password:");
this.labelConfirm.setBounds(50,380,200,20);
labelConfirm.setForeground(Color.BLACK);
this.panel.add(this.labelConfirm);
labelConfirm.setFont(new Font("Calibri",Font.BOLD,25));

this.textConfirm=new JPasswordField();
this.textConfirm.setBounds(270,370,250,35);
textConfirm.setFont(new Font("Calibri",Font.PLAIN,20));
textConfirm.setBackground(Color.WHITE);
this.panel.add(this.textConfirm);

this.labelEmail=new JLabel("Email:");
this.labelEmail.setBounds(50,440,100,30);
labelEmail.setFont(new Font("Calibri",Font.BOLD,25));
labelEmail.setForeground(Color.BLACK);
this.panel.add(this.labelEmail);

this.textEmail=new JTextField();
this.textEmail.setBounds(270,435,250,35);
textEmail.setFont(new Font("Calibri",Font.PLAIN,15));
textEmail.setBackground(Color.WHITE);
this.panel.add(this.textEmail);


    // create a logical group of radio button; cannot be displayed
    // only one radio button can be selected from a group
   /* this.genderGroup=new ButtonGroup();

    this.labelGender=new JLabel("Gender:");
    this.labelGender.setBounds(50,500,100,30);
    labelGender.setFont(f2);
    labelGender.setForeground(Color.BLACK);
    this.panel.add(this.labelGender);
        // radio - can choose one out of many oftions
    this.radioMale=new JRadioButton("Male");
    this.radioMale.setBounds(150,498,80,40);
    radioMale.setFont(new Font("Calibri",Font.PLAIN,20));
    this.panel.add(this.radioMale);
    this.genderGroup.add(radioMale);
    
    
    this.radioFemale=new JRadioButton("Female");
    this.radioFemale.setBounds(230,498,100,40);
    radioFemale.setFont(new Font("Calibri",Font.PLAIN,20));
    this.panel.add(this.radioFemale);
    this.genderGroup.add(radioFemale);
    
    this.radioOthers=new JRadioButton("Others");
    this.radioOthers.setBounds(330,498,90,40);
    radioOthers.setFont(new Font("Calibri",Font.PLAIN,20));

    this.panel.add(this.radioOthers);
    this.genderGroup.add(radioOthers);
	
	*/



this.buttonBack=new JButton("Back");
this.buttonBack.setBounds(200,600,150,30);
buttonBack.setFont(f);
buttonBack.setForeground(Color.BLUE);
this.buttonBack.addActionListener(this);
this.panel.add(this.buttonBack);

this.buttonConfirm=new JButton("Confirm");
this.buttonConfirm.setBounds(450,600,150,30);
buttonConfirm.setFont(f);
buttonConfirm.setForeground(Color.BLUE);
//Action Listener
this.buttonConfirm.addActionListener(this);
this.panel.add(this.buttonConfirm);

this.buttonExit=new JButton("Exit");
this.buttonExit.setBounds(320,700,150,30);
buttonExit.setFont(f);
buttonExit.setForeground(Color.BLUE);
//Action Listener
this.buttonExit.addActionListener(this);
this.panel.add(this.buttonExit);

ImageIcon imageIcon = new ImageIcon(".\\Image\\as.jpg");
    this.image = new JLabel(imageIcon);
    this.image.setBounds(0, 0, 800, 950);
    this.panel.add(this.image);


this.add(this.panel);
   
    }
	
  public void actionPerformed(ActionEvent e){
    String buttonText = e.getActionCommand();
	
    if(buttonText.equals("Exit")){
      System.exit(0);
    }
	else if(buttonText.equals("Back")){
      new FirstPage();
      dispose();
    }
    else if(buttonText.equals("Confirm"))
	{
			String username = textUser.getText();
			String pass = textPassword.getText();
			String confirmPass = textConfirm.getText();
			String sEmail = textEmail.getText();
			
			if (username.isEmpty()==false && pass.isEmpty()==false && sEmail.isEmpty()==false && sEmail.isEmpty()==false)
			{
				
				if (confirmPass.equals(pass)) 
				{
					try {
                    	File file = new File(".\\Data\\history.txt");
                    	if (!file.exists()) {
                        	file.createNewFile();
                    	}
                    	FileWriter fw = new FileWriter(file, true);
                    	BufferedWriter bw = new BufferedWriter(fw);
                    	PrintWriter pw = new PrintWriter(bw);
                    	pw.println("User Name : " + username);
                    	pw.println("Password : " + pass);
                    	pw.println("Email : " + sEmail);
						//pw.println("===============================================");
						pw.println("===============================================");
                    	pw.close();
                    	
                    	JOptionPane.showMessageDialog(null, "New User Created Successfully.", "User created",JOptionPane.INFORMATION_MESSAGE);
                    	
                      textUser.setText(null);

                      textPassword.setText(null);
                    	textConfirm.setText(null);
                    	textEmail.setText(null);
					}
					
					catch (Exception ex) {
						System.out.print(ex);
						JOptionPane.showMessageDialog(null,"Something Went wrong");
						}
					}
				else 
				{
					JOptionPane.showMessageDialog(null,"Password didn't match");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please enter valid information in the fields");
			}
      
	{
      new FirstPage();
      dispose();
  
    }

   }
    
  }
}