
public class Food
	{

		private String type;
		private int calories;
		private boolean desire;
		
		public Food (String t, int c, boolean d )
		{
			type= t;
			calories= c;
			desire= d;
		}

		public String getType()
			{
				return type;
			}

		public void setType(String type)
			{
				this.type = type;
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



	}