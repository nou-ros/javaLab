package mangmics.ny;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class DetailComic implements ActionListener {
	JFrame frame;
	JLabel imageLabel, textLabel;
	JButton b1, b2, b3, b4, b5, b6;
	
	DetailComic()
	{
		frame = new JFrame("Comic Detail");
		frame.setLayout(null);
		
		//using the resource background image
		ImageIcon bi_1 = new ImageIcon(ClassLoader.getSystemResource("mangmics/ny/images/detail.png"));
		//adding the background image size actual size
		Image bi_2 = bi_1.getImage().getScaledInstance(860, 670, Image.SCALE_DEFAULT);
		//make the Image to imageicon so we can insert it into the label
		ImageIcon bi_3 = new ImageIcon(bi_2);
		imageLabel = new JLabel(bi_3);
		// set the image size (x, y, length, breadth)
		imageLabel.setBounds(0, -20, 830, 640);
		
		
		textLabel = new JLabel("Comic World");
		textLabel.setBounds(60, 200, 500, 160);
		textLabel.setFont(new Font("serif",Font.BOLD, 50));
		textLabel.setForeground(Color.black);
		
		//adding the text in imageLabel
		imageLabel.add(textLabel);
		
		
		//button
		b1 = new JButton("Add");
		b1.setBackground(Color.black);
		b1.setFont(new Font("serif",Font.ITALIC,  12));
		//font color
		b1.setForeground(Color.white);
		b1.setBounds(420, 120, 80, 40);
		b1.addActionListener(this);
		imageLabel.add(b1);
		
		//button
		b2 = new JButton("Detail");
		b2.setBackground(Color.black);
		b2.setFont(new Font("serif",Font.ITALIC,  12));
		//font color
		b2.setForeground(Color.white);
		b2.setBounds(530, 120, 80, 40);
		b2.addActionListener(this);
		imageLabel.add(b2);
		
		//button
		b3 = new JButton("Delete");
		b3.setBackground(Color.black);
		b3.setFont(new Font("serif",Font.ITALIC,  12));
		//font color
		b3.setForeground(Color.white);
		b3.setBounds(420, 180, 80, 40);
		b3.addActionListener(this);
		imageLabel.add(b3);
		
		//button
		b4 = new JButton("Update");
		b4.setBackground(Color.black);
		b4.setFont(new Font("serif",Font.ITALIC,  12));
		//font color
		b4.setForeground(Color.white);
		b4.setBounds(530, 180, 80, 40);
		b4.addActionListener(this);
		imageLabel.add(b4);
		
		b5 = new JButton("Logout");
		b5.setBackground(Color.black);
		b5.setFont(new Font("serif",Font.ITALIC,  12));
		//font color
		b5.setForeground(Color.white);
		b5.setBounds(680, 420, 80, 40);
		b5.addActionListener(this);
		imageLabel.add(b5);
		
		b6 = new JButton("Comic List");
		b6.setBackground(Color.black);
		b6.setFont(new Font("serif",Font.ITALIC,  12));
		//font color
		b6.setForeground(Color.white);
		b6.setBounds(140, 150, 120, 40);
		b6.addActionListener(this);
		imageLabel.add(b6);
		
		frame.add(imageLabel);
		
		
		frame.setVisible(true);
		frame.setSize(815, 645);
//		from where the frame will open
		frame.setLocation(180, 70);
		
	}
	
	// perform button click event 
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == b1) {
			//hide the ongoing frame
			System.out.println("Add Comic");
			frame.setVisible(false);
			
			new AddComic();
		}
		
		if(ae.getSource() == b2) {
			//hide the ongoing frame
			System.out.println("View Comic");
			frame.setVisible(false);
			
			new ViewComic();
		}
		
		if(ae.getSource() == b3) {
			//hide the ongoing frame
			System.out.println("Delete Comic");
			frame.setVisible(false);
			
			new DeleteComic();
		}
		
		if(ae.getSource() == b4) {
			//hide the ongoing frame
			System.out.println("Update Comic");
			frame.setVisible(false);
			
			new SearchComic();
		}
		
		if(ae.getSource() == b5) {
			//hide the ongoing frame
			System.out.println("Logout");
			frame.setVisible(false);
			
			new Login();
		}
		if(ae.getSource() == b6) {
			//hide the ongoing frame
			System.out.println("Comic List");
			new ComicList();
		}
	}
}
