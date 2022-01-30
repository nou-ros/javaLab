package mangmics.ny;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


class Signup implements ActionListener{

	JFrame frame;
	JLabel imageLabel, textLabel, idLabel, nameLabel, emailLabel, passwordLabel, confirmPasswordLabel;
	JTextField idField, nameField, emailField;
	JPasswordField passwordField, confirmPasswordField;
	JButton b1, b2;
	
	Signup(){
		frame = new JFrame("Signup Here");
		frame.setLayout(null);
		
		imageLabel = new JLabel();
		imageLabel.setBounds(0, 0, 728, 546);
		imageLabel.setLayout(null);
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("mangmics/ny/images/signup.jpg"));
		imageLabel.setIcon(img);
		
		textLabel = new JLabel("Account Create Information");
		textLabel.setBounds(100, 40, 500, 50);
		textLabel.setFont(new Font("serif",Font.BOLD, 30));
		textLabel.setBackground(Color.white);
		textLabel.setHorizontalAlignment(JLabel.CENTER);
		textLabel.setVerticalAlignment(JLabel.CENTER);
		textLabel.setOpaque(true);
		textLabel.setForeground(Color.black);
		imageLabel.add(textLabel);
		
		
		idLabel = new JLabel("User id");
		idLabel.setBounds(200, 150, 100, 30);
		idLabel.setFont(new Font("serif",Font.BOLD, 15));
		idLabel.setBackground(Color.white);
		idLabel.setHorizontalAlignment(JLabel.CENTER);
		idLabel.setVerticalAlignment(JLabel.CENTER);
		idLabel.setOpaque(true);
		idLabel.setForeground(Color.black);
		imageLabel.add(idLabel);
		
		idField = new JTextField();
		idField.setBounds(400, 150, 200, 35);
		imageLabel.add(idField);
		
		
		nameLabel = new JLabel("Username");
		nameLabel.setBounds(200, 190, 100, 30);
		nameLabel.setFont(new Font("serif",Font.BOLD, 15));
		nameLabel.setBackground(Color.white);
		nameLabel.setHorizontalAlignment(JLabel.CENTER);
		nameLabel.setVerticalAlignment(JLabel.CENTER);
		nameLabel.setOpaque(true);
		nameLabel.setForeground(Color.black);
		imageLabel.add(nameLabel);
		
		nameField = new JTextField();
		nameField.setBounds(400, 190, 200, 35);
		imageLabel.add(nameField);
		
		
		emailLabel = new JLabel("Email");
		emailLabel.setBounds(200, 230, 100, 30);
		emailLabel.setFont(new Font("serif",Font.BOLD, 15));
		emailLabel.setBackground(Color.white);
		emailLabel.setHorizontalAlignment(JLabel.CENTER);
		emailLabel.setVerticalAlignment(JLabel.CENTER);
		emailLabel.setOpaque(true);
		emailLabel.setForeground(Color.black);
		imageLabel.add(emailLabel);
		
		emailField = new JTextField();
		emailField.setBounds(400, 230, 200, 35);
		imageLabel.add(emailField);
		
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(200, 270, 100, 30);
		passwordLabel.setFont(new Font("serif",Font.BOLD, 15));
		passwordLabel.setBackground(Color.white);
		passwordLabel.setHorizontalAlignment(JLabel.CENTER);
		passwordLabel.setVerticalAlignment(JLabel.CENTER);
		passwordLabel.setOpaque(true);
		passwordLabel.setForeground(Color.black);
		imageLabel.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(400, 270, 200, 35);
		imageLabel.add(passwordField);
		
		
		confirmPasswordLabel = new JLabel("Confirm Password");
		confirmPasswordLabel.setBounds(120, 310, 200, 30);
		confirmPasswordLabel.setFont(new Font("serif",Font.BOLD, 15));
		confirmPasswordLabel.setBackground(Color.white);
		confirmPasswordLabel.setHorizontalAlignment(JLabel.CENTER);
		confirmPasswordLabel.setVerticalAlignment(JLabel.CENTER);
		confirmPasswordLabel.setOpaque(true);
		confirmPasswordLabel.setForeground(Color.black);
		imageLabel.add(confirmPasswordLabel);
		
		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setBounds(400, 310, 200, 35);
		imageLabel.add(confirmPasswordField);
		
		b1 = new JButton("Signin");
		b1.setBounds(200, 380, 100, 40);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		imageLabel.add(b1);
		
		b2 = new JButton("Cancel");
		b2.setBounds(440, 380, 100, 40);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		imageLabel.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.setSize(720, 545);
//		from where the frame will open
		frame.setLocation(140, 70);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String user_id, username, email, pass, conf_pass;
		
		user_id = idField.getText();
		username = nameField.getText();		
		email = emailField.getText();		
		pass = passwordField.getText();	
		conf_pass = confirmPasswordField.getText();	
		
		if(ae.getSource() == b1)
		{
				System.out.println("Signin Clicked " + pass + " " + conf_pass);
				
				if(pass.equalsIgnoreCase(conf_pass))
				{
					try {
						Conn c2 = new Conn();
						String query = "insert into login values('"+username+"', '"+pass+"', '"+email+"')";
						
						c2.s.executeUpdate(query);
						JOptionPane.showMessageDialog(null, "User Created Successfully!");
						frame.setVisible(false);
						new Login();
						
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Exception: " + e.getMessage());
						System.out.println("Error: "+ e);				
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Passwords must match!");
					frame.setVisible(false);
					new Login();
				}
					
			}
		
		if(ae.getSource() == b2)
		{
			System.out.println("Cancel Clicked");
			frame.setVisible(false);
			new Login();
		}
	}
}
