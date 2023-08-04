package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Welcome extends JFrame{

    public static void main(String[] args) {
        new Welcome().setVisible(true);
    }
    
    public Welcome() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

    
    private void initialize() {
	
        setForeground(Color.CYAN);
        setLayout(null); 

        JLabel NewLabel = new JLabel("");
	NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/front.jpg")));
	NewLabel.setBounds(0, 0, 1400, 700); 
	add(NewLabel); 
        
        JLabel AirlineManagementSystem = new JLabel("WELCOME TO ONLINE FLIGHT BOOKING SYSTEM");
	AirlineManagementSystem.setForeground(Color.black);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
	AirlineManagementSystem.setBounds(300, 60, 900, 55);
	NewLabel.add(AirlineManagementSystem);
		
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
		
        JMenu AirlineSystem = new JMenu("Airline System");
        AirlineSystem.setForeground(Color.BLUE);
	menuBar.add(AirlineSystem);
		
        JMenuItem FlightDetails = new JMenuItem("Flight Details");
	AirlineSystem.add(FlightDetails);
	
	JMenu Ticket = new JMenu("TICKET");
        Ticket.setForeground(Color.BLUE);
	menuBar.add(Ticket);
        
        JMenuItem booking = new JMenuItem("Booking");
	Ticket.add(booking);
		
	JMenuItem Cancellation = new JMenuItem("Cancellation");
	Ticket.add(Cancellation);
        
	JMenuItem PassengerDetails = new JMenuItem("Journey Details");
	Ticket.add(PassengerDetails);
		
	JMenuItem SectorDetails_1 = new JMenuItem("Payment Details");
	Ticket.add(SectorDetails_1);
		
	JMenu User = new JMenu("USER");
        User.setForeground(Color.BLUE);
	menuBar.add(User);
        
        JMenuItem logout = new JMenuItem("Log Out");
	User.add(logout);       
                
        JMenu welcome = new JMenu("Welcome, Customer");
        Ticket.setForeground(Color.BLUE);
	menuBar.add(welcome);
		
	FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
	});
        		
	booking.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Booking();
            }
	});
		
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
		} catch (Exception e) {
                    e.printStackTrace();
		}
            }
	});
		
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
	});
        
        logout.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Mainframe();
            }
	});
       
		
        setSize(1950,1090);
	setVisible(true);
    }
}
