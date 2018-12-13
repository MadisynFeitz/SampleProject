package UserModeling;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage image;

    public ImagePanel() 
    {
       try 
       {                
          image = ImageIO.read(new File("Captain.jfif"));
       } 
       catch (IOException ex)
       {
            // handle exception...
       }
    }
    
    void changeImage(Card c)
    {
    	// reload the image from the Card object passed (c).
    	//image = ImageIO.read(new File(c.getImage());
    	
    	// re paint the component.
    	
    	
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);          
    }
}
