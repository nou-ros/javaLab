package mangmics.ny;

import java.awt.*;

import javax.swing.*;

class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Table");
		
		String [] column = {"name", "age", "email"};
		
		String[][] data = {
				{"Bill", "12", "dev@dev.com"}, 
				{"Mill", "11", "cat@cat.com"}, 
				{"Rill", "10", "rev@rev.com"}
		};
		
		JTable table = new JTable(data, column);
		
		frame.add(new JScrollPane(table));
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
