/**
 * 
 */
package my.java.gemini.healathome.reporter;

import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JWindow;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class ReporterWindow {
	
	public void invokeMyWindow()
	{
        // Create a new JFrame			
        JFrame frame = new JFrame("Heal at Home");
        JWindow window = new JWindow(frame);
                
        
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        // Remove title bar and borders
        // frame.setUndecorated(true); 
        
        // Get the default screen device
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                
        
        //frame.setLayout(new FlowLayout());
        
        // Button 1: Position (0, 0)
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("Button 1"), gbc);

        // Button 2: Position (1, 0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JButton("Button 2"), gbc);

        // Button 3: Position (0, 1), spans 2 columns wide
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // Spans across column 0 and 1
        gbc.fill = GridBagConstraints.HORIZONTAL; // Stretch to fill width
        frame.add(new JButton("Long-Named Button 3"), gbc);

        // Button 4: Position (0, 2), increased internal height
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // Reset width
        gbc.ipady = 40;     // Add 40 pixels of internal padding vertically
        frame.add(new JButton("Tall Button 4"), gbc);

        //Doctor's Label
        JLabel labelFordoctorName = new JLabel("Doctor Name");

        //Doctor's Name
        JTextField doctorName = new JTextField(20);                

        // Set frame properties
        frame.setSize(300,
                      200); // Set the size of the frame

     // Set the frame to full screen
        gd.setFullScreenWindow(frame);
        
        frame.add(labelFordoctorName);
        frame.add(doctorName);

        // Make the frame visible
        frame.setVisible(true);     
	}

//	/**
//	 * @throws HeadlessException
//	 */
//	public ReporterWindow() throws HeadlessException {
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @param gc
//	 */
//	public ReporterWindow(GraphicsConfiguration gc) {
//		super(gc);
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @param title
//	 * @throws HeadlessException
//	 */
//	public ReporterWindow(String title) throws HeadlessException {
//		super(title);
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @param title
//	 * @param gc
//	 */
//	public ReporterWindow(String title, GraphicsConfiguration gc) {
//		super(title, gc);
//		// TODO Auto-generated constructor stub
//	}
	

}
