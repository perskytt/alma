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
		almaFrame.setSize(WIDTH, HEIGHT); // Maybe change to pack() later
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
		
		
		final JPanel topPanel = new JPanel();
		
		/* the panel for inputing 
		 * new event in calendare
		 */
		final JPanel inputPanel = new JPanel();
		
		/*Panel for retrieving 
		 * events from database
		 */
		final JPanel getPanel = new JPanel();
		
		//Textfields
		JTextField eventText = new JTextField(20);
		JTextField locText = new JTextField(13);
		
		
		
		
		ImageIcon logoImage = new ImageIcon(".\\res\\AlmaIcon.jpg");
		JLabel logoLlb = new JLabel(logoImage);
		
		//Text labels
		JLabel eventLabel = new JLabel("Event name:");
		JLabel locLabel = new JLabel("(Optional)Location:");
		JLabel getEventLbl = new JLabel("Get event from this day:");
		
		//Buttons
		JButton getEventBt = new JButton("Get Event!");
		
		//Dropdown lists for adding new event
		JComboBox setYear = new JComboBox(yearArray);
		JComboBox Setmonth = new JComboBox(monthArray);
		JComboBox setDay = new JComboBox(januaryArray);
		JComboBox setTime = new JComboBox();
		
		//Dropdown list for getting events
		JComboBox getYear = new JComboBox(yearArray);
		JComboBox getmonth = new JComboBox(monthArray);
		JComboBox getDay = new JComboBox(januaryArray);
		
		//Adding actionlistener to month box
		 Setmonth.addActionListener(new CustomActionListener());
		
		//Adding the GUI objects to inputPanel
	    topPanel.add(logoLlb);
		inputPanel.add(eventLabel);
		inputPanel.add(eventText);
		inputPanel.add(locLabel);
		inputPanel.add(locText);
		inputPanel.add(setYear);
		inputPanel.add(Setmonth);
		inputPanel.add(setDay);
		inputPanel.add(setTime);
		
		//Adding the GUI objects to the getPanel
		getPanel.add(getEventLbl);
		getPanel.add(getYear);
		getPanel.add(getmonth);
		getPanel.add(getDay);
		getPanel.add(getEventBt);
		
		
		//Adding panels to the main frame of the window
		almaFrame.add(topPanel, BorderLayout.NORTH);
		almaFrame.add(inputPanel, BorderLayout.CENTER);
		almaFrame.add(getPanel, BorderLayout.SOUTH);
		almaFrame.setVisible(true);

	
			
		
		
		}
		
	class CustomActionListener implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	    	  
			
	      }
	}
}
	       
    
	
	
	


