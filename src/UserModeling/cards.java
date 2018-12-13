package UserModeling;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class cards 
{

	private JFrame frame;
	
	List<Card> flashCards = new ArrayList<Card>();

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
					cards window = new cards();
					window.frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public cards() throws IOException 
	{
		// Create card instances, add to list here.
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Guns");
		rdbtnNewRadioButton.setFont(new Font("Verdana", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(6, 44, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("His Suit");
		rdbtnNewRadioButton_1.setFont(new Font("Verdana", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(6, 103, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("His Shield");
		rdbtnNewRadioButton_2.setFont(new Font("Verdana", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBounds(6, 163, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton_2);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0); // Put next card motion here
			}
		});
		
		btnSubmit.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSubmit.setBounds(299, 198, 89, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("Captain America");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 13));
		lblNewLabel.setBounds(288, 103, 115, 23);
		frame.getContentPane().add(lblNewLabel);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 220, 261);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new ImagePanel();
		panel_1.setBounds(227, 0, 207, 261);
		frame.getContentPane().add(panel_1);
		
	}

	
}
