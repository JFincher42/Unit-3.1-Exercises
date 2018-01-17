
public class Mirror {

	public static final int SIZE = 6;
	
	public static void main(String[] args) {

		border();

		field();
//
//		fieldReverse();

		border();
	}
	
	
	
	
	
	
	
	
	

	public static void fieldReverse() {
		// Bottom of field
		for (int row=SIZE; row>=1; row--) {

			// Field
			System.out.print("|");
			for (int space=0; space<(SIZE-row)*2; space++) {
				System.out.print(" ");
			}
			System.out.print("<>");
			for (int angle=0; angle<(row-1)*4; angle++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int space=(SIZE-row)*2; space>0; space--) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}

	public static void field() {
		// Top of field
		for (int row=1; row<=SIZE; row++) {

			// Field
			System.out.print("|");
			for (int space=(SIZE-row)*2; space>0; space--) {
				System.out.print(" ");
			}
			System.out.print("<>");
			for (int angle=0; angle<(row-1)*4; angle++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int space=0; space<(SIZE-row)*2; space++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void border() {
		// Top and Bottom row
		System.out.print("#");
		for (int borderCount=0; borderCount<SIZE*4; borderCount++) {
			System.out.print("=");
		}
		System.out.println("#");
	}

}
