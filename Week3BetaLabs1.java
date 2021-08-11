public class Week3BetaLabs1 {

    public static void main(String[] args) {

        int[] numArray = {1, 5, 2, 8, 13, 6};
        System.out.println(numArray[0]);
        System.out.println(numArray[numArray.length - 1]);
        // System.out.println(numArray[6]);
        // This would cause an out of bounds exception
        // System.out.println(numArray[-1]);
        // This would also cause an out of bounds exception
        System.out.println("Break in code");
        // For loop to print out array
        for (int n = 0; n < numArray.length; n++) {
            System.out.println(numArray[n]);
        }
        System.out.println("Break in code");
        // Enhanced for loop to print out array
        for (int num : numArray) {
            System.out.println(num);
        }
        System.out.println("Break in code");
        // Creates new variable sum, then prints sum of numbers in array up to that point
        double sum = 0;
        for (int n = 0; n < numArray.length; n++) {
            sum = sum + numArray[n];
            System.out.println(sum);
        }
        System.out.println("Break in code");
        // Creates a new variable called average, which is the average of all the numbers in the array
        double average = sum / numArray.length;
        System.out.println(average);
        System.out.println("Break in code");
        // Creates an enhanced for loop that prints out all odd numbers in the array
        for (int num : numArray) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
        System.out.println("Break in code");
        // Creates a String array with the names Sam, Sally, Thomas, and Robert
        String[] nameArray = {"Sam", "Sally", "Thomas", "Robert"};
        // Takes the length of each name, and prints the sum of the lengths
        int nameSum = 0;
        for (String name : nameArray) {
            nameSum += name.length();
        }
        System.out.println(nameSum);
    }
}