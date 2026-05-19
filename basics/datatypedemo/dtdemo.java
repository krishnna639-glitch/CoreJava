public class dtdemo {
    public static void main(String[] args) {
        // 1. boolean: true or false
        boolean static = true;

        // 2. byte: very small integers (-128 to 127)
        byte byte = 10;

        // 3. char: a single character
        char rank = 'S';

        // 4. short: small integers (up to ~32,000)
        short healthPoints = 15000;

        // 5. int: standard whole numbers
        int goldCoins = 500000;

        // 6. long: very large whole numbers (needs an 'L' at the end)
        long worldPopulation = 8000000000L;

        // 7. float: decimals for simple values (needs an 'f' at the end)
        float speed = 15.5f;

        // 8. double: high-precision decimals
        double powerRating = 99.987654321;

        // Printing everything out
        System.out.println("Hero Status: " + isHero);
        System.out.println("Level: " + level + " | Rank: " + rank);
        System.out.println("Health: " + healthPoints + " | Gold: " + goldCoins);
        System.out.println("World Pop: " + worldPopulation);
        System.out.println("Speed: " + speed + " | Power: " + powerRating);
    }
}