
public class Rectangle {

	public static final int WIDTH = 4;
	
	public static void main(String[] args) {
		for (int rows=0; rows<2*WIDTH; rows++) {
			for (int cols=0; cols<WIDTH; cols++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
