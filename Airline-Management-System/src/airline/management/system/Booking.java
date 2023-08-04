package airline.management.system;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Booking extends JFrame{ //Third Frame

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6, textField_7, textField_8,textField_9;

        public Booking(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("BOOKING DETAILS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel Passportno = new JLabel("PASSPORT NO");
            Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Passportno.setBounds(60, 80, 150, 27);
            add(Passportno);
            
            textField = new JTextField();
            textField.setBounds(200, 80, 150, 27);
            add(textField);
			
            JButton Next = new JButton("PROCEED TO PAY");
            Next.setBounds(200, 420, 150, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
			
            JLabel Pnrno = new JLabel("PNR NO");
            Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Pnrno.setBounds(60, 120, 150, 27);
            add(Pnrno);
			
            textField_1 = new JTextField();
            textField_1.setBounds(200, 120, 150, 27);
            add(textField_1);
            
            JLabel Address = new JLabel("ADDRESS");
            Address.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Address.setBounds(60, 170, 150, 27);
            add(Address);
			
            textField_2 = new JTextField();
            textField_2.setBounds(200, 170, 150, 27);
            add(textField_2);
            		
            JLabel Nationality = new JLabel("NATIONALITY");
            Nationality.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Nationality.setBounds(60, 220, 150, 27);
            add(Nationality);
			
            textField_3 = new JTextField();
            textField_3.setBounds(200, 220, 150, 27);
            add(textField_3);
	
            JLabel Name = new JLabel("NAME");
            Name.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Name.setBounds(60, 270, 150, 27);
            add(Name);
	
            textField_4 = new JTextField();
            textField_4.setBounds(200, 270, 150, 27);
            add(textField_4);
	
            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Gender.setBounds(60, 320, 150, 27);
            add(Gender);
		
            JRadioButton NewRadioButton = new JRadioButton("MALE");
            NewRadioButton.setBackground(Color.WHITE);
            NewRadioButton.setBounds(200, 320, 70, 27);
            add(NewRadioButton);
	
            JRadioButton Female = new JRadioButton("FEMALE");
            Female.setBackground(Color.WHITE);
            Female.setBounds(280, 320, 70, 27);
            add(Female);
            
            JLabel Phno = new JLabel("PH NO");
            Phno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Phno.setBounds(60, 370, 150, 27);
            add(Phno);
            
                
            JLabel Flightcode = new JLabel("FLIGHT CODE");
            Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Flightcode.setBounds(60, 30, 150, 27);
            add(Flightcode);
			
            textField_5 = new JTextField();
            textField_5.setBounds(200, 370, 150, 27);
            add(textField_5);
	
            setVisible(true);
            
                            
            JLabel Flightclass = new JLabel("FLIGHT CLASS");
            Flightclass.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Flightclass.setBounds(550, 30, 150, 27);
            add(Flightclass);
 	        
	String[] items3 =  {"First Class", "Business Class", "Economy Class"};
	JComboBox comboBox_2 = new JComboBox(items3);
	comboBox_2.setBounds(725, 30, 150, 27);
	add(comboBox_2);
        
                                    
            JLabel source = new JLabel("SOURCE");
            source.setFont(new Font("Tahoma", Font.PLAIN, 17));
            source.setBounds(550, 80, 150, 27);
            add(source);
        
        String[] items1 =  {"Bangalore", "Pune", "Delhi", "Goa"};
	JComboBox comboBox = new JComboBox(items1);
	comboBox.setBounds(725, 80, 150, 27);
	add(comboBox);
        
                                    
            JLabel destination = new JLabel("DESTINATION");
            destination.setFont(new Font("Tahoma", Font.PLAIN, 17));
            destination.setBounds(550, 130, 150, 27);
            add(destination);
		
		
	String[] items2 =  {"Bangalore","Pune", "Delhi", "Goa"};
	JComboBox comboBox_1 = new JComboBox(items2);
	comboBox_1.setBounds(725, 130, 150, 27);
	add(comboBox_1);
        
                                            
            JLabel book_date = new JLabel("BOOKING DATE");
            book_date.setFont(new Font("Tahoma", Font.PLAIN, 17));
            book_date.setBounds(550, 180, 150, 27);
            add(book_date);
            		
            textField_7 = new JTextField();
            textField_7.setBounds(725, 180, 150, 27);
            add(textField_7);
                                                
            JLabel dep_date = new JLabel("DEPARTURE DATE");
            dep_date.setFont(new Font("Tahoma", Font.PLAIN, 17));
            dep_date.setBounds(550, 230, 150, 27);
            add(dep_date);
            			
            textField_8 = new JTextField();
            textField_8.setBounds(725, 230, 150, 27);
            add(textField_8);
                                                      
            JLabel email = new JLabel("EMAIL");
            email.setFont(new Font("Tahoma", Font.PLAIN, 17));
            email.setBounds(550, 280, 150, 27);
            add(email);
            			
            textField_9 = new JTextField();
            textField_9.setBounds(725, 280, 150, 27);
            add(textField_9);
        
            textField_6 = new JTextField();
            textField_6.setBounds(200, 30, 150, 27);
            add(textField_6);

            
            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String passport_No = textField.getText();
                    String pnr_no = textField_1.getText();
                    String address =  textField_2.getText();
                    String nationality = textField_3.getText();
                    String name = textField_4.getText();
                    String fl_code = textField_6.getText();
                    String fl_class  = (String) comboBox_2.getSelectedItem();
                    String src  = (String) comboBox.getSelectedItem();
                    String dst  = (String) comboBox_1.getSelectedItem();
                    String booking_date = textField_7.getText();
                    String jny_date = textField_8.getText();
                    String email = textField_9.getText();
                    String gender = null;
                    String ph_no = textField_5.getText();
                    
                    if(NewRadioButton.isSelected()){
                        gender = "male";
                    
                    }else if(Female.isSelected()){
                        gender = "female";
                    }
                    
                    try {
                        conn c = new conn();
                        String st1 = "INSERT INTO reservation values('"+name+"', '"+gender+"', '"+ph_no+"','"+address+"', '"+nationality+"','"+passport_No+"','"+pnr_no+"','"+src+"','"+dst+"','"+fl_class+"','"+fl_code+"','"+booking_date+"','"+jny_date+"','"+email+"')";
                        String st2 = "INSERT INTO passenger values('"+name+"', '"+gender+"', '"+ph_no+"','"+address+"', '"+nationality+"','"+passport_No+"','"+email+"')";
                        String st3 = "INSERT INTO payment(pnr,passenger_name,payment_date) values('"+pnr_no+"','"+name+"','"+booking_date+"')";
                        
                        c.s.executeUpdate(st1);
                        c.s.executeUpdate(st2);
                        c.s.executeUpdate(st3);
                        
                        if(fl_class == "Economy Class"){
                                JOptionPane.showMessageDialog(null,"Amount to be paid : 6000");
                        }
                        else if(fl_class == "Business Class"){
                                JOptionPane.showMessageDialog(null,"Amount to be paid : 8000");
                        }
                        else{
                                JOptionPane.showMessageDialog(null,"Amount to be paid : 10000");
                        }
                       
                        setVisible(false);
                        new Payment();
                    
                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });
			
            setSize(960,600);
            setVisible(true);
            setLocation(200,80);
			
	}
        
    public static void main(String[] args){
        new Booking();
    }   
}