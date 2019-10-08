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

				carbohydrates.add(new Food("Vegetables", "Mango", 201, true));
				carbohydrates.add(new Food("Vegetables", "Mango", 201, true));
				carbohydrates.add(new Food("Vegetables", "Mango", 201, true));

				carbohydrates.add(new Food("Mains", "Mango", 201, true));

			}
	}