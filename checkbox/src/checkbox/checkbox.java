package checkbox;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class checkbox extends JFrame{
	private JTextField tf;
	private JCheckBox boldbox;
	private JCheckBox italicsbox;
	
	public checkbox()
	{
		super("CHECK BOX EXAMPLE");
		
		setLayout(new FlowLayout());
		
		tf = new JTextField("type here",10);
		tf.setFont(new Font("Serif",Font.PLAIN,20));
		add(tf);
		
		boldbox = new JCheckBox("bold");
		italicsbox = new JCheckBox("italics");
		add(boldbox);
		add(italicsbox);
		
		
		thehandler handler = new thehandler();
		boldbox.addItemListener(handler);
		italicsbox.addItemListener(handler);
		
		
		
		
	}
	private class thehandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{
			Font f = null;
			
			if(boldbox.isSelected() && italicsbox.isSelected())
			{
				f = new Font("Serif",Font.BOLD+Font.ITALIC,14);
				
			}
			
			else if(boldbox.isSelected())
				
			{
					f = new Font("Serif",Font.BOLD,14);
					
			}
			else if(italicsbox.isSelected())
				
			{
					f = new Font("Serif",Font.ITALIC,14);
					
			}
			else
			{
				f = new Font("Serif",Font.PLAIN,14);
			
			}
			 tf.setFont(f);;
			 
		}
		
	}

}
