package mangmics.ny;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class UpdateComic extends AddComic implements ActionListener{
	JFrame frame;
	JLabel imageLabel, textLabel, idLabel, titleLabel, authorLabel, chaptersLabel, statusLabel, rankLabel, scoreLabel, 
	popularityLabel, typeLable, startDateLabel, endDateLabel;
	JTextField idField, titleField, authorField, chaptersField, statusField, rankField, scoreField, popularityField, typeField, startDateField, endDateField;
	JButton b1, b2; // update, cancel
	String comic_id;
	
	UpdateComic(String cid){
		super(0);
		frame = new JFrame("Update Details");
		frame.setLayout(null);
		
		imageLabel = new JLabel();
		// set the image size (x, y, length, breadth)
		imageLabel.setBounds(0, 0, 1280, 720);
		imageLabel.setLayout(null);
		//using the resource background image
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("mangmics/ny/images/update.jpg"));
		imageLabel.setIcon(img);
		
		textLabel = new JLabel("Update Comic Details");
		textLabel.setBounds(350, 40, 600, 50);
		textLabel.setFont(new Font("serif",Font.BOLD, 40));
		textLabel.setForeground(Color.black);
		imageLabel.add(textLabel);
		frame.add(imageLabel);
		
		titleLabel = new JLabel("Comic Title:");
		titleLabel.setBounds(600, 200, 100, 30);
		titleLabel.setFont(new Font("serif",Font.BOLD, 15));
		titleLabel.setForeground(Color.black);
		imageLabel.add(titleLabel);
		
		titleField = new JTextField();
		titleField.setBounds(750, 200, 200, 35);
		imageLabel.add(titleField);
		
		authorLabel = new JLabel("Author:");
		authorLabel.setBounds(200, 200, 100, 30);
		authorLabel.setFont(new Font("serif",Font.BOLD, 15));
		authorLabel.setForeground(Color.black);
		imageLabel.add(authorLabel);
		
		authorField = new JTextField();
		authorField.setBounds(350, 200, 200, 35);
		imageLabel.add(authorField);
		
		chaptersLabel = new JLabel("Chapters:");
		chaptersLabel.setBounds(600, 250, 100, 30);
		chaptersLabel.setFont(new Font("serif",Font.BOLD, 15));
		chaptersLabel.setForeground(Color.black);
		imageLabel.add(chaptersLabel);
		
		chaptersField = new JTextField();
		chaptersField.setBounds(750, 250, 200, 35);
		imageLabel.add(chaptersField);
		
		statusLabel = new JLabel("Status:");
		statusLabel.setBounds(200, 250, 100, 30);
		statusLabel.setFont(new Font("serif",Font.BOLD, 15));
		statusLabel.setForeground(Color.black);
		imageLabel.add(statusLabel);
		
		statusField = new JTextField();
		statusField.setBounds(350, 250, 200, 35);
		imageLabel.add(statusField);
		
		rankLabel = new JLabel("Rank:");
		rankLabel.setBounds(600, 300, 100, 30);
		rankLabel.setFont(new Font("serif",Font.BOLD, 15));
		rankLabel.setForeground(Color.black);
		imageLabel.add(rankLabel);
		
		rankField = new JTextField();
		rankField.setBounds(750, 300, 200, 35);
		imageLabel.add(rankField);
		
		scoreLabel = new JLabel("Score:");
		scoreLabel.setBounds(200, 300, 100, 30);
		scoreLabel.setFont(new Font("serif",Font.BOLD, 15));
		scoreLabel.setForeground(Color.black);
		imageLabel.add(scoreLabel);
		
		scoreField = new JTextField();
		scoreField.setBounds(350, 300, 200, 35);
		imageLabel.add(scoreField);
		
		popularityLabel = new JLabel("Popularity:");
		popularityLabel.setBounds(600, 350, 100, 30);
		popularityLabel.setFont(new Font("serif",Font.BOLD, 15));
		popularityLabel.setForeground(Color.black);
		imageLabel.add(popularityLabel);
		
		popularityField = new JTextField();
		popularityField.setBounds(750, 350, 200, 35);
		imageLabel.add(popularityField);

		typeLable = new JLabel("Type:");
		typeLable.setBounds(200, 350, 100, 30);
		typeLable.setFont(new Font("serif",Font.BOLD, 15));
		typeLable.setForeground(Color.black);
		imageLabel.add(typeLable);
		
		typeField = new JTextField();
		typeField.setBounds(350, 350, 200, 35);
		imageLabel.add(typeField);
		
		startDateLabel = new JLabel("Start Date:");
		startDateLabel.setBounds(600, 400, 100, 30);
		startDateLabel.setFont(new Font("serif",Font.BOLD, 15));
		startDateLabel.setForeground(Color.black);
		imageLabel.add(startDateLabel);
		
		startDateField = new JTextField();
		startDateField.setBounds(750, 400, 200, 35);
		imageLabel.add(startDateField);
		
		endDateLabel = new JLabel("End Date:");
		endDateLabel.setBounds(200, 400, 150, 30);
		endDateLabel.setFont(new Font("serif",Font.BOLD, 15));
		endDateLabel.setForeground(Color.black);
		imageLabel.add(endDateLabel);
		
		endDateField = new JTextField();
		endDateField.setBounds(350, 400, 200, 35);
		imageLabel.add(endDateField);
		
		
		b1 = new JButton("Update");
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
			
		frame.setSize(1280, 720);
//		from where the frame will open
		frame.setLocation(140, 70);
		
		showData(cid);
	}
	
	int i = 0;
	String ic; 
	void showData(String id_comic)
	{
		try {
			
			Conn c6 = new Conn();
			String query = "select * from comics where comic_id='"+id_comic+"'";
			ResultSet rs = c6.s.executeQuery(query);
			
			if(rs.next())
			{
				frame.setVisible(true);
				i = 1;
				ic = id_comic;
				
				titleField.setText(rs.getString(2));		
				authorField.setText(rs.getString(3));		
				chaptersField.setText(rs.getString(4));	
				statusField.setText(rs.getString(5));	
				rankField.setText(rs.getString(6));		
				scoreField.setText(rs.getString(7));	
				popularityField.setText(rs.getString(8));	
				typeField.setText(rs.getString(9));
				startDateField.setText(rs.getString(10));
				endDateField.setText(rs.getString(11));
				
			}
			if(i==0)
			{
				
				JOptionPane.showMessageDialog(null, "Resource not available!!");
				new SearchComic();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			frame.setVisible(true);
			frame.setSize(1280, 720);
//			from where the frame will open
			frame.setLocation(140, 70);
		}
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1 && i==1)
		{
			System.out.println("comic_id: " + ic);
			try {
				
				Conn c7 = new Conn();
				String query = "update comics set title='"+titleField.getText()
				+"',author='"+authorField.getText()+"',chapters='"+chaptersField.getText()+"',status='"+statusField.getText()
				+"',rank='"+rankField.getText()+"',score='"+scoreField.getText()+"',popularity='"+
				popularityField.getText()+"',type='"+typeField.getText()+"',start_date='"+startDateField.getText()
				+"',end_date='"+endDateField.getText()+"' where comic_id='"+ic+"';";
				
				c7.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "Updated Successfully!!");
				frame.setVisible(false);
				new SearchComic();
			}catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Exception: "+e.getMessage());
				e.printStackTrace();
			}
		}
		if(ae.getSource()==b2)
		{
			frame.setVisible(false);
			new DetailComic();
		}
	}
}
