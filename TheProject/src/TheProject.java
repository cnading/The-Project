import java.util.Scanner;

public class TheProject
	{
		static Scanner userInput = new Scanner(System.in);
		static User hero;
		static String newWordOne;
		static String newWordTwo;

		public static void main(String[] args)
			{
				greetUser();
				getGender();
				getInts();
			}

		private static void greetUser()
			{
				hero = new User("", "", 0, 0, 0);
				System.out.println("Hello friend, you got a name?");
				String name = userInput.nextLine();
				name = name.toLowerCase();
				for (int i = 0; i < name.length(); i++)
					{
						if (name.substring(i, i + 1).contains(" "))
							{
								newWordOne = name.substring(0, i);
								newWordTwo = name.substring(i + 1, name.length());

							}
					}
				hero.setName(newWordOne.substring(0, 1).toUpperCase()
						+ newWordOne.substring(1, newWordOne.length()).toLowerCase() + " "
						+ newWordTwo.substring(0, 1).toUpperCase()
						+ newWordTwo.substring(1, newWordTwo.length()).toLowerCase());
			}
		private static void getGender()
			{
				System.out.println("Well " + hero.getName() + " , welcome to my diet writing program. With the answers to the following questions"
						+ "I will write a cutom meal plan for the entire day!");
				System.out.println("So " + hero.getName() + " are you a male or a female?");
				String gender = userInput.nextLine();
				if (gender.equals("Male") || gender.equals("male"))
					{
						System.out.println("Gotcha, thanks Mr. " + hero.getName());
						hero.setGender(gender);
					}
				else if (gender.equals("Female") || gender.equals("female"))
					{
						System.out.println("Gotcha, thanks Ms. " + hero.getName());
					}
				else
					{
						System.out.println("Sorry I don't understand, try again! (Male or Female)");
						getGender();
					}
			}
		public static void getInts()
			{
				System.out.println("Okay, now that we have your name and gender...");
				System.out.println("How many inches tall are you?");
				int height= userInput.nextInt();
				hero.setHeight(height);
				System.out.println("");
			}
		}

	
