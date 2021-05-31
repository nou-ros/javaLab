package mangmics.ny;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Login implements ActionListener{
	JFrame frame;
	JLabel nameLabel, passwordLabel;
	JTextField name;
	JPasswordField password;
	JButton b1, b2;
	
	Login(){
		frame = new JFrame("Login");
		frame.setLayout(null);
		
		nameLabel = new JLabel("Username");
		nameLabel.setBounds(40, 60, 100, 30);
		frame.add(nameLabel);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(40, 120, 100, 30);
		frame.add(passwordLabel);
		
		name = new JTextField();
		name.setBounds(150, 60, 150, 30);
		frame.add(name);
		
		password = new JPasswordField();
		password.setBounds(150, 120, 150, 30);
		frame.add(password);
		
		
		//using the resource background image
		ImageIcon bi_1 = new ImageIcon(ClassLoader.getSystemResource("mangmics/ny/images/login.jpg"));
		//adding the background image size actual size
		Image bi_2 = bi_1.getImage().getScaledInstance(841, 699, Image.SCALE_DEFAULT);
		//make the Image to imageicon so we can insert it into the label
		ImageIcon bi_3 = new ImageIcon(bi_2);
		JLabel imageLabel = new JLabel(bi_3);
		// set the image size (x, y, length, breadth)
		imageLabel.setBounds(0, 0, 841, 700);
		
		
		b1 = new JButton("Login");
		b1.setBounds(40, 240, 120, 30);
		b1.setFont(new Font("serif",Font.BOLD, 12));
		b1.addActionListener(this);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		

		
		b2 = new JButton("Sign Up");
		b2.setBounds(180, 240, 120, 30);
		b2.setFont(new Font("serif",Font.BOLD, 12));
		b2.addActionListener(this);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
	
		imageLabel.add(b2);
		imageLabel.add(b1);
		
		frame.add(imageLabel);
		
		frame.setVisible(true);
		frame.setSize(841, 700);
//		from where the frame will open
		frame.setLocation(140, 70);
	}
	
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent ae) {
			
			if(ae.getSource() == b1) {
				System.out.println("Clicked login");
				try {
					Conn c1 = new Conn();
					String uname, pass, query;
					uname = name.getText();
					pass = password.getText();
					
					query = "select * from login where username='"+uname+"' and password='"+pass+"'";
					
					//saving the result of query
					ResultSet rs = c1.s.executeQuery(query);
					
					if(rs.next())
					{
						//open the next frame
						new DetailComic();
						System.out.println("Go to DetailComic page.");
						//close the login frame
						frame.setVisible(false);
						
					}else
					{
						JOptionPane.showMessageDialog(null, "Invalid Credentials!");
//						frame.setVisible(false);
					}
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
			if(ae.getSource() == b2){
				frame.setVisible(false);
				System.out.println("Sign Up");
				new Signup();
			}
				
		}

}

