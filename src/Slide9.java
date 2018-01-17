
public class Slide9 {

	public static final int NUM=30;
	public static final int SPACES=2;
	
	public static void main(String[] args) {
		
		for (int i = 0; i < NUM; i++) {

			for (int j = 0; j < NUM; j++) {
				System.out.print(i * j);
				for (int k = 0; k < SPACES; k++) {
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}

	}

}
