public class Main {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1:
                System.out.println("Monday.");
                break;
            case 2:
                System.out.println("Tuesday.");
                break;
            case 2: // This line will result in a compilation error in Java
                System.out.println("Duplicate case.");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}