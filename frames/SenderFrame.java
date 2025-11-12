package frames;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SenderFrame extends JFrame implements ActionListener

{ private JPanel panel;
  private JLabel labelpanel;
  private JLabel labelfullname;
  private JTextField fullname;
  private JLabel labelnid;
  private JTextField nid; 
  private JLabel labelphonenum;
  private JTextField phonenum; 
  private JLabel labelnationality;
  private JTextField nationality; 
  private JLabel  labelemail;
  private JTextField email;
  private JLabel labeldivision;
  private JComboBox division;
  private JLabel labelproducttype;
  private JComboBox producttype;
  private JLabel  labeladdress;
  private JTextArea address;
  private JLabel  labelsize;
  private JTextField size;
  private JButton buttoncancel;
  private JButton buttonconfirm;
  private JLabel image;

  public SenderFrame()
  {
	this.initializeComponents();

    this.setTitle("Main Frame");
    this.setSize(700, 600);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);  
  }
  public void initializeComponents()
  {
	this.panel=new JPanel(null);
  this.labelpanel=new JLabel("Sender Details :");
	this.labelpanel.setBounds(20,20,200,50);
	this.panel.add(this.labelpanel);
	
	this.labelfullname=new JLabel("Full Name :");
    this.labelfullname.setBounds(20,50,100,20);
	this.panel.add(this.labelfullname);
	
	this.fullname=new JTextField();
	this.fullname.setBounds(130,50,200,20);
	this.panel.add(this.fullname);

  this.labelfullname=new JLabel("Full Name :");
    this.labelfullname.setBounds(20,50,100,20);
	this.panel.add(this.labelfullname);

	

  this.labelnid=new JLabel("NID :");
	this.labelnid.setBounds(20,80,100,20);
	this.panel.add(this.labelnid);
	
	this.nid=new JTextField();
	this.nid.setBounds(130,80,200,20);
	this.panel.add(this.nid);

  this.labelnationality=new JLabel("Nationality :");
	this.labelnationality.setBounds(20,110,100,20);
	this.panel.add(this.labelnationality);
	
	this.nationality=new JTextField();
	this.nationality.setBounds(130,110,200,20);
	this.panel.add(this.nationality);

  this.labelphonenum=new JLabel("Phone Number :");
	this.labelphonenum.setBounds(20,140,100,20);
	this.panel.add(this.labelphonenum);
	
	this.phonenum=new JTextField();
	this.phonenum.setBounds(130,140,200,20);
	this.panel.add(this.phonenum);





  this.labelemail=new JLabel("Email :");
	this.labelemail.setBounds(20,170,100,20);
	this.panel.add(this.labelemail);
	
	this.email=new JTextField();
	this.email.setBounds(130,170,200,20);
	this.panel.add(this.email);

  this.labeldivision=new JLabel("Pickup Area :");
	this.labeldivision.setBounds(20,200,100,20);
	this.panel.add(this.labeldivision);
	
	String[] Divisions = new String[]{"Dhaka","Chattogram","Barishal","Rajshahi","Rangpur","Sylhet","Khulna","Mymanshing"};
	
	this.division=new JComboBox(Divisions);
	this.division.setBounds(130,200,200,20);
	this.panel.add(this.division);

  this.labeladdress=new JLabel("Address :");
	this.labeladdress.setBounds(20,230,100,20);
	this.panel.add(this.labeladdress);
	
	this.address=new JTextArea();
	this.address.setBounds(130,230,200,20);
	this.panel.add(this.address);

  this.labelproducttype=new JLabel("Product Type :");
	this.labelproducttype.setBounds(20,260,100,20);
	this.panel.add(this.labelproducttype);
	
	String[] Type = new String[]{"Electronics","Glass","Clothes","Metal","Antique Pieces","'Jwellary"};
	
	this.producttype=new JComboBox(Type);
	this.producttype.setBounds(130,260,100,20);
	this.panel.add(this.producttype);

    this.labelsize=new JLabel("Product Size :");
	this.labelsize.setBounds(20,290,100,20);
	this.panel.add(this.labelsize);
	
	this.size=new JTextField();
	this.size.setBounds(130,290,200,20);
	this.panel.add(this.size);

    this.buttonconfirm=new JButton("Next");
	this.buttonconfirm.setBounds(230,330,100,20);
	this.buttonconfirm.addActionListener(this);
	this.panel.add(this.buttonconfirm);
	
	this.buttoncancel=new JButton("Back");
	this.buttoncancel.setBounds(100,330,100,20);
	this.buttoncancel.addActionListener(this);
	this.panel.add(this.buttoncancel);

	ImageIcon imageIcon = new ImageIcon(".\\Image\\images (4).jpeg");
    this.image = new JLabel(imageIcon);
    this.image.setBounds(0, 0, 700, 600);
    this.panel.add(this.image);

	this.add(this.panel);

  }
  
  public void actionPerformed(ActionEvent e){
	String buttonconfirm=e.getActionCommand();
	if(buttonconfirm.equals("Next")){
     new Receiver();
	 dispose();
	}
	else
	{
		new HomePage();
		dispose();
	}

  }
  
  
	
}