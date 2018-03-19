import java.util.Scanner;

public class TestFibonacci {

	public static int fibonacci(int n){
		return ((n > 1)?(fibonacci(n-1)+fibonacci(n-2)):(n==1)?1:0);
	}
	public static void main(String[] args){
			System.out.println("Choisissez le rang N à afficher");
			Scanner questionUser = new Scanner(System.in);
			System.out.println(fibonacci(questionUser.nextInt()));

	}

}
