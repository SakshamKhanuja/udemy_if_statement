public class Main {

    public static void main(String[] args) {
        // Variable stores whether something is an alien or not.
        boolean isAlien = false;

        /*
         * If statement - No semicolon needed.
         *
         * The Equal to operator "==" checks whether the two operands are identical, it then returns "true" or "false"
         * accordingly.
         *
         * In line 18, since "isAlien" is "false" which is NOT identical to "true", the expression returns "false".
         *
         * The If statement checks whether the expression inside it returns "true", and only then will it execute the
         * following statement i.e. line 19.
         */
        if (isAlien == true)
            System.out.println("It is an alien! X1");   // SKIPPED


        // Adding a semicolon at the end of If statement.
        if (isAlien == true);   // If statement terminates HERE.
            System.out.println("It is an alien! X2");   // Gets executed no matter what.

        // Adding 2 statements under the If statement.
        if (isAlien == true)
            System.out.println("It is an alien! X3");   // SKIPPED
            System.out.println("But, I am scared of aliens! X1");   // Gets executed no matter what.

        // For line 29 to be a part of If statement, we use Code block.
        if (isAlien == true) {  // Code Block is SKIPPED.
            System.out.println("It is an alien! X4");
            System.out.println("But, I am scared of aliens! X2");
        }
    }
}
