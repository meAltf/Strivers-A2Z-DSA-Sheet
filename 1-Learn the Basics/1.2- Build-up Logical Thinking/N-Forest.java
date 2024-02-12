class Main {
    static void pattern1(int N) {
        // This is the outer loop which will loop for the rows.
        for (int i = 0; i < N; i++) {
            // This is the inner loop which here, loops for the columns
            // as we have to print a rectangular pattern.
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }

            // As soon as N stars are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }
}