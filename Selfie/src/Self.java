import java.awt.*;
import javax.swing.*;

public class Self extends JPanel
{
   public static void main(String[] args)
   {
      JFrame myFrame = new JFrame();
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setContentPane(new Self());

      myFrame.pack();
      myFrame.setVisible(true);
   }

   public Dimension getPreferredSize() 
   {
      return new Dimension(300, 300);
   } 

   protected void paintComponent(Graphics g)
   {
      super.paintComponent(g);

      // Cast the Graphics object to a Graphics2D object
      Graphics2D myGraphics = (Graphics2D) g; 

      // draw the head as a filled oval
      myGraphics.setPaint(Color.orange);
      myGraphics.fillOval(100,50,50,50);

      // draw the body as a filled rectangle
      myGraphics.setPaint(Color.red);
      myGraphics.fillRect(100,100,50,50);

      // draw the arms as filled rectangles
      myGraphics.setPaint(Color.orange);
      myGraphics.fillRect(25,100,75,10);
      myGraphics.fillRect(150,100,75,10);

      // draw the legs as filled rectangles
      myGraphics.fillRect(100,150,10,75);
      myGraphics.fillRect(140,150,10,75);
      
      myGraphics.setPaint(Color.green);
      myGraphics.fillRect(100,35,50,25);
      myGraphics.drawLine(150, 60, 175, 60);
      
      
   }
}