
public class CatDog {

	public static void order(char[] array, int i, int j) {
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void printCharOrder(char[] array, int firstIndex, int lastIndex) {
		if(firstIndex == lastIndex) {
			System.out.println(new String(array));
		}
		else {
			for(int k = firstIndex; k < lastIndex; k++) {
				order(array, firstIndex, k);
				printCharOrder(array, firstIndex + 1, lastIndex);
				order(array, firstIndex, k);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] list = {'c', 'a', 't', 'd', 'o','g'};
		printCharOrder(list, 0, list.length);
	}
	
}
