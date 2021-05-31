package mangmics.ny;

import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class FrontPage implements ActionListener{
	JFrame frame;
	JLabel imageLabel;
	JButton b;
	
	FrontPage(){
		// front frame name 
		frame = new JFrame("Simple Management System");
//		frame.setBackground(Color.WHITE);
		frame.setLayout(null);
		
		//using the resource background image
		ImageIcon bi_1 = new ImageIcon(ClassLoader.getSystemResource("mangmics/ny/images/background.jpg"));
		//adding the background image size actual size
		Image bi_2 = bi_1.getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT);
		//make the Image to imageicon so we can insert it into the label
		ImageIcon bi_3 = new ImageIcon(bi_2);
		imageLabel = new JLabel(bi_3);
		// set the image size (x, y, length, breadth)
		imageLabel.setBounds(0, 0, 1280, 710);
		
		//button
		b = new JButton("Enter To The Comic World");
		b.setBorderPainted(false);
		b.setBackground(Color.white);
		//font color
		b.setForeground(Color.black);
		b.setBounds(500, 600, 300, 70);
		b.addActionListener(this);
		
		JLabel textLabel = new JLabel("Comic Management System");
		textLabel.setBounds(100, 300, 1470, 80);
		textLabel.setFont(new Font("serif",Font.BOLD,  70));
		textLabel.setForeground(Color.black);
		
		//adding the text in imageLabel
		imageLabel.add(textLabel);
		//adding the button in the imageLabel
		imageLabel.add(b);
		//add the constructed imageLabel to the frame
		frame.add(imageLabel);
		
		// frame color to white
//		frame.getContentPane().setBackground(Color.WHITE);
		frame.setVisible(true);
		frame.setSize(1280, 745);
//		from where the frame will open
		frame.setLocation(140, 70);
		
		//textLabel blinking functionality
		while(true) {
			textLabel.setVisible(false); 
			try {
				Thread.sleep(500);
			}catch(Exception e) {};
			
			textLabel.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception e) {};
			
		}
		
	}
	
	// perform button click event 
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == b) {
			//hide the ongoing frame
			frame.setVisible(false);
			System.out.println("Go to login page.");
			new Login();
		}
	}
	
	public static void main(String [] args)
	{
		new FrontPage();
	}
}