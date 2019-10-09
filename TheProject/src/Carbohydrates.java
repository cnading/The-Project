import java.util.ArrayList;

public class Carbohydrates
	{
		static ArrayList<Food> carbohydrates = new ArrayList<Food>();

		public static void loadCarbohydrates()
			{
				//per 100 grams or per unit
				carbohydrates.add(new Food("Fruit", "Strawberries", 49, true));
				carbohydrates.add(new Food("Fruit", "Blueberries", 85, true));
				carbohydrates.add(new Food("Fruit", "Rasberries", 65, true));
				carbohydrates.add(new Food("Fruit", "Blackberry", 62, true));
				carbohydrates.add(new Food("Fruit", "Apple", 95, true));
				carbohydrates.add(new Food("Fruit", "Orange", 62, true));
				carbohydrates.add(new Food("Fruit", "Grapes", 62, true));
				carbohydrates.add(new Food("Fruit", "Pineapple", 83, true));
				carbohydrates.add(new Food("Fruit", "Peach", 150, true));
				carbohydrates.add(new Food("Fruit", "Banana", 105, true));
				carbohydrates.add(new Food("Fruit", "Mango", 201, true));

				carbohydrates.add(new Food("Vegetables", "Spinach", 23, true));
				carbohydrates.add(new Food("Vegetables", "Carrots", 41, true));
				carbohydrates.add(new Food("Vegetables", "Broccoli", 34, true));
				carbohydrates.add(new Food("Vegetables", "Garlic", 150, true));
				carbohydrates.add(new Food("Vegetables", "Brussel Sprouts", 43, true));
				carbohydrates.add(new Food("Vegetables", "Kale", 49, true));
				carbohydrates.add(new Food("Vegetables", "Sweet Potato", 86, true));
				
				carbohydrates.add(new Food("Mains", "Noodles", 158, true)); // per 100g
				carbohydrates.add(new Food("Mains", "White Bread", 100, true)); // 2 slices
				carbohydrates.add(new Food("Mains", "Wheat Bread", 140, true));
				carbohydrates.add(new Food("Mains", "Corn Tortilla", 58, true)); // one unit
				carbohydrates.add(new Food("Mains", "Flour Tortilla", 90, true));
				carbohydrates.add(new Food("Mains", "Potato", 80, true));
				carbohydrates.add(new Food("Mains", "Bagel", 90, true));
				carbohydrates.add(new Food("Mains", "Waffle", 90, true));
				carbohydrates.add(new Food("Mains", "Pancake", 90, true));


			}
	}