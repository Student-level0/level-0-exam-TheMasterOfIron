import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot robo = new Robot();
		// 3. ask the user what color they would like the Robot to draw

		// 4. use an if/else statement to set the pen color that the user requested
		// (minimum of 2 colors)

		// 2. set the pen width to 10

		// 1. make the Robot draw a shape
		robo.hide();
		robo.setPenWidth(10);
		robo.penDown();
		robo.setSpeed(5);
		for (int i = 0; i < 1000000; i++) {
			String color = JOptionPane.showInputDialog("What color do you want your square to be?");
			if (color.equalsIgnoreCase("Red")) {
				robo.setPenColor(255, 0, 0);
			} else if (color.equalsIgnoreCase("Blue")) {
				robo.setPenColor(0, 0, 255);
			} else if (color.equalsIgnoreCase("Green")) {
				robo.setPenColor(0, 255, 0);
			} else if (color.equalsIgnoreCase("White")) {
				robo.setPenColor(255, 255, 255);
			} else if (color.equalsIgnoreCase("Black")) {
				robo.setPenColor(0, 0, 0);
			} else {
				JOptionPane.showMessageDialog(null, "Sorry i dont have that color.");
			}
			robo.move(100);
			robo.turn(90);
			robo.move(100);
			robo.turn(90);
			robo.move(100);
			robo.turn(90);
			robo.move(100);
			robo.turn(90);
		}

	}

}
