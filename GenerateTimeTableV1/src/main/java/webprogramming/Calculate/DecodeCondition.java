package webprogramming.Calculate;

public class DecodeCondition {
	private Integer[] condition= {0,0,0,0,0};
	
	public void decode(int [][]data)
	{
		for(int i=0;i<5;i++)
		{
			for(int number : data[i])
			{
				condition[i] = (condition[i] << 1) | number;
			}
		}
	}

	public Integer[] getCondition() {
		return condition;
	}
}
