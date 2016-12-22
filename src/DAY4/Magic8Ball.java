package DAY4;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
int number=new Random().nextInt(4);
System.out.println(number);
JOptionPane.showInputDialog("what is your question");
if (number==0){
JOptionPane.showMessageDialog(null, "yes");
}
if (number==1)
{ JOptionPane.showMessageDialog(null, "no");

}
if (number==2){
 JOptionPane.showMessageDialog(null, "maybe you should ask Google");
}if(number==3)

{ JOptionPane.showMessageDialog(null, "I do not know");
}

}

	public Magic8Ball() {
		// TODO Auto-generated constructor stub
		// Copyright Wintriss Technical Schools 2013

		// 6. If the random number is 1

		// -- tell the user "No"

		// 7. If the random number is 2

		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3

		// -- write your own answer

	}

}
