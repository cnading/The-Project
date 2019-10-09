import java.util.ArrayList;

public class Fats
	{
		static ArrayList<Food> fats = new ArrayList<Food>();

		public static void loadSugars()
			{
				//One fruit without refuse, or one cup
				//numbers from USDA
				//FRUIT
				fats.add(new Food ("Super" , "Avocado" , 49, true));
				fats.add(new Food ("Super" , "Cheese" , 85, true));
				fats.add(new Food ("Super" , "Egg" , 65, true));
				fats.add(new Food ("Super" , "Walnuts" , 62, true));
				fats.add(new Food ("Super" , "Olives" , 95, true));
				fats.add(new Food ("Super" , "Olive Oil" , 62, true));
				fats.add(new Food ("Super" , "Edamame" , 62, true));
				
				// 1 oz
				fats.add(new Food ("Snack", "Dark Chocolate", 155, true));
				fats.add(new Food ("Snack", "Cliff Bar", 260, true));
				fats.add(new Food ("Snack", "Chia Seeds", 138, true));
				fats.add(new Food ("Snack", "Chobani Yogurt", 120, true));
				
				fats.add(new Food ("Nuts", "Almonds", 162, true));
				fats.add(new Food ("Nuts", "Peanuts", 161, true));
				fats.add(new Food ("Nuts", "Pistachios", 159, true));
				fats.add(new Food ("Nuts", "Cashews", 157, true));
				fats.add(new Food ("Nuts" , "Sunflower Seeds" , 166, false));
				
				fats.add(new Food ("Sauce" , "Ranch" , 145, false));
				fats.add(new Food ("Sauce" , "Ketchup" , 30, false));
				fats.add(new Food ("Sauce" , "Mayonnaise" , 210, false));

			
				fats.add(new Food ("Drink", "Apple Juice", 180, true));
				fats.add(new Food ("Drink", "Chocolate Milk", 210, true));
				fats.add(new Food ("Drink", "Orange Juice", 111, true ));

			}
	}
