/**
 * 
 */
package my.java.gemini.healathome.reporter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.border.Border;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class ReporterWindow {

	public void invokeMyWindow() {
		// Create a new JFrame
		JFrame frame = new JFrame("Heal at Home");
		JWindow window = new JWindow(frame);


		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		frame.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH; // Fill cell space
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.insets = new Insets(5, 5, 5, 5); // Spacing between panels

        // Create a common border
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        		
		// Remove title bar and borders
		// frame.setUndecorated(true);

		// Get the default screen device
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

		// frame.setLayout(new FlowLayout());


        
        // Panel 1 (Top-Left)
        JPanel p1 = new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder(border, "Patient Details"));
        gbc.gridx = 0; gbc.gridy = 0;        
        frame.add(p1, gbc);

        // Panel 2 (Top-Right)
        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder(border, "Panel 2"));
        gbc.gridx = 1; gbc.gridy = 0;
        frame.add(p2, gbc);
        

        // Panel 3 (Bottom-Left)
        JPanel p3 = new JPanel();
        p3.setBorder(BorderFactory.createTitledBorder(border, "Panel 3"));
        gbc.gridx = 0; gbc.gridy = 1;
        frame.add(p3, gbc);

        // Panel 4 (Bottom-Right)
        JPanel p4 = new JPanel();
        p4.setBorder(BorderFactory.createTitledBorder(border, "Panel 4"));
        gbc.gridx = 1; gbc.gridy = 1;
        frame.add(p4, gbc);

        
        
//        p1.setLayout(new GridBagLayout());
//        GridBagConstraints gbcForPanel1 = new GridBagConstraints();        
//        gbcForPanel1.gridx = 0;
//        gbcForPanel1.gridy = 0;
//        gbcForPanel1.anchor = GridBagConstraints.NORTHWEST; // This aligns it top-left        
//        gbcForPanel1.weightx = 1.0; // Pushes content to the left
//        gbcForPanel1.weighty = 1.0; // Pushes content to the top        
//        JLabel patientNameLabel = new JLabel("Patient Name");       
//        p1.add(patientNameLabel,gbcForPanel1);
//        
//        
//        gbcForPanel1.gridx = GridBagConstraints.RELATIVE;
//        gbcForPanel1.gridy = GridBagConstraints.RELATIVE;
//        gbcForPanel1.gridwidth = GridBagConstraints.REMAINDER;
//        gbcForPanel1.weightx = 1.0; // Pushes content to the left
//        gbcForPanel1.weighty = 1.0; // Pushes content to the top 
//        JTextField patientName = new JTextField(50);
//        p1.add(patientName,gbcForPanel1);
        
		//p1.setLayout(new FlowLayout.getAlignment(FlowLayout.LEFT));
		JLabel patientNameLabel = new JLabel("Patient Name");
		p1.add(patientNameLabel);

		JTextField patientName = new JTextField(50);
		p1.add(patientName);        


              
		/*NORTHWEST
		 * // Button 1: Position (0, 0) gbc.gridx = 0; gbc.gridy = 0; gbc.weightx = 1.0;
		 * gbc.weighty = 1.0;
		 * 
		 * gbc.anchor = GridBagConstraints.FIRST_LINE_START; frame.add(new
		 * JButton("Button 1"), gbc);
		 * 
		 * // Button 2: Position (1, 0) gbc.gridx = 1; gbc.gridy = 0; frame.add(new
		 * JButton("Button 2"), gbc);
		 * 
		 * // Button 3: Position (0, 1), spans 2 columns wide gbc.gridx = 0; gbc.gridy =
		 * 1; gbc.gridwidth = 2; // Spans across column 0 and 1 gbc.fill =
		 * GridBagConstraints.HORIZONTAL; // Stretch to fill width frame.add(new
		 * JButton("Long-Named Button 3"), gbc);
		 * 
		 * // Button 4: Position (0, 2), increased internal height gbc.gridx = 0;
		 * gbc.gridy = 2; gbc.gridwidth = 1; // Reset width gbc.ipady = 40; // Add 40
		 * pixels of internal padding vertically frame.add(new JButton("Tall Button 4"),
		 * gbc);
		 * 
		 * // Doctor's Label JLabel labelFordoctorName = new JLabel("Doctor Name");
		 * 
		 * // Doctor's Name JTextField doctorName = new JTextField(20);
		 */

		// Set the frame to full screen
		gd.setFullScreenWindow(frame);

		// Set frame properties
		// frame.setSize(1024,
		// 768); // Set the size of the frame

		/*
		 * frame.add(labelFordoctorName); frame.add(doctorName);
		 */

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
