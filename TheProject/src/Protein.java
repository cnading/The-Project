import java.util.ArrayList;

public class Protein
	{
		static ArrayList<Food> protein = new ArrayList<Food>();

		public static void loadProtein()
			{
				//One fruit without refuse, or one cup
				//numbers from USDA
				//FRUIT
				protein.add(new Food ("Fruit" , "Strawberries" , 49, true));
				protein.add(new Food ("Fruit" , "Blueberries" , 85, true));
				protein.add(new Food ("Fruit" , "Rasberries" , 65, true));
				protein.add(new Food ("Fruit" , "Blackberry" , 62, true));
				protein.add(new Food ("Fruit" , "Apple" , 95, true));
				protein.add(new Food ("Fruit" , "Orange" , 62, true));
				protein.add(new Food ("Fruit" , "Grapes" , 62, true));
				protein.add(new Food ("Fruit" , "Pineapple" , 83, true));
				protein.add(new Food ("Fruit" , "Peach" , 150, true));
				protein.add(new Food ("Fruit" , "Banana" , 105, true));
				protein.add(new Food ("Fruit" , "Mango" , 201, true));
				
				// 1 oz
				protein.add(new Food ("Snack", "Dark Chocolate", 155, true));
				protein.add(new Food ("Snack", "Cliff Bar", 260, true));
				protein.add(new Food ("Snack", "Chia Seeds", 138, true));
				protein.add(new Food ("Snack", "Chobani Yogurt", 120, true));
				
				
				protein.add(new Food ("Drink", "Apple Juice", 180, true));
				protein.add(new Food ("Drink", "Chocolate Milk", 210, true));
				protein.add(new Food ("Drink", "Orange Juice", 111, true ));

			}
	}
