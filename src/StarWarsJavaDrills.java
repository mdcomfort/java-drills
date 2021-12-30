public class StarWarsJavaDrills {

    public static void main(String[] args) {

        String firstName = "Han";
        String lastName = "Solo";
        String birthYear = "32 BBY";
        String homeWorld = "Corellia";
        float heightInMeters = 1.8f;
        float weightInKilograms = 80.0f;
        float purse = 150.0f;

        float droid = 24.3f;
        float fineBoots = 45.0f;
        purse -= droid;
        purse -= fineBoots;
        purse *= 2;
        purse -= purse * .1;

        System.out.println(purse); // purse is now 145.26

        // saber design
        boolean hasBlackHandle = true;
        boolean hasPurpleBlade = true;

        if (hasBlackHandle && hasPurpleBlade) {
            System.out.println("This one's mine!");
        }
        else {
            System.out.println("Pass");
        }

        // ship name
        String shipOne = "Starship Enterprise";

        if (shipOne.equals("Millennium Falcon")) {
            System.out.println("Let's go!");
        }
        else {
            System.out.println("I better hide somewhere");
        }

        // food items
        float foodItemCost = 6.0f;
        boolean foodIsRecommended = true;
        float drinkCost = 3.0f;
        int drinkSize = 32;

        if (foodItemCost < 5 && foodIsRecommended) {
            System.out.println("I'd like to have this");
        }
        else {
            System.out.println("No thanks");
        }

        if (drinkCost < 1 || drinkSize > 24) {
            System.out.println("I'll take this drink");
        }
        else {
            System.out.println("I'm good thanks");
        }
    }
}
