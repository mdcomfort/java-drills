public class FunctionsPractice {

    public static void main(String[] args) {
        helloWorld();

        int [] numTest = new int[5];
        numTest[0] = 150;
        numTest[1] = 3;
        numTest[2] = 200;
        numTest[3] = 45;
        numTest[4] = 99;

        bigOrSmall(numTest);
    }

    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static String faveColorFinder(String color) {
        if (color.equals("red")) {
            return "red is a great color";
        } else if (color.equals("green")) {
            return "green is a solid favorite color";
        } else if (color.equals("black")) {
            return "so trendy";
        } else {
            return "you need to evaluate your color choice";
        }
    }

    public static String thatsOdd(int num) {
        if (num % 2 == 0) {
            return "That's not odd!";
        } else {
            return "That is odd indeed!";
        }
    }

    public static String[] bigOrSmall(int[] arr) {
        String[] answers = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100) {
                System.out.println("big");
                answers[i] = "big";
            } else {
                System.out.println("small");
                answers[i] = "small";
            }
        }
        return answers;
    }
}

