import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showMessageDialog(null, color+" is also my favorite color.");
	Robot turtle = new Robot();
	turtle.penDown();
	turtle.setSpeed(500);
	for (int i = 0; i < 3; i++) {
		turtle.move(100);
		turtle.turn(120);
	}
}
}
