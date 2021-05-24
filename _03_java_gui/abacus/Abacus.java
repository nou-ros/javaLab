import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Abacus implements ActionListener{
	
	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10]; //0-9 number buttons
	JButton[] functionButtons = new JButton[9]; // for functional buttons
	
	// functional buttons
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, eqlButton, delButton, clrButton, negButton;
	
	JPanel panel;
	
	//Font
	Font myFont = new Font("Roboto", Font.ITALIC, 20);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	Abacus(){
		
		frame = new JFrame("Abacus");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setLayout(null);
		
		//all the operation of abacus will be before the visible option
		
		// Textfields for the gui
		textField = new JTextField();
		textField.setBounds(50, 25, 300, 45);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		// buttons for gui
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		eqlButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		negButton = new JButton("(-)");
		
		// assigning buttons to functional array.
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = eqlButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
		
		
		//iterate over functional buttons
		for(int i=0;i<9;i++){
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		//iterate over number buttons
		for(int i=0;i<10;i++){
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		// separte the delete and clear button from main number panel.
		negButton.setBounds(50,360,80,40);
		delButton.setBounds(140,360,100,40);
		clrButton.setBounds(250,360,100,40);
		
		panel = new JPanel();
		panel.setBounds(50, 100, 300, 220);
		panel.setLayout(new GridLayout(4,4,10,10)); //row, column, space
		//panel.setBackground(Color.GRAY);
		
		// setup panel body for numbers
		panel.add(numberButtons[1]);
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(mulButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(eqlButton);
		panel.add(divButton);
		
		
		frame.add(panel);
		frame.add(negButton);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textField);
		
		frame.setVisible(true);
		
	}
	
	public static void main(String [] args){
		Abacus calc = new Abacus();
	}
	
	//perfomed action with the number buttons
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//joing the numbers side by side in the display
		for(int i=0;i<10;i++)
		{
			if(e.getSource()==numberButtons[i])
			{
		   textField.setText(textField.getText().concat(String.valueOf(i)));
			}
		}
			
		//decimal operation
		if(e.getSource()==decButton)
		{
			textField.setText(textField.getText().concat("."));
			decButton.setEnabled(false);
		}
		
		
		//add operation
		if(e.getSource()==addButton)
		{
			num1 = Double.parseDouble(textField.getText());
			operator = '+';
			decButton.setEnabled(true);
			textField.setText("");	
			
		}
		
		//subtrac operation
		if(e.getSource()==subButton)
		{
			num1 = Double.parseDouble(textField.getText());
			operator = '-';
			decButton.setEnabled(true);
			textField.setText("");	
		}
		
		//multiply operation
		if(e.getSource()==mulButton)
		{
			num1 = Double.parseDouble(textField.getText());
			operator = '*';
			decButton.setEnabled(true);
			textField.setText("");	
		}
		//division operation
		if(e.getSource()==divButton)
		{
			num1 = Double.parseDouble(textField.getText());
			operator = '/';
			decButton.setEnabled(true);
			textField.setText("");	
		}
		
		//equal operation
		if(e.getSource()==eqlButton)
		{
			num2 = Double.parseDouble(textField.getText());
			
			switch(operator)
			{
				case '+': 
					result=num1+num2;
					break;
				case '-': 
					result=num1-num2;
					break;
				case '*': 
					result=num1*num2;
					break;
				case '/': 
					result=num1/num2;
					break;
			}
			textField.setText(String.valueOf(result));
			decButton.setEnabled(false);
			// to continue the calculation with the resulted value. 
			num1 = result;
		}
		
		//clear operation
		if(e.getSource()==clrButton)
		{
			textField.setText("");
			num1=0;
			decButton.setEnabled(true);
		}
		
		//delete operation
		if(e.getSource()==delButton)
		{
			String str = textField.getText();
			textField.setText("");
			for(int i=0;i<str.length()-1;i++)
			{
				textField.setText(textField.getText()+str.charAt(i));
			}
			decButton.setEnabled(true);
		}
		
		//negative button operation
		if(e.getSource()==negButton)
		{
			double temp = Double.parseDouble(textField.getText());
			temp*=-1;
			textField.setText(String.valueOf(temp));
		}
		
	}
	
}

