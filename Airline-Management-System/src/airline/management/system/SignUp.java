package airline.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignUp extends JFrame implements ActionListener{
    
    TextField t1,t2,t3,t4,t5,t6;
    Label l1,l2,l3,l4,l5,l6;
    Button b2,b3,b4;
    GridBagLayout gbl;  
    GridBagConstraints gbc; 
    Font f1,f2;
    
    private void initialize(){
        setTitle("Sign Up");
                
        setBackground(Color.WHITE); 
        f1 = new Font("TimesRoman",Font.BOLD,20);
        f2 = new Font("TimesRoman",Font.BOLD,15);
		
        gbl=new GridBagLayout(); 
	gbc=new GridBagConstraints();
        setLayout(gbl); 
	
        l1 = new Label("Email");
        l1.setFont(f1);
	
        l2 = new Label("Mobile Number");
        l2.setFont(f1);
        
        l3 = new Label("Gender");
        l3.setFont(f1);
	
        l4 = new Label("Address");
        l4.setFont(f1);
        
        l5 = new Label("Username");
        l5.setFont(f1);
	
        l6 = new Label("Password");
        l6.setFont(f1);

	t1 = new TextField(15);
        t2 = new TextField(15);
        t3 = new TextField(15);
        t4 = new TextField(15);
        t5 = new TextField(15); 
	t6 = new TextField(15); 
        t6.setEchoChar('*');
	
	b2 = new Button("Reset");
        b2.setFont(f2);
		
        b3 = new Button("Submit");
        b3.setFont(f2);
		
        b4 = new Button("Close");
	b4.setFont(f2);
		
        gbc.gridx=0;
	gbc.gridy=0; 
        gbl.setConstraints(l1,gbc);
	add(l1);
        
	gbc.gridx=2;
        gbc.gridy=0;
	gbl.setConstraints(t1,gbc);
        add(t1);
		
	gbc.gridx=0;
        gbc.gridy=2;
	gbl.setConstraints(l2,gbc);
        add(l2);

	gbc.gridx=2;
        gbc.gridy=2;
        gbl.setConstraints(t2,gbc);
	add(t2);
        
        gbc.gridx=0;
        gbc.gridy=4;
	gbl.setConstraints(l3,gbc);
        add(l3);

	gbc.gridx=2;
        gbc.gridy=4;
        gbl.setConstraints(t3,gbc);
	add(t3);
        
        gbc.gridx=0;
        gbc.gridy=6;
	gbl.setConstraints(l4,gbc);
        add(l4);

	gbc.gridx=2;
        gbc.gridy=6;
        gbl.setConstraints(t4,gbc);
	add(t4);
        
        gbc.gridx=0;
        gbc.gridy=8;
	gbl.setConstraints(l5,gbc);
        add(l5);

	gbc.gridx=2;
        gbc.gridy=8;
        gbl.setConstraints(t5,gbc);
	add(t5);
        
        gbc.gridx=0;
        gbc.gridy=10;
	gbl.setConstraints(l6,gbc);
        add(l6);

	gbc.gridx=2;
        gbc.gridy=10;
        gbl.setConstraints(t6,gbc);
	add(t6);
				
	
	gbc.gridx=0;
        gbc.gridy=20;
	gbl.setConstraints(b2,gbc);
        add(b2);

        gbc.gridx=2;
	gbc.gridy=20;
        gbl.setConstraints(b3,gbc);
	add(b3);
	
        gbc.gridx=4;
	gbc.gridy=20;
        gbl.setConstraints(b4,gbc);
	add(b4);
        

        b2.addActionListener(this);
        b3.addActionListener(this);
	b4.addActionListener(this);
                
        setVisible(true);   
        setSize(500,350); 
        setLocation(400,200);
//        setLocation(200,100);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
          
            t1.setText("");  
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
	}
        if(ae.getSource()==b4){
            setVisible(false); 
	}
        if(ae.getSource()==b3){
            try{
                conn c1 = new conn();
                
                String s1 = t1.getText();
                String s2 = t2.getText();
                String s3 = t3.getText();
                String s4 = t4.getText();
                String s5 = t5.getText();
                String s6 = t6.getText();
            
                String str = "insert into signup values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"')";
                int rs = c1.s.executeUpdate(str);  
                System.out.println(rs);
                if(rs == 0){
                    JOptionPane.showMessageDialog(null,"Error in Signing up...!");
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Sign up Successful...!");
                    setVisible(false);
                }
                
                String st = "insert into login values('"+s5+"','"+s6+"')";
                c1.s.executeUpdate(st);
            
            }catch(Exception e){System.out.println("Error");}
            
             ;
	}
    }        
   
    public static void main(String[] args){
            new SignUp();
    }

    public SignUp() {
        initialize();
    }
}