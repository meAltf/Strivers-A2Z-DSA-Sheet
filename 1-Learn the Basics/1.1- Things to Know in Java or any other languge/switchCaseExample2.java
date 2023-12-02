public class Main {
    public static void main(String[] args) {
        final int x = 10;
        final int y = 5;

        switch (x + y) {
            case 15:
                System.out.println("Result is 15.");
                break;
            case 20:
                System.out.println("Result is 20.");
                break;
            default:
                System.out.println("No match found.");
        }
    }
}