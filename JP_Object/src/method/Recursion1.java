package method;

public class Recursion1 {
	public static void main(String[] args) {
		System.out.println(sumofeven(1));
	}
	public static int sumofeven(int a) {
		int sum=0;
		while (a<=100) {
			if (a%2==0) {
				sum+=a;
			}
			a++;
		}
		return sum;
		
	}
}
