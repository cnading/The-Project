import java.util.ArrayList;

public class Protein
	{
		static ArrayList<Food> protein = new ArrayList<Food>();

		public static void loadProtein()
			{
				//Per 100 grams
				//numbers from USDA
				//MEATS
				protein.add(new Food ("Meat" , "Grilled Steak" , 176, true));
				protein.add(new Food ("Meat" , "Chicken breast" , 165, true));
				protein.add(new Food ("Meat" , "Cooked Coho Salmon" , 178, true));
				protein.add(new Food ("Meat" , "Tuna" , 130, true));
				protein.add(new Food ("Meat" , "Lean Ground Beef" , 230, true));
				protein.add(new Food ("Meat" , "Bacon" , 541, true));
				protein.add(new Food ("Meat" , "Ham" , 110, true));
				protein.add(new Food ("Meat" , "Turkey" , 150, true));
				protein.add(new Food ("Meat" , "Pork Tenderloin" , 150, true));
				
				
				protein.add(new Food ("Super" , "Tofu" , 100, false));
				protein.add(new Food ("Super", "Eggs", 143, true));
				protein.add(new Food ("Super", "Black Beans", 132, true));
				protein.add(new Food ("Super", "Pinto Beans", 245, true));
				protein.add(new Food ("Super", "Peanut Butter", 600, true));


				protein.add(new Food ("Shake", "Shake 1", 180, true));
				protein.add(new Food ("Shake", "Chocolate Milk", 210, true));
				protein.add(new Food ("Shake", "Orange Juice", 111, true ));

			}
	}
