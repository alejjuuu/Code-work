public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            System.out.println("Hello World!");

            // define and declare Array
            int[] numbers = new int[2];

            System.out.println("Before the For Loop Started");

            // display Array
            for (int x = 0; x <= 2; x++) {
                System.out.println(numbers[x]);
            }

            System.out.println("THE END ");

        } catch (Exception e) {
            System.out.println("Hey! Something went wrong.");
        }

    }
}
