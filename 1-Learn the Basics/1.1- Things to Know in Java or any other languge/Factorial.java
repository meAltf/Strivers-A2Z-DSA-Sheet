public class FactorialCalculator {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;

        while (n > 0) {
            factorial *= n;
            n--;
        }

        System.out.println("Factorial of 5 is: " + factorial);
    }
}