package com.demo.javaSwing;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*This program is compiled and run in Java 1.8
 * It is a Java Swing program which has a text field and accepts input in it from the user,
 * and has a button below the text field.
 * When user clicks the button it displays the value in the text field in a dialog box.*/
public class ButtonExample implements ActionListener{

	JTextField tf;
	JButton bt;
    static JDialog d;  
    JFrame f= new JFrame("Example");
    ButtonExample(){
		 
		d = new JDialog(f , "Dialog Example", true);  
        d.setLayout( new FlowLayout() );
		
		 
        tf=new JTextField();  
        tf.setBounds(50,50,150,20);
        
        bt = new JButton("OK");
        bt.setBounds(50,100,95,30); 
	    bt.addActionListener(this);
	    
	    f.setSize(400,400); 
	    f.setLayout(null);  
	    f.setVisible(true); 
	    f.add(bt);
	    f.add(tf);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		String getText = tf.getText();
		
		ButtonExample.d.setVisible(false);  
	    d.add(new JLabel(getText));	
	    //d.add(bt);
	    d.setSize(300,300);    
        d.setVisible(true);
        
        
	  
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ButtonExample();
		
		
		
	}

	

}
