package AlmaCal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class AlmaCalendar extends JFrame {

	
	private final int HEIGHT = 400;
	private final int WIDTH = 900;
	
	
	public AlmaCalendar()

    {

		/* Main window frame for the program 
		 */
		JFrame almaFrame = new JFrame();
		almaFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		almaFrame.setTitle("Alma (beta)");
		almaFrame.setSize(800, 400); // Maybe change to pack() later
		almaFrame.setLocationRelativeTo(null); // Window appears in center of screen
		
		// Array for the months
		String[] monthArray = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
		           "October", "November", "December"};
		
		
		//Arrays for the days in each month
		Integer[] januaryArray= new Integer[DaysInMonth.getDays(2014,1)-1];
		for(int i =0; i<januaryArray.length; i++){
			int day = 1;
			januaryArray[i]=day; day++;}
		
		
		Integer[] februaryArray = new Integer[27];
		for(int i =0; i<februaryArray.length; i++){
			int day = 1;
			februaryArray[i]=day; day++;}
		
		Integer[] marchArray = new Integer[30];
		for(int i =0; i<marchArray.length; i++){
			int day = 1;
			marchArray[i]=day; day++;}
		
		// Array for years
		Integer[] yearArray = new Integer[9];
		for(int i =0; i<yearArray.length; i++){
			int year = 2014;
			yearArray[i]=year; year++;}
		
		
		/* the panel for inputing 
		 * new event in calendare
		 */
		final JPanel inputPanel = new JPanel();
		JTextField eventText = new JTextField(20);
		
		
		
		JLabel eventLabel = new JLabel("Event name:");
		JComboBox year = new JComboBox(yearArray);
		JComboBox month = new JComboBox(monthArray);
		JComboBox day = new JComboBox(januaryArray);
		
		inputPanel.add(eventLabel);
		inputPanel.add(eventText);
		inputPanel.add(year);
		inputPanel.add(month);
		inputPanel.add(day);
		
		almaFrame.add(inputPanel, BorderLayout.NORTH);
		
		almaFrame.setVisible(true);

	
			
		
		
		}
		
	class CustomActionListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	    	  
	      }
	}
}
	       
    
	
	
	


