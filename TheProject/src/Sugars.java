import java.util.ArrayList;

public class Sugars
	{
		static ArrayList<Food> sugars = new ArrayList<Food>();

		public static void loadSugars()
			{
				//One fruit without refuse, or one cup
				//numbers from USDA
				//FRUIT
				sugars.add(new Food ("Fruit" , "Strawberries" , 49, true));
				sugars.add(new Food ("Fruit" , "Blueberries" , 85, true));
				sugars.add(new Food ("Fruit" , "Rasberries" , 65, true));
				sugars.add(new Food ("Fruit" , "Blackberry" , 62, true));
				sugars.add(new Food ("Fruit" , "Apple" , 95, true));
				sugars.add(new Food ("Fruit" , "Orange" , 62, true));
				sugars.add(new Food ("Fruit" , "Grapes" , 62, true));
				sugars.add(new Food ("Fruit" , "Pineapple" , 83, true));
				sugars.add(new Food ("Fruit" , "Peach" , 150, true));
				sugars.add(new Food ("Fruit" , "Banana" , 105, true));
				sugars.add(new Food ("Fruit" , "Mango" , 201, true));
				
				// 1 oz
				sugars.add(new Food ("Snack", "Dark Chocolate", 155, true));
				sugars.add(new Food ("Snack", "Cliff Bar", 260, true));
				sugars.add(new Food ("Snack", "Chia Seeds", 138, true));
				sugars.add(new Food ("Snack", "Chobani Yogurt", 120, true));
				
				
				sugars.add(new Food ("Drink", "Apple Juice", 180, true));
				sugars.add(new Food ("Drink", "Chocolate Milk", 210, true));
				sugars.add(new Food ("Drink", "Orange Juice", 111, true ));

			}
	}
