package DAY4;

//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bannanaquiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String answer=JOptionPane.showInputDialog(null, "Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
		if(answer.equals("no"))
		{
			JOptionPane.showMessageDialog(null, "you are crazy.");
		}
		else if (answer.equals("yes"))
			{
				JOptionPane.showMessageDialog(null, "what is your favorite hobby");
		
			
			JOptionPane.showConfirmDialog(null, "your hobby is much better with bananas!");
			}
	
	}
	}
