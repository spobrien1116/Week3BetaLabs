public class Week3BetaLabs3 {
    
    //The main portion of code
    public static void main(String[] args) {

        // Creates an array of ints (I used scores) that calls a method to find the lowest in the array
        // Prints the result from the method
        int[] scoresArray = {68, 97, 53, 75, 82, 85, 93, 71, 100, 82};
        System.out.println(findLowestScore(scoresArray));
        System.out.println("Break in code");
        // Creates an array of doubles that calls a method to find out the average
        // Prints the result from the method
        double[] tempsArray = {72, 98, 103, 77, 62, 81, 86};
        System.out.println(findTempAverage(tempsArray));
        System.out.println("Break in code");
        // Creates an array of Strings, calls method to find length of Strings, prints array of String lengths
        String[] fruitTypes = {"Apple", "Orange", "Banana", "Watermelon", "Pineapple", "Mango"};
        int[] typeLengths = (convertedStringLength(fruitTypes));
        for (int num : typeLengths) {
            System.out.println(num);
        }
        System.out.println("Break in code");
        // Creates an array of Strings, calls method to determine total length of all words with even count and
        // total length of all words with odd count, then checks if total even length is greater than total odd length.
        String[] creatures = {"Dinosaur", "Koala", "Jaguar", "Tiger", "Elephant", "Giraffe", "Bear", "Chicken"};
        System.out.println(evenLettersTotalGreater(creatures));
        System.out.println("Break in code");
        // Creates a String, calls a method to determine if it is a palindrome, and prints the result
        System.out.println(checksPalindrome("racecar"));
        System.out.println(checksPalindrome("tomato"));
        System.out.println(checksPalindrome("house"));
        System.out.println(checksPalindrome("radar"));
    }

    // Below are the collection of methods used for this lab

    // A method which inputs an int array and returns the lowest int in the array
    public static int findLowestScore(int scores[]) {
        int lowestNumber = scores[0];
        for (int score : scores) {
            if (score < lowestNumber) {
                lowestNumber = score;
            }
        }
        return lowestNumber;
    }

    // A method which inputs a double array and returns the average of the doubles
    public static double findTempAverage(double temps[]) {
        double averageTemp = 0;
        for (double temp : temps) {
            averageTemp += temp;
        }
        return averageTemp / temps.length;
    }

    // A method that takes an array of Strings, finds the length of the Strings, and returns an array of ints
    // to match the length of the Strings in those same positions
    public static int[] convertedStringLength(String words[]) {
        int[] stringLength = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            stringLength[i] = words[i].length();
        }
        return stringLength;
    }

    // A method that takes an array of Strings and finds their lengths. Adds total value of even Strings and odd Strings.
    // If even Strings have more total letters, returns true. If odd Strings have more total letters, returns false.
    public static boolean evenLettersTotalGreater(String words[]) {
        int evenTotal = 0;
        int oddTotal = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                evenTotal += words[i].length();
            } else {
                oddTotal += words[i].length();
            }
        }
        return evenTotal > oddTotal;
    }

    // A method that returns true if the String entered is a palindrome (same forwards as backwards)
    public static boolean checksPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                return false;
            }
        }
        return true;
        // This was a very tricky one. I was not aware of the charAt function to analyze components
        // of a String. I originally attempted to see if do/while loops nested in for and if loops would
        // work, but it ended up being overly complicated. This sample code from the lab really simplifies
        // the code. Please reference this for future examples.
    }
}
