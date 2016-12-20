package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

	Robot dge= new Robot();
		dge.penDown();
		int sides=0;
		while(sides<10){
			dge.move(100);
			dge.turn(90);
			dge.move(100);
			dge.turn(-90);
			dge.move(100);}
sides=sides+1;

		
	

	}}
