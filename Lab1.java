import javax.swing.*; 

import java.awt.*; 

import java.awt.event.*;
import java.lang.ProcessHandle.Info; 

public class Lab1 extends JFrame implements ActionListener  
{ private static final Color Red = null;
private static final Color Purple = null;

//Reserve space for global objects 
	public JLabel inJL, outJL;  
	public JTextField inTF, outTF; 
	public JButton butAL;  
	

	//-------------------------METHODS-----------------------------------------------
	
	public static void main(String[] args) {
		//Construct the frame  
		new Lab1();
	} 
	

	//constructor for Lab 1  
	public Lab1() {				//construct objects 
		inJL = new JLabel("Input Data"); 
		inTF = new JTextField(10); 
		butAL = new JButton("ENTER"); 
		outJL = new JLabel("Output Data");  
		outTF = new JTextField(10); 
		butAL.addActionListener(this);  
		
		//setting font of labels
		Font myFont = new Font ("Serif", Font.BOLD, 14);  
		inJL.setFont(myFont); 
		outJL.setFont(myFont);
		
		//setting color of labels and butAL
		inJL.setForeground(Color.magenta); 
		outJL.setForeground(Color.magenta);   
		
		butAL.setForeground(Color.red);
		
		//add Objects to Frame 
				add(inJL);  
				add(inTF);   
				add(butAL);  
				add(outJL);  
				add(outTF); 
		
		
		//DisplayFrame  
		setTitle("Lab 1");  
		setLayout(new FlowLayout());  
		setBounds(10,10,550,80);  
		setVisible(true);  
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	}
		
	//ActionPerformed method to read the selection of the button 
	@Override
	public void actionPerformed(ActionEvent event) { 

			//read the text from the input TF and output it to the outTF 
					outTF.setText(inTF.getText()); 
			//print the in console iin the inputTF 
				System.out.print(inTF.getText()); 
		
	}

}//end
