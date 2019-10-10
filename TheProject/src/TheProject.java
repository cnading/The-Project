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
		static int minutes;
		static int goAgain;
		static int livingCalories;
		static int calories= 0;
		static int totalCalories;
		static int caloriesBurned;
		static String goal;
		static String excercise;
		static String adventureType;

		static JFrame frame = new JFrame();


		public static void main(String[] args)
			{
				hero = new User("", "", 0, 0, 0, 0);
				getInfo();
				calorieCalculations();
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
				goal = (String) JOptionPane.showInputDialog(frame, "What are your weight goals?", "Goal",
						JOptionPane.QUESTION_MESSAGE, null, type, type[0]);
				
				 String [] type1 =
							{ "Not at all", "Little", "Moderatley", "Hard", "Extreme" };
						final JFrame frame1 = new JFrame();
						excercise = (String) JOptionPane.showInputDialog(frame, "What are your plans for excercise today?", "Excercise",
								JOptionPane.QUESTION_MESSAGE, null, type1, type1[0]);
						
						String minutesS = "";
						minutesS = JOptionPane.showInputDialog("And how many total minutes do you plan to workout today?");
						minutes = Integer.parseInt(minutesS);
						
						
				Object[] options =
					{ "Male", "Female" };
				gender = JOptionPane.showOptionDialog(frame1, "What is your sex?", "Your Sex",
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
				goAgain = JOptionPane.showOptionDialog(frame1,
						name + ", please confirm the following information is correct!\n" + "You weigh " + hero.getWeight()
								+ " killograms\n" + "Are " + hero.getHeight() + " centimeters tall" + " and are " + hero.getAge() + " years young",
						"Last Chance", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices,
						choices[0]);
				if (goAgain == 0)
					{
						JOptionPane.showMessageDialog(frame1, hero.getName() + ", calculating your calories...");
						
					} else
					{
						getInfo();
					}

			}

		public static void calorieCalculations()
			{  //2845
				//metabolic equivalent
				switch (excercise) {
				case "Not at all": 
					
					
				case "Little":
					caloriesBurned = (int) (3*3.5 * hero.getWeight());
					caloriesBurned= caloriesBurned / minutes;
					totalCalories= totalCalories + caloriesBurned;
					break;
				case "Moderatley":
					caloriesBurned = (int) (5*3.5 * hero.getWeight());
					caloriesBurned= caloriesBurned / minutes;
					totalCalories= totalCalories + caloriesBurned;
					
					break;
				case "Hard":
					caloriesBurned = (int) (7*3.5 * hero.getWeight());
					caloriesBurned= caloriesBurned / minutes;
					totalCalories= totalCalories + caloriesBurned;
					
					break;
				case "Extreme":
					caloriesBurned = (int) (10*3.5 * hero.getWeight());
					caloriesBurned= caloriesBurned / minutes;
					totalCalories= totalCalories + caloriesBurned;
					break;
				default:
					
					getInfo();
				}
				
					if(goal.equals("Gain Muscle and Fat"))
						{
							totalCalories=totalCalories + 1000;
						}
					else if (goal.equals("Gain Muscle"))
						{
							totalCalories=totalCalories + 500;

						}
					else if (goal.equals("Lose Fat"))
						{
							totalCalories=totalCalories - 500;

						}
					else if (goal.equals("Lose Fat and Muscle"))
						{
							totalCalories=totalCalories - 1000;

						}
					else
						{
							getInfo();
						}
					if (gender==0){
						livingCalories= (int) ((hero.getWeight() * 10) + ((6.25* hero.getHeight()) - (5* hero.getAge())) +5);
						totalCalories = totalCalories + livingCalories;
					}
						
					else if (gender==1){
						livingCalories= (int) ((hero.getWeight() * 10) + ((6.25* hero.getHeight()) - (5* hero.getAge())) -161);
						totalCalories = totalCalories + livingCalories;
							}
					else
						{
							getInfo();
						}
				JOptionPane.showMessageDialog(frame,
						"Well " + hero.getName() + ", You need to eat " + totalCalories + " calories to maintain your weight");
				}
				
				
			

		public static void displayMealPlan()
			{
				if (totalCalories > 2500){
					
				}
				
			}
	}
