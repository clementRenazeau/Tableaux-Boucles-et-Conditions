
public class TestArray1 {
	public static void main(String[] args) {
		int[] array={1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int i;
		int j=1;
		int temp;
		System.out.println("Exercice n�" + j);
		//Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle
		for(i = 0 ; i<array.length ; ++i){
			System.out.println(array[i]);
		}
		++j;
		System.out.println("Exercice n�" + j);
		//Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau
		for(i = array.length-1 ; i>=0 ; --i){
			System.out.println(array[i]);
		}	
		++j;
		System.out.println("Exercice n�" + j);
		//Faire une boucle et un test de mani�re � n�afficher que les entiers sup�rieurs � 3
		for(i = 0 ; i<array.length ; ++i){
			if(array[i]>3){
				System.out.println(array[i]);
			}
		}	
		++j;
		System.out.println("Exercice n�" + j);
		//Faire une boucle qui affiche uniquement les entiers pairs
		for(i = 0 ; i<array.length ; ++i){
			if(array[i]%2==0){
				System.out.println(array[i]);
			}
		}
		//Afficher le plus grand �l�ment du tableau
		++j;
		System.out.println("Exercice n�" + j);
		i=0;
		temp = array[i];
		while(i<array.length){
			if(array[i]>temp){
				temp=array[i];		
			}
			++i;
		}
		System.out.println("Le plus grand �l�ment du tableau : " + temp);
		++j;
		System.out.println("Exercice n�" + j);
		//Afficher le plus petit �l�ment du tableau
		i=0;
		temp = array[i];
		while(i<array.length){
			if(array[i]<temp){
				temp=array[i];		
			}
			++i;
		}	
		System.out.println("Le plus petit �l�ment du tableau : " + temp);
	}
}
