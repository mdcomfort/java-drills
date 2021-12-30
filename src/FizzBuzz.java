public class FizzBuzz { // public class FizzBuzz created

    public static void main(String[] args) { // main method created as entry point to the app
        fizzBuzz100(); // function fizzBuzz100 is called

//        for (int i = 1; i <= 100; i++) {
//            switch (true) {
//                case (((i % 5) == 0) && ((i % 3) == 0)):
//                    System.out.println("fizzbuzz");
//                    break;
//                case ((i % 3) == 0):
//                    System.out.println("fizz");
//                    break;
//                case ((i % 5) == 0):
//                    System.out.println("buzz");
//                    break;
//                default:
//                    System.out.println(i);
//            }
//        }
    }

    private static void fizzBuzz100() { // fizzBuzz function, no parameters
        for (int i = 1; i <= 100; i++) { // for loop that will loop starting at 1 until it gets to 100 inclusive
            if (((i % 5) == 0) && ((i % 3) == 0)) // checks if i is evenly divisible by both 3 and 5, if so prints fizzbuzz (moving it up to top of control flow to fix bug in given code)
                System.out.println("fizzbuzz");
            else if ((i % 3) == 0) // checks if i is evenly divisible by 3, if so prints fizz
                System.out.println("fizz");
            else if ((i % 5) == 0) // checks if i is evenly divisible by 5, if so prints buzz
                System.out.println("buzz");
            else // otherwise, prints the number i itself
                System.out.println(i);
        }
    }
}

