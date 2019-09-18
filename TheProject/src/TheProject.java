import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class TheProject extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Scanner userInput = new Scanner(System.in);
	static User hero;
	static String name;
	static int weight;
	static int age;
	static int height;
	static int results = 0;
	static int gender;


	static JFrame frame = new JFrame();
	

	public static void main(String[] args) {
		hero = new User("", 0, 0, 0, 0);
		JPanel();
	}

	public static void JPanel() {

				name = JOptionPane.showInputDialog("Welcome, what is your name?");
				hero.setName(name);
				JOptionPane.showMessageDialog(frame,
						"Well " + hero.getName()
								+ " , welcome to my diet writing program. With the answers to the\n following questions"
								+ " I will write a cutom meal plan for the entire day!");
				Object[] options =
					{ "Male", "Female" };
				gender = JOptionPane.showOptionDialog(frame, "What is your sex?", "Your Sex", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null, options, options[0]);
				String weightS="";
				String heightS="";
				String ageS="";
				weightS = JOptionPane.showInputDialog("How much do you weigh, in pounds?");
				weight = Integer.parseInt(weightS);
				heightS = JOptionPane.showInputDialog("And your height?");
				height= Integer.parseInt(heightS);
				ageS = JOptionPane.showInputDialog("And lastly your age?");
				age= Integer.parseInt(ageS);
				hero.setAge(age);
				hero.setHeight(height);
				hero.setAge(weight);
				Object[] goAgain =
							{ "Yes", "No" };
						gender = JOptionPane.showOptionDialog(frame, name + ", please confirm the following information is correct!\n"
								+ "You weigh " + weight + " pounds\n"
								+ "Are " + height + "inches tall" +
								"and " + age + " years young",
								"Your Sex", JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.QUESTION_MESSAGE,
								null, options, options[0]);


	}
}
