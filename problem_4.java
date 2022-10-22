
public class problem_4 {
	public static void step(int []num) {
		
		for (int i =1;i<10;i++)
		{
			int count = 0;
			for(int j=0; j<num.length; j++)
			{
				if(num[j]%i==0)
				{
					count++;
				}
			}
			System.out.println(i+":"+count);
		}
		}
		public static void main(String[] args) {
			int[] array = {1,2,8,9,12,46,76,82,15,20,30};
			step(array);
		}
}
