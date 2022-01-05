package mangmics.ny;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ViewComic implements ActionListener {
	
	JFrame frame;
	JLabel textLabel, imageLabel;
	JTextField comic_id;
	JButton b1, b2; //b1 = search, b2=cancel;
	
	ViewComic(){
		frame = new JFrame("Search Comic");
		frame.setLayout(null);
		
		imageLabel = new JLabel();
		// set the image size (x, y, length, breadth)
		imageLabel.setBounds(0, 0, 510, 260);
		imageLabel.setLayout(null);
		//using the resource background image
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("mangmics/ny/images/search.png"));
		imageLabel.setIcon(img);
		
		
		textLabel = new JLabel("Search By ID");
		textLabel.setVisible(true);
		textLabel.setBounds(40, 65, 220, 25);
		textLabel.setFont(new Font("serif",Font.BOLD, 25));
		textLabel.setForeground(Color.black);
		imageLabel.add(textLabel);
		frame.add(imageLabel);
		
		comic_id = new JTextField();
		comic_id.setBounds(250, 60, 150, 35);
		imageLabel.add(comic_id);
		
		b1 = new JButton("Search");
		b1.setBounds(200, 150, 100, 30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		imageLabel.add(b1);
		
		b2 = new JButton("Back");
		b2.setBounds(350, 150, 100, 30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		imageLabel.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		

		frame.setVisible(true);
		frame.setSize(500, 250);
//		from where the frame will open
		frame.setLocation(140, 70);
	}

	public void actionPerformed(ActionEvent ae) {
			if(ae.getSource() == b2)
			{
				System.out.println("Cancel Clicked");
				frame.setVisible(false);
				new DetailComic();
			} 
			if(ae.getSource() == b1)
			{
				System.out.println("Search Clicked"+ comic_id.getText());
				frame.setVisible(false);
				new PrintData(comic_id.getText());
			}
		}
}
