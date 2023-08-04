package airline.management.system;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Payment extends JFrame{ //Third Frame

    
	JTextField textField,textField_1,textField_2,textField_3,textField_4;

        public Payment(){
            getContentPane().setForeground(Color.BLUE);
            getContentPane().setBackground(Color.WHITE);
            setTitle("PAYMENT DETAILS");
		 
            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(778,486);
            getContentPane().setLayout(null);
			
            JLabel Cardno = new JLabel("CARD NO");
            Cardno.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Cardno.setBounds(60, 80, 150, 27);
            add(Cardno);
            
            textField = new JTextField();
            textField.setBounds(200, 80, 150, 27);
            add(textField);
			
            JLabel cvv = new JLabel("CVV");
            cvv.setFont(new Font("Tahoma", Font.PLAIN, 17));
            cvv.setBounds(60, 130, 150, 27);
            add(cvv);
			
            textField_1 = new JTextField();
            textField_1.setBounds(200, 130, 150, 27);
            add(textField_1);
	   
            JLabel Card_type = new JLabel("CARD TYPE");
            Card_type.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Card_type.setBounds(60, 30, 150, 27);
            add(Card_type);
            		
	String[] items1 =  {"Credit card","Debit card"};
	JComboBox comboBox = new JComboBox(items1);
	comboBox.setBounds(200, 30, 150, 27);
	add(comboBox);

            JLabel CardName = new JLabel("NAME AS ON CARD");
            CardName.setFont(new Font("Tahoma", Font.PLAIN, 17));
            CardName.setBounds(550, 30, 150, 27);
            add(CardName);
            			
            textField_2 = new JTextField();
            textField_2.setBounds(725, 30, 150, 27);
            add(textField_2);
        
                                    
            JLabel exp = new JLabel("EXPIRY ");
            exp.setFont(new Font("Tahoma", Font.PLAIN, 17));
            exp.setBounds(550, 80, 150, 27);
            add(exp);
            
            textField_3 = new JTextField();
            textField_3.setBounds(725, 80, 150, 27);
            add(textField_3);
                                    
            JLabel amount = new JLabel("AMOUNT");
            amount.setFont(new Font("Tahoma", Font.PLAIN, 17));
            amount.setBounds(550, 130, 150, 27);
            add(amount);
				
	String[] items2 =  {"6000","8000", "10000"};
	JComboBox comboBox_1 = new JComboBox(items2);
	comboBox_1.setBounds(725, 130, 150, 27);
	add(comboBox_1);
			
            JButton Next = new JButton("PAY AND BOOK TICKETS");
            Next.setBounds(200, 230, 180, 30);
            Next.setBackground(Color.BLACK);
            Next.setForeground(Color.WHITE);
            add(Next);
                                                
            JLabel pnr = new JLabel("PNR NO");
            pnr.setFont(new Font("Tahoma", Font.PLAIN, 17));
            pnr.setBounds(60, 180, 150, 27);
            add(pnr);
            
            textField_4 = new JTextField();
            textField_4.setBounds(200, 180, 150, 27);
            add(textField_4);
            
            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String cardno = textField.getText();
                    String nameoncard =  textField_2.getText();
                    String expdate = textField_3.getText();
                    String cardtype  = (String) comboBox.getSelectedItem();
                    String amt  = (String) comboBox_1.getSelectedItem();
                    String pnr = textField_4.getText();
                    
                    try {
                        conn c = new conn();
                        String st1 = "UPDATE payment set cardholder ='"+nameoncard+"',card_type ='"+cardtype+"', card_no = '"+cardno+"',exp_date = '"+expdate+"',amt_paid = '"+amt+"' where pnr ='"+pnr+"'";
                      
                        c.s.executeUpdate(st1);
                        JOptionPane.showMessageDialog(null,"Payment Successful");
                        setVisible(false);
                        JOptionPane.showMessageDialog(null,"Tickets Booked");

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
        new Payment();
    }   
}