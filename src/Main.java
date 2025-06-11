public class Main {
    public static void main(String[] args) {

        CoffeeCup cupA = new CoffeeCup("Medium", "Vanilla");
        CoffeeCup cupB = cupA; // Shared reference

        cupB.setFlavor("Hazelnut");

        CoffeeCup cupC = new CoffeeCup("Large", "Mocha");
        cupB = cupC;

        cupC.setSize("Small");

        cupA.printDetails("Cup A");
        cupB.printDetails("Cup B");
        cupC.printDetails("Cup C");

        // Your Challenge:
        // 1. Predict the output.
        // 2. Identify:
        //    - How many objects are created?
        //    - How many references?
        //    - Which variables refer to the same object?
    }
}

