import java.awt.Component;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class TheProject
	{
		static Scanner userInput = new Scanner(System.in);
		static User hero;
		static String newWordOne;
		static String newWordTwo;
		static String name;
		static int gender;
		static int weight;
		static int height;
		static int age;
		static JFrame frame = new JFrame();

		public static void main(String[] args)
			{
				hero = new User("", 0, 0, 0, 0);
				// greetUser();
				// getGender();
				// getInts();
				jPanel();

			}

		// private static void getGender()
		// {
		// for (int i = 0; i < name.length(); i++)
		// {
		// if (name.substring(i, i + 1).contains(" "))
		// {
		// newWordOne = name.substring(0, i);
		// newWordTwo = name.substring(i + 1, name.length());
		//
		// } else
		// {
		// hero.setName(name.substring(0, 1).toUpperCase()
		// + name.substring(1, name.length()).toLowerCase());
		// }
		// }
		// hero.setName(newWordOne.substring(0, 1).toUpperCase()
		// + newWordOne.substring(1, newWordOne.length()).toLowerCase() + " "
		// + newWordTwo.substring(0, 1).toUpperCase()
		// + newWordTwo.substring(1, newWordTwo.length()).toLowerCase());
		// System.out.println("Well " + hero.getName()
		// + " , welcome to my diet writing program. With the answers to the
		// following questions"
		// + "I will write a cutom meal plan for the entire day!");
		// System.out.println("So " + hero.getName() + " are you a male or a
		// female?");
		// String gender = userInput.nextLine();
		// if (gender.equals("Male") || gender.equals("male"))
		// {
		// System.out.println("Gotcha, thanks Mr. " + hero.getName());
		// hero.setGender(gender);
		// } else if (gender.equals("Female") || gender.equals("female"))
		// {
		// System.out.println("Gotcha, thanks Ms. " + hero.getName());
		// } else
		// {
		// System.out.println("Sorry I don't understand, try again! (Male or
		// Female)");
		// getGender();
		// }
		// }

		public static void getInts()
			{
				System.out.println("Okay, now that we have your name and gender...");
				System.out.println("How many inches tall are you?");
				int height = userInput.nextInt();
				hero.setHeight(height);
				System.out.println("");
			}

		public static void jPanel()
			{

//				name = JOptionPane.showInputDialog("Welcome, what is your name?");
//				hero.setName(name);
//				JOptionPane.showMessageDialog(frame,
//						"Well " + hero.getName()
//								+ " , welcome to my diet writing program. With the answers to the\n following questions"
//								+ " I will write a cutom meal plan for the entire day!");
//				Object[] options =
//					{ "Male", "Female" };
//				gender = JOptionPane.showOptionDialog(frame, "What is your sex?", "Your Sex",
//						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
//				hero.setGender(gender);
				JFrame f = new JFrame("Spinner Example");
				SpinnerModel value = new SpinnerNumberModel(5, // initial value
						0, // minimum value
						10, // maximum value
						1); // step
				JSpinner spinner = new JSpinner(value);
				spinner.setBounds(100, 100, 50, 30);
				f.add(spinner);
				f.setSize(300, 300);
				f.setLayout(null);
				f.setVisible(true);

			}
	}
