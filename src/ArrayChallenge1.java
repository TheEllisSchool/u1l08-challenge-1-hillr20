//October 16, 2017
public class ArrayChallenge1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomArray = {1, 4, 8, 3, 6, 9, 2, 6};
		int i;
		System.out.println("The array is: ");
		for (i = 0; i < randomArray.length; i++) {
			System.out.println("Array: " + randomArray[i]);
		}
		int length = randomArray.length;
		
		int hold;
		for (i = 0; i < randomArray.length; i++) {
			hold = randomArray [length - (i + 1)];
			randomArray[i] = randomArray[length - (i + 1)];
			
		}
		System.out.println("The new array is: ");
		for (i = 0; i < randomArray.length; i++) {
			System.out.println(randomArray[i]);
		}
	}

}
