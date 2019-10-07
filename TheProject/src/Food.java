
public class Food
	{
		private String type;
		private String name;
		private int calories;
		private boolean desire;

		public Food(String t, String n,  int c, boolean d)
			{
				
				type= t;
				name = n;
				calories = c;
				desire = d;
			}
		

		public int getCalories()
			{
				return calories;
			}

		public void setCalories(int calories)
			{
				this.calories = calories;
			}

		public boolean isDesire()
			{
				return desire;
			}

		public void setDesire(boolean desire)
			{
				this.desire = desire;
			}


		public String getName()
			{
					return name;
			}


		public void setName(String name)
			{
					this.name = name;
			}


		public String getType()
			{
					return type;
			}


		public void setType(String type)
			{
					this.type = type;
			}

	}