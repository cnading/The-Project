import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
	static Scanner userInput = new Scanner(System.in);
	static User hero;
	static String name;
	static JLabel weightLabel = new JLabel(hero.getName() + ", enter your weight:");
	static JLabel heightLabel = new JLabel(hero.getName() + ", enter your height:");
	static JLabel ageLabel = new JLabel(hero.getName() + ", enter your height:");

	static JTextField weight = new JTextField(3);
	static JTextField height = new JTextField(3);
	static JTextField age = new JTextField(3);

	static int results = 0;
	static int gender;

	static JFrame frame = new JFrame();

	public static void main(String[] args) {
		hero = new User("", 0, 0, 0, 0);
		// greetUser();
		// getGender();
		// getInts();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TheProject().setVisible(true);
			}
		});

	}

	public static void getInts() {
		System.out.println("Okay, now that we have your name and gender...");
		System.out.println("How many inches tall are you?");
		int height = userInput.nextInt();
		hero.setHeight(height);
		System.out.println("");
	}

	public static void TheProject() {

//				name = JOptionPane.showInputDialog("Welcome, what is your name?");
//				hero.setName(name);
//				JOptionPane.showMessageDialog(frame,
//						"Well " + hero.getName()
//								+ " , welcome to my diet writing program. With the answers to the\n following questions"
//								+ " I will write a cutom meal plan for the entire day!");
//				Object[] options =
//					{ "Male", "Female" };
//				gender = JOptionPane.showOptionDialog(frame, "What is your sex?", "Your Sex",
		weight.setText("0");
		height.setText("0");
		age.setText("0");
		JPanel newPanel = new JPanel(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10, 10, 10);

		constraints.gridx = 0;
		constraints.gridy = 0;

		newPanel.add(weightLabel, constraints);
		constraints.gridx = 1;
		newPanel.add(weight, constraints);

		constraints.gridx = 0;
		constraints.gridy = 1;

		newPanel.add(heightLabel, constraints);
		constraints.gridx = 1;
		newPanel.add(height, constraints);

		constraints.gridx = 0;
		constraints.gridy = 2;

		newPanel.add(ageLabel, constraints);
		constraints.gridx = 1;
		newPanel.add(age, constraints);

		newPanel.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Getting Your Digits!"));

		add(newPanel);

		pack();

		setLocationRelativeTo(null);

	}
}
