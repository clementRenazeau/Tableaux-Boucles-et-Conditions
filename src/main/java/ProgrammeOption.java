import java.util.Arrays;
import java.util.Scanner;

public class ProgrammeOption {
	private static int temp = 0;
	private static int[] array = new int[0];
	
	public static void main(String[] args){
		while(true){//boucle infinie qui peut être arrêter si on tape 3 au moment du choix
		System.out.println("option 1 : ajoutez un nombre au tableau\noption 2 : affiche le tableau\noption 3 : pour quitter");
		Scanner questionUser = new Scanner(System.in);
		int a = questionUser.nextInt();
		if(a==1){
			if(temp==array.length){
				array = Arrays.copyOf(array, (array.length+1));
			}
			System.out.println("Quel est le nombre a entrer dans le tableau?");
			Scanner questionUser2 = new Scanner(System.in);
			array[temp] = questionUser2.nextInt();	
			++temp;
		}
		if(a==2){
			System.out.println(Arrays.toString(array));
		}
		if(a==3){
			break;
		}
		}
	}
}
