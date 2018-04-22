
/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. Tell them which year they
 * were born. If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	int year = 2018;
	for (int i = 0; i < 1000000; i++) {
		String SAge = JOptionPane.showInputDialog("How old are you.");
	int IAge = Integer.parseInt(SAge);
	if (IAge > 30) {
		JOptionPane.showMessageDialog(null, "You are too old to play this game.");
	}
	else {
		int IBorn = year - IAge;
		JOptionPane.showMessageDialog(null, "You were born in " + IBorn + ".");
	}
	}
	
}
}
