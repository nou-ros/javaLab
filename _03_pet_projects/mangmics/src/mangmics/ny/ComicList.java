package mangmics.ny;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.sql.*;


class ComicList{
	JFrame frame;
	JLabel textLabel;
	JTextField name;
	JPasswordField password;
	JButton b1, b2;
	JTable table;
	
	ComicList(){

		DefaultTableModel table = new DefaultTableModel();

		
		table.addColumn("Comic ID");
		table.addColumn("Title");
		table.addColumn("Author");
		table.addColumn("Chapters");
		table.addColumn("Status");
		
      
		int i =0;
		try {
			Conn c8 = new Conn();
			String query = "select * from comics";
			ResultSet rs = c8.s.executeQuery(query);
			
			i = 1;
			while(rs.next())
			{
				table.addRow(new Object[] {
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5)
				});
			}
			
			JTable t = new JTable();
			t.setModel(table);
			DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
			centerRenderer.setHorizontalAlignment(JLabel.CENTER);
			
			for(int x=0;x<5;x++){
		         t.getColumnModel().getColumn(x).setCellRenderer( centerRenderer );
		     }
			
			JFrame frame = new JFrame();
//		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    JScrollPane scrollPane = new JScrollPane(t);
		    frame.add(scrollPane, BorderLayout.CENTER);
		    frame.setSize(900, 700);
		    frame.setVisible(true);
		  
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}