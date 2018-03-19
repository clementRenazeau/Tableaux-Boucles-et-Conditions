
public class TestArray2 {
	public static void main(String[] args) {
		int[] array={1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		int i, k;
		int j=1;
		float temp = 0f;
		int temp2 = 0;
		System.out.println("Exercice n°" + j);
		//Quelle est la moyenne des éléments du tableau ?
		for(i = 0 ; i<array.length ; ++i){
			temp += array[i]; 
		}
		temp/=(array.length-1);
		System.out.println("La moyenne des elements du tableau est " + temp);
		++j;
		System.out.println("Exercice n°" + j);
		//Quel est l’index dans le tableau de l’entier 15 ?
		for(i = 0 ; i<array.length ; ++i){
			if(array[i] == 15){
				System.out.println("Index de 15 = " + i);
			}
		}
		++j;
		System.out.println("Exercice n°" + j);
		//Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau
		for(i = 0 ; i<array.length ; ++i){
			for(k = array.length-1; k > i; --k){
				if(array[i] == array[k]){
					++temp2;
				}
			}
		}
		System.out.println("Le nombre d’entiers en doublon dans le tableau est egal a " + temp2);
	}
}
