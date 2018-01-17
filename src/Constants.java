public class Constants {
    public static final int MAX = 2047;

    public static void loop() {
        for (int i = 0; i < MAX; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("MAX is " + MAX);
        loop();
    }
}
