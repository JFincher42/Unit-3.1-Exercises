
public class Slide18 {
	public static final int SIZE = 10;

	public static void main(String[] args) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				System.out.print(i * j);
				for (int k = 0; k < 5; k++) {
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}
	}

}
