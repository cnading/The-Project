
public class User
	{
		private String name;
		private String goal;
		private int gender;
		private int weight;
		private int height;
		private int age;

		public User(String name, String goal, int gender, int weight, int height, int age)
			{
		this.name=name;
		this.setGoal(goal);
		this.gender=gender;
		this.weight=weight;
		this.height=height;
		this.age=age;
			}
			public String getName()
				{
					return name;
				}
			public void setName(String name)
				{
					this.name = name;
				}
			public int getGender()
				{
					return gender;
				}
			public void setGender(int gender)
				{
					this.gender = gender;
				}
			public int getWeight()
				{
					return weight;
				}
			public void setWeight(int weight)
				{
					this.weight = weight;
				}
			public int getHeight()
				{
					return height;
				}
			public void setHeight(int height)
				{
					this.height = height;
				}
			public int getAge()
				{
					return age;
				}
			public void setAge(int age)
				{
					this.age = age;
				}
			public String getGoal()
				{
						return goal;
				}
			public void setGoal(String goal)
				{
						this.goal = goal;
				}
			
			
		
	}
	
