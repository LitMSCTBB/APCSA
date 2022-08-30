import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
  public static void main(String[] args) {
    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("My app");
    frame.setSize(500, 500);
    frame.setLayout(null);

    // create a Button and a Label
    JButton helloButton = new JButton("HELLO!");
    JLabel outputLabel = new JLabel();

    // place and size for components
    // setBounds(x position, y position, width, height)
    helloButton.setBounds(50, 250, 100, 50);
    outputLabel.setBounds(100,20,200,50);
    outputLabel.setFont(new Font("Arial", Font.ROMAN_BASELINE, 32));
    outputLabel.setForeground(Color.RED);
  
    // add components to JFrame f
    frame.add(helloButton);
    frame.add(outputLabel);
    
    frame.getContentPane().setBackground(Color.CYAN);
    
    // add event listener for button click
    helloButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("oh noeaafwafjoafjeaoiefjwqeifqfjwjpoi!");
      }
    });
    
    // make the frame visible
    frame.setVisible(true);
  }
}