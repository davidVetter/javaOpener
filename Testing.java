import java.util.Scanner;

class Testing {
    public static void main(String[] args) {
        String name = "David";
        // Declare an int
        int age = 31;
        // Declare a string
        String city = "West Fargo";
        // Declare a boolean
        boolean truth = true;
        // Formatted string with variables
        // % + 'letter' for variables - s for string, b for boolean, etc
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. Is this true? %b", name,
                city, age, truth);
        System.out.println("Hello there!");
        System.out.println(formattedString);
        // returns a strings number of characters *includes spaces if multiple words*
        System.out.println(formattedString.length());
        // returns false if string is not 'empty'
        System.out.println(formattedString.isEmpty());
        // Make string uppercase * does not change the original string
        System.out.println(formattedString.toUpperCase());

        // Create new class objects of strings - Each is own place in memory *NOT REFERENCE, truely different even if the string value is the same
        String test1 = new String("Check");
        String test2 = new String("Check");
        // These are different objects in memory and are not equal
        System.out.println(test1 == test2); // false
        // How to check if two objects contain the same string - Returns boolean
        System.out.println(test1.equals(test2)); // true


        // User input Examples
        // Create new 'scanner' - accept user input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is your name? ");
        // store next input to console in variable
        String userName = scanner.nextLine();
        // print users input
        System.out.println(userName);
        // close the scanner - clear the memory
        scanner.close();
    }
}