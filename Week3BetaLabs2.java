public class Week3BetaLabs2 {
    
    public static void main(String[] args) {

        // Where name input is coming from, calling to an outside method that returns nothing
        printNameGreeting("Bob");
        System.out.println("Break in code");
        // Uses another method that returns a greeting, and does not print in the method
        String firstName = "Tyler";
        String nameGreeting = createNameGreeting(firstName);
        System.out.println(nameGreeting);
        System.out.println("Break in code");
        // Takes a String and int, calls a method, and returns true if String length is greater than the int
        // First example is simpler form without defined variables
        System.out.println(compareStringIntLength("Testing", 9));
        // Second example with defined variables
        String testWord = "Hydroplane";
        int testInt = 7;
        boolean isLonger = compareStringIntLength(testWord, testInt);
        System.out.println(isLonger);
        System.out.println("Break in code");
        // Creates an array of Strings and a separate String. Calls a method to check if String exists in array. Prints result.
        String[] rainbow = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
        String color = "Indigo";
        System.out.println(isStringInArray(rainbow, color));
    }

    // Method for greeting a name
    public static void printNameGreeting(String fn) {
        System.out.println("Hello " + fn);
    }

    // Method that takes String name and returns greeting, does not print
    public static String createNameGreeting(String fn) {
        return "Hello there, " + fn;
    }

    // Method that takes the length of a String, compares if it is larger than an int, and returns true or false
    public static boolean compareStringIntLength(String word, int num) {
        return word.length() > num;
    }

    // Takes a String array and a String and checks if the String exists in the String array
    public static boolean isStringInArray(String array[], String word) {
        for (String item : array) {
            if (item.equals(word)) {
                return true;
            }
        }
        return false;
    }
}
