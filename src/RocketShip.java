
public class RocketShip {
	public static final int SIZE = 3;

	public static void main(String[] args) {
		noseCone();
		topLine();
		topBody();
		bottomBody();
		topLine();
		bottomBody();
		topBody();
		topLine();
		noseCone();
	}

	public static void noseCone() {
		for (int row=0; row<2*SIZE-1; row++) {
			for (int space=0; space<(2*SIZE-1)-row; space++) {
				System.out.print(" ");
			}
			for (int slash=0; slash<row+1; slash++) {
				System.out.print("/");
			}
			System.out.print("**");
			for (int slash=0; slash<row+1; slash++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}

	public static void topBody() {
		for (int row=0; row<SIZE; row++) {
			System.out.print("|");
			for (int dots=0; dots<SIZE-1-row; dots++) {
				System.out.print(".");
			}
			for(int hat=0; hat<row+1; hat++) {
				System.out.print("/\\");
			}
			for (int dots=0; dots<2*(SIZE-1-row); dots++) {
				System.out.print(".");
			}
			for(int hat=0; hat<row+1; hat++) {
				System.out.print("/\\");
			}
			for (int dots=0; dots<SIZE-1-row; dots++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}

	public static void bottomBody() {
		for(int row=0; row<SIZE; row++) {
			System.out.print("|");
			for (int dots=0; dots<row; dots++) {
				System.out.print(".");
			}
			for (int hat=0; hat<SIZE-row; hat++) {
				System.out.print("\\/");
			}
			for(int dots=0; dots<(row*2); dots++) {
				System.out.print(".");
			}
			for (int hat=0; hat<SIZE-row; hat++) {
				System.out.print("\\/");
			}
			for (int dots=0; dots<row; dots++) {
				System.out.print(".");
			}
			System.out.println("|");
		}
	}
	
	public static void topLine() {
		System.out.print("+");
		for (int count=0; count<SIZE*2; count++) {
			System.out.print("=*");
		}
		System.out.println("+");
	}
}
