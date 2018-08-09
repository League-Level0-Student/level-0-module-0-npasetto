package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot turtle = new Robot();
	turtle.penDown();
	turtle.move(100);
	turtle.turn(135);
	turtle.move(141);
	turtle.turn(-135);
	turtle.move(100);
}
}
