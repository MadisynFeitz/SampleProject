package UserModeling;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Button;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Point;

public class MarvelFlashcards 
{

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					MarvelFlashcards window = new MarvelFlashcards();
					window.frame.setVisible(true);
					
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MarvelFlashcards() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("radiobutton2");
		rdbtnNewRadioButton_1.setBounds(1, 100, 109, 34);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("radiobutton3");
		rdbtnNewRadioButton.setBounds(1, 137, 109, 34);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("radiobutton1");
		rdbtnNewRadioButton_2.setBounds(1, 63, 109, 34);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		Button button = new Button("Submit Answer");
		button.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				//move to next card here
			}
		});
		button.setActionCommand("Submit Answer");
		button.setBounds(314, 216, 81, 22);
		frame.getContentPane().add(button);
		
		JPanel imgpanel = new JPanel();
		imgpanel.addInputMethodListener(new InputMethodListener() 
		{
			private BufferedImage image;

		    public void ImagePanel() 
		    {
		       try {                
		          image = ImageIO.read(new File("C:\\\\Users\\\\smadisynfeitz\\\\new-workspace\\\\SampleProject\\\\Avengers.jpg"));
		       } catch (IOException ex) 
		       {
		            // handle exception...
		       }
		    }

			@Override
			public void caretPositionChanged(InputMethodEvent event) 
			{
				// TODO Auto-generated method stub
				
			}

			@Override
			public void inputMethodTextChanged(InputMethodEvent event) 
			{
				// TODO Auto-generated method stub
				
			}
		});
	
	textField = new JTextField();
	textField.setBounds(237, 100, 140, 34);
	frame.getContentPane().add(textField);
	textField.setHorizontalAlignment(SwingConstants.CENTER);
	textField.setColumns(10);
	{
		imgpanel.setBounds(188, 0, 246, 261);
		frame.getContentPane().add(imgpanel);
	}
	
	class imgPanel extends JPanel
	{

	    private BufferedImage image;

	    public imgPanel() 
	    {
	       try 
	       {                
	          image = ImageIO.read(new File("C:\\Users\\smadisynfeitz\\new-workspace\\SampleProject\\Avengers.jpg"));
	       } 
	       catch (IOException e) 
	       {
	    	   
	       }
	       
	    }
	}
	}
}
	