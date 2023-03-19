package clock;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;
import javax.swing.*;
public class MyFrame extends JFrame{
	Calendar calender;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel dayLabel;
	JLabel timeLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle ("..-CLOCK-..");
		this.setLayout(new FlowLayout());
		this.setSize(250,200);
		this.setResizable(false);
		
		timeFormat=new SimpleDateFormat("kk:mm:ss a");
		dayFormat=new SimpleDateFormat("EEEEEEEEEE");
		dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		timeLabel=new JLabel();
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,30));
		timeLabel.setForeground(new Color(MAXIMIZED_BOTH));
		timeLabel.setBackground(Color.orange);
		timeLabel.setOpaque(true);
		
		dateLabel=new JLabel();
		//JLabel lab=new JLabel(date, JLabel.CENTER);
		dateLabel.setFont(new Font("Verdana",Font.BOLD,30));
		dateLabel.setForeground(new Color(MAXIMIZED_HORIZ));
		dateLabel.setBackground(Color.white);
		dateLabel.setOpaque(true);
		
		dayLabel=new JLabel();
		dayLabel.setFont(new Font("Verdana",Font.PLAIN,20));
		dayLabel.setForeground(new Color(MAXIMIZED_BOTH));
		dayLabel.setBackground(Color.green);
		dayLabel.setOpaque(true);
		
		
	    time = timeFormat.format(Calendar.getInstance().getTime());
	    timeLabel.setText(time);
	  
		this.add(timeLabel);this.add(dateLabel);
		this.add(dayLabel);
		
		this.setVisible(true);
		setTime();
		
	}
	public void setTime() {
		while(true) {
			
			  time = timeFormat.format(Calendar.getInstance().getTime());
			  timeLabel.setText(time);
			  
			  date = dateFormat.format(Calendar.getInstance().getTime());
			  dateLabel.setText(date);
			  
			  day = dayFormat.format(Calendar.getInstance().getTime());
			  dayLabel.setText(day);
			  
			  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
