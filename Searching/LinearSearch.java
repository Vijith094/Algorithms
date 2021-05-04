public class LinearSearch 
{
	public static int[] input = new int[] {23,55, 21, 19, 66, 44};
	
	public static void main (String[] args)
	{
		int to_find = 155;
		for (int a: input)
		{
			if (a == to_find)
			{
				System.out.println("Integer found");
				return;
			}
		}
		System.out.println("Integer Not found");
	}
}
