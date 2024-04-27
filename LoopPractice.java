public class LoopPractice {
    public static void main(String[] args) {
        // hourglass
        // ******
        // ***
        // *
        // ***
        // ******
        for (int k = 3; k >= 1; k--) {
            for (int i = 6; i >= 1; i--) {
                for (int j = 2; j <= 3; j++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}