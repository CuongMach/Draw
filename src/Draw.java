public class Draw {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("*");
            }
            System.out.println("*");
        }
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < k; l++) {
                System.out.printf("* ");
            }
            System.out.println("\n");
        }
        for (int m = 5; m >= 1; m--) {
            for (int n = 1; n <= m; n++) {
                System.out.printf("* ");
            }
            System.out.println("\n");
        }
    }
}
