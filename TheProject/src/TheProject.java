import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class TheProject extends JFrame
	{
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
		static int goAgain;
		static int calories= 0;
		static int totalCalories;
		static String goal;
		static String adventureType;

		static JFrame frame = new JFrame();

		public static void main(String[] args)
			{
				hero = new User("", "", 0, 0, 0, 0);
				getInfo();
				calculations();
				displayMealPlan();
			}

		public static void getInfo()
			{

				name = JOptionPane.showInputDialog("Welcome, what is your name?");
				hero.setName(name);
				JOptionPane.showMessageDialog(frame,
						"Well " + hero.getName()
								+ " , welcome to my diet writing program. With the answers to the\n following questions"
								+ " I will write a cutom meal plan for the entire day!");
				final String[] type =
					{ "Gain Muscle and Fat", "Gain Muscle", "Keep Fit", "Lose Fat", "Lose Fat and Muscle" };
				final JFrame frame = new JFrame();
				String goal = (String) JOptionPane.showInputDialog(frame, "What are your weight goals?", "Goal",
						JOptionPane.QUESTION_MESSAGE, null, type, type[0]);

				Object[] options =
					{ "Male", "Female" };
				gender = JOptionPane.showOptionDialog(frame, "What is your sex?", "Your Sex",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
				String weightS = "";
				String heightS = "";
				String ageS = "";
				weightS = JOptionPane.showInputDialog("How much do you weigh, in kg?");
				weight = Integer.parseInt(weightS);
				heightS = JOptionPane.showInputDialog("And your height, in cm?");
				height = Integer.parseInt(heightS);
				ageS = JOptionPane.showInputDialog("And lastly your age?");
				age = Integer.parseInt(ageS);
				hero.setAge(age);
				hero.setHeight(height);
				hero.setWeight(weight);
				Object[] choices =
					{ "Yes", "No" };
				goAgain = JOptionPane.showOptionDialog(frame,
						name + ", please confirm the following information is correct!\n" + "You weigh " + hero.getWeight()
								+ " pounds\n" + "Are " + hero.getHeight() + " inches tall" + " and are " + hero.getAge() + " years young",
						"Last Chance", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices,
						choices[0]);
				if (goAgain == 0)
					{
						JOptionPane.showMessageDialog(frame, hero.getName() + ", generating your custom meal plan...");
						calculations ();
					} else
					{
						getInfo();
					}

			}

		public static void calculations()
			{ 
				if (gender==0){
				totalCalories= (int) (hero.getWeight() * 10 + 6.25* hero.getHeight() - 5* hero.getAge()+5);
				
				
				JOptionPane.showMessageDialog(frame,
						"Well " + hero.getName() + ", You need to eat " + totalCalories + " calories to maintain your weight");
				}
				else if (gender==1){
					totalCalories= (int) (hero.getWeight() * 10 + 6.25* hero.getHeight() - 5* hero.getAge()-161);
					JOptionPane.showMessageDialog(frame,
							"Well " + hero.getName() + ", You need to eat " + totalCalories + " calories to to maintain your weight");
					}
				
			}

		public static void displayMealPlan()
			{

			}
	}
