package mangmics.ny;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class DeleteComic implements ActionListener{
	JFrame frame;
	JLabel textLabel, imageLabel, titleLabel, authorLabel, rankLabel, titleValue, authorValue, rankValue;
	JTextField comic_id;
	JButton b1, b2, b3, b4; //b1 = search, b2=back, b3=delete, b4=cancel;
	
	DeleteComic(){	
		frame = new JFrame("Delete Comic");
		frame.setLayout(null);
		
		imageLabel = new JLabel();
		// set the image size (x, y, length, breadth)
		imageLabel.setBounds(0, 0, 730, 500);
		imageLabel.setLayout(null);
		//using the resource background image
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("mangmics/ny/images/remove.jpg"));
		imageLabel.setIcon(img);
		
		
		textLabel = new JLabel("Comic id: ");
		textLabel.setVisible(true);
		textLabel.setBounds(200, 40, 150, 30);
		textLabel.setFont(new Font("serif",Font.BOLD, 20));
		textLabel.setForeground(Color.white);
		imageLabel.add(textLabel);
		
		
		comic_id = new JTextField();
		comic_id.setBounds(330, 40, 120, 30);
		imageLabel.add(comic_id);
		
		titleLabel = new JLabel("Title: ");
		titleLabel.setBounds(180, 180, 100, 30);
		titleLabel.setFont(new Font("serif",Font.BOLD, 20));
		titleLabel.setForeground(Color.white);
		titleLabel.setBackground(Color.black);
		titleLabel.setOpaque(true);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setVerticalAlignment(JLabel.CENTER);
		titleLabel.setVisible(false);
		imageLabel.add(titleLabel);
		
		titleValue = new JLabel();
		titleValue.setBounds(320, 180, 250, 30);
		titleValue.setFont(new Font("serif",Font.BOLD, 20));
		titleValue.setForeground(Color.white);
		titleValue.setBackground(Color.black);
		titleValue.setVisible(false);
		titleValue.setOpaque(true);
		titleValue.setHorizontalAlignment(JLabel.CENTER);
		titleValue.setVerticalAlignment(JLabel.CENTER);
		imageLabel.add(titleValue);
		
		
		authorLabel = new JLabel("Author: ");
		authorLabel.setBounds(180, 220, 100, 30);
		authorLabel.setFont(new Font("serif",Font.BOLD, 20));
		authorLabel.setForeground(Color.white);
		authorLabel.setBackground(Color.black);
		authorLabel.setOpaque(true);
		authorLabel.setHorizontalAlignment(JLabel.CENTER);
		authorLabel.setVerticalAlignment(JLabel.CENTER);
		authorLabel.setVisible(false);
		imageLabel.add(authorLabel);
		
		authorValue = new JLabel();
		authorValue.setBounds(320, 220, 250, 30);
		authorValue.setFont(new Font("serif",Font.BOLD, 20));
		authorValue.setForeground(Color.white);
		authorValue.setBackground(Color.black);
		authorValue.setOpaque(true);
		authorValue.setVisible(false);
		authorValue.setHorizontalAlignment(JLabel.CENTER);
		authorValue.setVerticalAlignment(JLabel.CENTER);
		imageLabel.add(authorValue);
		
		
		rankLabel = new JLabel("Rank: ");
		rankLabel.setBounds(180, 260, 100, 30);
		rankLabel.setFont(new Font("serif",Font.BOLD, 20));
		rankLabel.setForeground(Color.white);
		rankLabel.setBackground(Color.black);
		rankLabel.setOpaque(true);
		rankLabel.setHorizontalAlignment(JLabel.CENTER);
		rankLabel.setVerticalAlignment(JLabel.CENTER);
		rankLabel.setVisible(false);
		imageLabel.add(rankLabel);
		
		rankValue = new JLabel();
		rankValue.setBounds(320, 260, 250, 30);
		rankValue.setFont(new Font("serif",Font.BOLD, 20));
		rankValue.setForeground(Color.white);
		rankValue.setBackground(Color.black);
		rankValue.setOpaque(true);
		rankValue.setHorizontalAlignment(JLabel.CENTER);
		rankValue.setVerticalAlignment(JLabel.CENTER);
		rankValue.setVisible(false);
		imageLabel.add(rankValue);
		
		
		b1 = new JButton("Search");
		b1.setBounds(240, 100, 90, 20);
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		imageLabel.add(b1);
		
		b2 = new JButton("Back");
		b2.setBounds(380, 100, 90, 20);
		b2.setBackground(Color.white);
		b2.setForeground(Color.black);
		imageLabel.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		b3 = new JButton("Delete");
		b3.setBounds(230, 350, 90, 20);
		b3.setBackground(Color.white);
		b3.setForeground(Color.black);
		b3.setVisible(false);
		imageLabel.add(b3);
		
		b4 = new JButton("Cancel");
		b4.setBounds(380, 350, 90, 20);
		b4.setBackground(Color.white);
		b4.setForeground(Color.black);
		b4.setVisible(false);
		imageLabel.add(b4);
		
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.setSize(728, 535);
//		from where the frame will open
		frame.setLocation(140, 70);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1)
		{
			System.out.println("Search Clicked "+ comic_id.getText() );
			try {
				Conn c4 = new Conn();
				String query = "select title, author, rank from comics where comic_id='"+comic_id.getText()+"'";
				ResultSet rs = c4.s.executeQuery(query);
//				frame.setVisible(false);
				
				int i = 0;
				if(rs.next()) {
					String title, author, rank;
					
					title = rs.getString(1);
					author = rs.getString(2);
					rank = rs.getString(3);
					
					
					titleLabel.setVisible(true);
					authorLabel.setVisible(true);
					rankLabel.setVisible(true);
					b3.setVisible(true);
					b4.setVisible(true);
					i = 1;
					titleValue.setText(title);
					authorValue.setText(author);
					rankValue.setText(rank);
					
					titleValue.setVisible(true);
					authorValue.setVisible(true);
					rankValue.setVisible(true);
				}
					
				if(i==0)
				{
					JOptionPane.showMessageDialog(null, "Resource Not Available!");
				}
				
				}catch(Exception e)
				{
					e.printStackTrace();
				}
		}
		if(ae.getSource() == b3){
			System.out.println("Delete Clicked");
			try {
				Conn c5 = new Conn();
				String delquery = "delete from comics where comic_id = '"+comic_id.getText()+"'";
				c5.s.executeUpdate(delquery);
				JOptionPane.showMessageDialog(null, "Deleted Successfull!");
				titleLabel.setVisible(false);
				authorLabel.setVisible(false);
				rankLabel.setVisible(false);
				b3.setVisible(false);
				b4.setVisible(false);
				titleValue.setVisible(false);
				authorValue.setVisible(false);
				rankValue.setVisible(false);
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null, "Exception occured while deleting record " + e);
			}

		 }
		if(ae.getSource()==b4)
		{
			System.out.println("Cancel Clicked");
			frame.setVisible(false);
			new DeleteComic();
		}
			
		if(ae.getSource()==b2)
		{
			System.out.println("Back Clicked");
			frame.setVisible(false);
			new DetailComic();
		} 

		
	}

}
