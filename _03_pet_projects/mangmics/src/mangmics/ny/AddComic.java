package mangmics.ny;

import java.sql.*;
import java.sql.Date;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;
import javax.swing.*;

import java.util.*;
import java.text.ParseException;


class AddComic implements ActionListener{

	JFrame frame;
	JLabel imageLabel, textLabel, idLabel, titleLabel, authorLabel, chaptersLabel, statusLabel, rankLabel, scoreLabel, 
	popularityLabel, typeLable, startDateLabel, endDateLabel;
	JTextField idField, titleField, authorField, chaptersField, statusField, rankField, scoreField, popularityField, typeField, startDateField, endDateField;
	
	JButton b1, b2;
	public int count = 0;
	public static InputStream input1, input2;
	
	public static File file, compressedImageFile;
	public static Image scaled;
	private File chooseFile;
	private String imageString;
	public static ByteArrayOutputStream boss;
	
	AddComic(int i){}
	
	AddComic(){
		frame = new JFrame("Add Comic");
		frame.setLayout(null);
		
		
		imageLabel = new JLabel();
		// set the image size (x, y, length, breadth)
		imageLabel.setBounds(0, 0, 1280, 720);
		imageLabel.setLayout(null);
		//using the resource background image
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("mangmics/ny/images/add.jpg"));
		imageLabel.setIcon(img);
		
		textLabel = new JLabel("New Comic Details");
		textLabel.setBounds(500, 40, 500, 50);
		textLabel.setFont(new Font("serif",Font.BOLD, 40));
		textLabel.setForeground(Color.white);
		imageLabel.add(textLabel);
		frame.add(imageLabel);
		
		idLabel = new JLabel("Comic ID");
		idLabel.setBounds(200, 150, 100, 30);
		idLabel.setFont(new Font("serif",Font.BOLD, 15));
		idLabel.setForeground(Color.white);
		imageLabel.add(idLabel);
		
		idField = new JTextField();
		idField.setBounds(400, 150, 200, 35);
		imageLabel.add(idField);
		
		
		titleLabel = new JLabel("Comic Title");
		titleLabel.setBounds(700, 150, 100, 30);
		titleLabel.setFont(new Font("serif",Font.BOLD, 15));
		titleLabel.setForeground(Color.white);
		imageLabel.add(titleLabel);
		
		titleField = new JTextField();
		titleField.setBounds(900, 150, 200, 35);
		imageLabel.add(titleField);
		
		authorLabel = new JLabel("Author");
		authorLabel.setBounds(200, 200, 100, 30);
		authorLabel.setFont(new Font("serif",Font.BOLD, 15));
		authorLabel.setForeground(Color.white);
		imageLabel.add(authorLabel);
		
		authorField = new JTextField();
		authorField.setBounds(400, 200, 200, 35);
		imageLabel.add(authorField);
		
		chaptersLabel = new JLabel("Chapters");
		chaptersLabel.setBounds(700, 200, 100, 30);
		chaptersLabel.setFont(new Font("serif",Font.BOLD, 15));
		chaptersLabel.setForeground(Color.white);
		imageLabel.add(chaptersLabel);
		
		chaptersField = new JTextField();
		chaptersField.setBounds(900, 200, 200, 35);
		imageLabel.add(chaptersField);
		
		statusLabel = new JLabel("Status");
		statusLabel.setBounds(200, 250, 100, 30);
		statusLabel.setFont(new Font("serif",Font.BOLD, 15));
		statusLabel.setForeground(Color.white);
		imageLabel.add(statusLabel);
		
		statusField = new JTextField();
		statusField.setBounds(400, 250, 200, 35);
		imageLabel.add(statusField);
		
		rankLabel = new JLabel("Rank");
		rankLabel.setBounds(700, 250, 100, 30);
		rankLabel.setFont(new Font("serif",Font.BOLD, 15));
		rankLabel.setForeground(Color.white);
		imageLabel.add(rankLabel);
		
		rankField = new JTextField();
		rankField.setBounds(900, 250, 200, 35);
		imageLabel.add(rankField);
		
		scoreLabel = new JLabel("Score");
		scoreLabel.setBounds(200, 300, 100, 30);
		scoreLabel.setFont(new Font("serif",Font.BOLD, 15));
		scoreLabel.setForeground(Color.white);
		imageLabel.add(scoreLabel);
		
		scoreField = new JTextField();
		scoreField.setBounds(400, 300, 200, 35);
		imageLabel.add(scoreField);
		
		popularityLabel = new JLabel("Popularity");
		popularityLabel.setBounds(700, 300, 100, 30);
		popularityLabel.setFont(new Font("serif",Font.BOLD, 15));
		popularityLabel.setForeground(Color.white);
		imageLabel.add(popularityLabel);
		
		popularityField = new JTextField();
		popularityField.setBounds(900, 300, 200, 35);
		imageLabel.add(popularityField);

		typeLable = new JLabel("Type");
		typeLable.setBounds(200, 350, 100, 30);
		typeLable.setFont(new Font("serif",Font.BOLD, 15));
		typeLable.setForeground(Color.white);
		imageLabel.add(typeLable);
		
		typeField = new JTextField();
		typeField.setBounds(400, 350, 200, 35);
		imageLabel.add(typeField);
		
		startDateLabel = new JLabel("Start Date");
		startDateLabel.setBounds(700, 350, 100, 30);
		startDateLabel.setFont(new Font("serif",Font.BOLD, 15));
		startDateLabel.setForeground(Color.white);
		imageLabel.add(startDateLabel);
		
		startDateField = new JTextField();
		startDateField.setBounds(900, 350, 200, 35);
		imageLabel.add(startDateField);
		
		endDateLabel = new JLabel("End Date");
		endDateLabel.setBounds(200, 400, 150, 30);
		endDateLabel.setFont(new Font("serif",Font.BOLD, 15));
		endDateLabel.setForeground(Color.white);
		imageLabel.add(endDateLabel);
		
		endDateField = new JTextField();
		endDateField.setBounds(400, 400, 200, 35);
		imageLabel.add(endDateField);
		
		
		b1 = new JButton("Submit");
		b1.setBounds(450, 550, 180, 40);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		imageLabel.add(b1);
		
		b2 = new JButton("Cancel");
		b2.setBounds(800, 550, 180, 40);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		imageLabel.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		

		frame.setVisible(true);
		frame.setSize(1280, 720);
//		from where the frame will open
		frame.setLocation(140, 70);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String comic_id, title, author, chapters, status, rank, popularity, score, type, startDate, endDate;
		comic_id = idField.getText();
		title = titleField.getText();		
		author = authorField.getText();		
		chapters = chaptersField.getText();	
		status = statusField.getText();	
		rank = rankField.getText();		
		popularity = popularityField.getText();		
		score = scoreField.getText();		
		type = typeField.getText();		
		startDate = startDateField.getText();
		endDate = endDateField.getText();
		
		
		if(ae.getSource() == b1)
		{
			System.out.println("Submit Clicked");
			
			try {
				Conn c2 = new Conn();
				String query = "insert into comics values('"+comic_id+"', '"+title+"', '"+author+"', '"+chapters+"', '"+status+"','"+rank+"','"+score+"','"+popularity+"', '"+type+"', '"+startDate+"' , '"+endDate+"')";
				
				c2.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Details Successfully Inserted");
				frame.setVisible(false);
				new DetailComic();
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Exception: " + e.getMessage());
				System.out.println("Error: "+ e);
			}
		} 
		if(ae.getSource() == b2)
		{
			System.out.println("Cancel Clicked");
			frame.setVisible(false);
			new DetailComic();
		}
	}
}
