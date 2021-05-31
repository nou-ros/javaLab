package mangmics.ny;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.sql.*;

class PrintData implements ActionListener{
	JFrame frame;
	JLabel imageLabel, textLabel, idLabel, titleLabel, authorLabel, chaptersLabel, statusLabel, rankLabel, scoreLabel, 
	popularityLabel, typeLable, startDateLabel, endDateLabel;
	JLabel idValue, titleValue, authorValue, chaptersValue, statusValue, rankValue, scoreValue, 
	popularityValue, typeValue, startDateValue, endDateValue;
	JButton b1, b2; //b1-print, b2-cancel
	String comic_id, title, author, chapters, status, rank, popularity, score, type, startDate, endDate;
	
	
	PrintData(String cid){
//		System.out.println(cid);
		try {
			Conn c3 = new Conn();
			String query = "select * from comics where comic_id = '"+cid+"'";
			ResultSet rs = c3.s.executeQuery(query);
			
			if(rs.next()) 
				{
					comic_id = rs.getString("comic_id");
					title = rs.getString("title");
					author = rs.getString("author");
					chapters = rs.getString("chapters");
					status = rs.getString("status");
					rank = rs.getString("rank");
					popularity = rs.getString("popularity");
					score = rs.getString("score");
					type = rs.getString("type");
					startDate = rs.getString("start_date");
					endDate = rs.getString("end_date");
					
					
					frame = new JFrame("Comic Information");
					frame.setLayout(null);
					frame.setVisible(true);
					
					imageLabel = new JLabel();
					// set the image size (x, y, length, breadth)
					imageLabel.setBounds(0, 0, 1000, 945);
					imageLabel.setLayout(null);
					//using the resource background image
					ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("mangmics/ny/images/print.jpg"));
					imageLabel.setIcon(img);
					
					
					textLabel = new JLabel("Comic Details");
					textLabel.setBounds(300, 30, 400, 35);
					textLabel.setFont(new Font("serif",Font.BOLD, 30));
					textLabel.setForeground(Color.white);
					textLabel.setBackground(Color.black);
					textLabel.setOpaque(true);
					textLabel.setHorizontalAlignment(JLabel.CENTER);
					textLabel.setVerticalAlignment(JLabel.CENTER);
					
					imageLabel.add(textLabel);
					frame.add(imageLabel);
					
					idLabel = new JLabel("Comic ID : ");
					idLabel.setBounds(200, 70, 120, 25);
					idLabel.setFont(new Font("serif",Font.BOLD, 15));
					idLabel.setForeground(Color.BLACK);
					imageLabel.add(idLabel);
					
					idValue = new JLabel(comic_id);
					idValue.setBounds(320, 70, 300, 25);
					idValue.setFont(new Font("serif",Font.BOLD, 15));
					idValue.setForeground(Color.white);
					idValue.setBackground(Color.black);
					idValue.setOpaque(true);
					idValue.setHorizontalAlignment(JLabel.CENTER);
					idValue.setVerticalAlignment(JLabel.CENTER);
					imageLabel.add(idValue);
					
					
					
					titleLabel = new JLabel("Title : ");
					titleLabel.setBounds(200, 100, 120, 25);
					titleLabel.setFont(new Font("serif",Font.BOLD, 15));
					titleLabel.setForeground(Color.BLACK);
					imageLabel.add(titleLabel);
					
					titleValue = new JLabel(title);
					titleValue.setBounds(320, 100, 300, 25);
					titleValue.setFont(new Font("serif",Font.BOLD, 15));
					titleValue.setOpaque(true);
					titleValue.setForeground(Color.white);
					titleValue.setBackground(Color.black);
					titleValue.setOpaque(true);
					titleValue.setHorizontalAlignment(JLabel.CENTER);
					titleValue.setVerticalAlignment(JLabel.CENTER);
					titleValue.setHorizontalAlignment(JLabel.CENTER);
					titleValue.setVerticalAlignment(JLabel.CENTER);
					imageLabel.add(titleValue);
					
					
					authorLabel = new JLabel("Author : ");
					authorLabel.setBounds(200, 130, 120, 25);
					authorLabel.setFont(new Font("serif",Font.BOLD, 15));
					authorLabel.setForeground(Color.BLACK);
					imageLabel.add(authorLabel);
					
					authorValue = new JLabel(author);
					authorValue.setBounds(320, 130, 300, 25);
					authorValue.setFont(new Font("serif",Font.BOLD, 15));
					authorValue.setForeground(Color.white);
					authorValue.setBackground(Color.BLACK);
					authorValue.setOpaque(true);
					authorValue.setHorizontalAlignment(JLabel.CENTER);
					authorValue.setVerticalAlignment(JLabel.CENTER);
					authorValue.setOpaque(true);
					authorValue.setHorizontalAlignment(JLabel.CENTER);
					imageLabel.add(authorValue);
					
					
					chaptersLabel = new JLabel("Chapters : ");
					chaptersLabel.setBounds(200, 160, 120, 25);
					chaptersLabel.setFont(new Font("serif",Font.BOLD, 15));
					chaptersLabel.setForeground(Color.BLACK);
					imageLabel.add(chaptersLabel);
					
					chaptersValue = new JLabel(chapters);
					chaptersValue.setBounds(320, 160, 300, 25);
					chaptersValue.setFont(new Font("serif",Font.BOLD, 15));
					chaptersValue.setForeground(Color.white);
					chaptersValue.setBackground(Color.BLACK);
					chaptersValue.setOpaque(true);
					chaptersValue.setHorizontalAlignment(JLabel.CENTER);
					chaptersValue.setVerticalAlignment(JLabel.CENTER);
					imageLabel.add(chaptersValue);
					
					
					statusLabel = new JLabel("Status : ");
					statusLabel.setBounds(200, 190, 120, 25);
					statusLabel.setFont(new Font("serif",Font.BOLD, 15));
					statusLabel.setForeground(Color.BLACK);
					imageLabel.add(statusLabel);
					
					statusValue = new JLabel(status);
					statusValue.setBounds(320, 190, 300, 25);
					statusValue.setFont(new Font("serif",Font.BOLD, 15));
					statusValue.setForeground(Color.white);
					statusValue.setBackground(Color.BLACK);
					statusValue.setOpaque(true);
					statusValue.setHorizontalAlignment(JLabel.CENTER);
					statusValue.setVerticalAlignment(JLabel.CENTER);
					imageLabel.add(statusValue);
					
					
					rankLabel = new JLabel("Rank : ");
					rankLabel.setBounds(200, 220, 120, 25);
					rankLabel.setFont(new Font("serif",Font.BOLD, 15));
					rankLabel.setForeground(Color.BLACK);
					imageLabel.add(rankLabel);

					rankValue = new JLabel(rank);
					rankValue.setBounds(320, 220, 300, 25);
					rankValue.setFont(new Font("serif",Font.BOLD, 15));
					rankValue.setForeground(Color.white);
					rankValue.setBackground(Color.BLACK);
					rankValue.setOpaque(true);
					rankValue.setHorizontalAlignment(JLabel.CENTER);
					rankValue.setVerticalAlignment(JLabel.CENTER);

					imageLabel.add(rankValue);
					
					
					scoreLabel = new JLabel("Score : ");
					scoreLabel.setBounds(200, 250, 120, 25);
					scoreLabel.setFont(new Font("serif",Font.BOLD, 15));
					scoreLabel.setForeground(Color.BLACK);
					imageLabel.add(scoreLabel);
					
					scoreValue = new JLabel(score);
					scoreValue.setBounds(320, 250, 300, 25);
					scoreValue.setFont(new Font("serif",Font.BOLD, 15));
					scoreValue.setForeground(Color.white);
					scoreValue.setBackground(Color.BLACK);
					scoreValue.setOpaque(true);
					scoreValue.setHorizontalAlignment(JLabel.CENTER);
					scoreValue.setVerticalAlignment(JLabel.CENTER);
					imageLabel.add(scoreValue);
					
					
					popularityLabel = new JLabel("Popularity : ");
					popularityLabel.setBounds(200, 280, 120, 25);
					popularityLabel.setFont(new Font("serif",Font.BOLD, 15));
					popularityLabel.setForeground(Color.BLACK);
					imageLabel.add(popularityLabel);
					
					popularityValue = new JLabel(popularity);
					popularityValue.setBounds(320, 280, 300, 25);
					popularityValue.setFont(new Font("serif",Font.BOLD, 15));
					popularityValue.setForeground(Color.white);
					popularityValue.setBackground(Color.BLACK);
					popularityValue.setOpaque(true);
					popularityValue.setHorizontalAlignment(JLabel.CENTER);
					popularityValue.setVerticalAlignment(JLabel.CENTER);
					imageLabel.add(popularityValue);
					
					
					typeLable = new JLabel("Type : ");
					typeLable.setBounds(200, 310, 120, 25);
					typeLable.setFont(new Font("serif",Font.BOLD, 15));
					typeLable.setForeground(Color.BLACK);
					imageLabel.add(typeLable);
					
					typeValue = new JLabel(type);
					typeValue.setBounds(320, 310, 300, 25);
					typeValue.setFont(new Font("serif",Font.BOLD, 15));
					typeValue.setForeground(Color.white);
					typeValue.setBackground(Color.BLACK);
					typeValue.setOpaque(true);
					typeValue.setHorizontalAlignment(JLabel.CENTER);
					typeValue.setVerticalAlignment(JLabel.CENTER);
					imageLabel.add(typeValue);
					
					
					startDateLabel = new JLabel("Start Date : ");
					startDateLabel.setBounds(200, 340, 120, 25);
					startDateLabel.setFont(new Font("serif",Font.BOLD, 15));
					startDateLabel.setForeground(Color.BLACK);
					imageLabel.add(startDateLabel);

					startDateValue = new JLabel(startDate);
					startDateValue.setBounds(320, 340, 300, 25);
					startDateValue.setFont(new Font("serif",Font.BOLD, 15));
					startDateValue.setForeground(Color.white);
					startDateValue.setBackground(Color.BLACK);
					startDateValue.setOpaque(true);
					startDateValue.setHorizontalAlignment(JLabel.CENTER);
					startDateValue.setVerticalAlignment(JLabel.CENTER);
					imageLabel.add(startDateValue);
					
					
					endDateLabel = new JLabel("End Date : ");
					endDateLabel.setBounds(200, 370, 120, 25);
					endDateLabel.setFont(new Font("serif",Font.BOLD, 15));
					endDateLabel.setForeground(Color.BLACK);
					imageLabel.add(endDateLabel);
					
					endDateValue = new JLabel(endDate);
					endDateValue.setBounds(320, 370, 300, 25);
					endDateValue.setFont(new Font("serif",Font.BOLD, 15));
					endDateValue.setForeground(Color.white);
					endDateValue.setBackground(Color.BLACK);
					endDateValue.setOpaque(true);
					endDateValue.setHorizontalAlignment(JLabel.CENTER);
					endDateValue.setVerticalAlignment(JLabel.CENTER);
					imageLabel.add(endDateValue);
					
					b1 = new JButton("Print");
					b1.setBounds(300, 500, 100, 35);
					b1.setBackground(Color.black);
					b1.setForeground(Color.white);
					imageLabel.add(b1);
					
					b2 = new JButton("Back");
					b2.setBounds(480, 500, 100, 35);
					b2.setBackground(Color.black);
					b2.setForeground(Color.white);
					imageLabel.add(b2);
					
					b1.addActionListener(this);
					b2.addActionListener(this);
					
					frame.add(imageLabel);
					frame.setSize(990, 700);
					frame.setLocation(140, 70);
			}
			else {
				JOptionPane.showMessageDialog(null, "Resource not available!");
				new ViewComic();	
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b2)
		{
			System.out.println("Back Clicked");
			frame.setVisible(false);
			new ViewComic();
		} 
		if(ae.getSource() == b1)
		{
			System.out.println("Print Clicked");
			JOptionPane.showMessageDialog(null, "Printed Successfully!");
			frame.setVisible(false);
			new DetailComic();
			
		}
	}
}
