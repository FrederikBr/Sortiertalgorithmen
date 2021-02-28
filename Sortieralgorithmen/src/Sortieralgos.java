import java.awt.List;
import java.util.ArrayList;

/**
 * In dieser Klasse werden Listen auf verschiedene Weisen sortiert.
 * 
 * @author frederik.brinkmann
 *
 */
public class Sortieralgos {

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<>();
		System.out.println(listeBefüllen(liste));
//		System.out.print(Bubblesort(liste));
//		System.out.print(inserstionSort(liste));
		System.out.println(selectionSort(liste));

	}

	private static ArrayList<Integer> selectionSort(ArrayList<Integer> liste) {
		for (int i = 0; i < liste.size(); i++) {
			int index = i;
			for (int j = i + 1; j < liste.size(); j++) {
				if (liste.get(j) < liste.get(index)) {
					index = j;
				}
			}
			int smallernumber = liste.get(index);
			liste.set(index, liste.get(i));
			liste.set(i, smallernumber);
		}
		return liste;
	}

	/**
	 * Insertionsort umgesetzt mit einer ArrayList<> mit 10 Elementen
	 * 
	 * @param liste ArrayList mit 10 Elementen
	 * @return sortierte Liste
	 */
	private static ArrayList<Integer> inserstionSort(ArrayList<Integer> liste) {
		int temp;
		for (int i = 0; i < liste.size(); i++) {
			temp = liste.get(i);
			int j = i;
			while (j > 0 && liste.get(j - 1) > temp) {
				liste.set(j, liste.get(j - 1));
				j--;
			}
			liste.set(j, temp);
		}

		return liste;

	}

	/**
	 * Bubblesort umgsetzt mit einer durchmischten ArrayList<>;
	 * 
	 * @param liste gemischte Liste
	 * @return sortierte Liste
	 */
	private static ArrayList<Integer> Bubblesort(ArrayList<Integer> liste) {
		int temp;
		for (int i = 0; i < liste.size(); i++) {
			for (int j = 1; j < liste.size(); j++) {
				if (liste.get(j - 1) > liste.get(j)) {
					temp = liste.get(j - 1);
					liste.set(j - 1, liste.get(j));
					liste.set(j, temp);
				}
			}
		}
		return liste;
	}

	/**
	 * Methode um die Liste zu durchmischen und zu befüllen.
	 * 
	 * @param liste leere liste
	 * @return unsortiere liste mit 10 elementen.
	 */
	private static ArrayList<Integer> listeBefüllen(ArrayList<Integer> liste) {
		for (int i = 1; i <= 10; i++) {
			liste.add(i);
		}
		int randPos, temp;
		for (int i = 0; i < liste.size(); i++) {
			randPos = (int) (Math.random() * liste.size());
			temp = liste.get(i);
			liste.set(i, liste.get(randPos));
			liste.set(randPos, temp);
		}
		return liste;
	}

}
