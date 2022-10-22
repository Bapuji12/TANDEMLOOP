package tandemloop;

public class Problem_2 {

	public static void series(int i) {
		for (int j=0;j<i;j++)
		{
			int value = j*2+1;
			System.out.print(value+",");
		}
	}
	public static void main(String[] args) {
		series(7);
	}
}
