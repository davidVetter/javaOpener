import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

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
        // USE 'printf(**string**)' to use the format variables directly when outputing to the console
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

        // System.out.println("Hello, what is your name? ");
        // // store next input to console in variable
        // // *Line below can be replaced with int, double, etc to the different data types
        // // When using a method other than 'nextLine', add an extra nextLine after the nextInt, etc
        // // deal with the 'enter' in the input buffer from when the system accepted the previous 'int'
        // String userName = scanner.nextLine();
        // System.out.println("Give me a number, any number...");
        // int intNext = Integer.parseInt(scanner.nextLine()); // An alternative to nextInt, etc is using nextLine - works with double, etc
        // System.out.printf("You gave me: %d %n", intNext);
        // // print users input
        // System.out.printf("The name was: %s %n", userName);
        // // close the scanner - release the memory

        // Calculator code
        System.out.println("Please enter the first number: ");
        double calcNum1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("You entered: %s %n", calcNum1);
        System.out.println("Please enter the second numebr: ");
        double calcNum2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.printf("You entered: %s %n", calcNum2);
        System.out.println("Please enter the operation you want to perform ('x' or '*' for multiply, '/' for divide,, '+' for addition and '-' for subtraction)");
        String operator = scanner.nextLine();
        System.out.printf("You chose %s %n", operator);

        // // Calculator logic using if/else statements
        // if (operator.equals("x")||operator.equals("*")) {
        //     System.out.printf("%f * %f = %f", calcNum1, calcNum2, calcNum1 * calcNum2);
        // } else if (operator.equals("-")) {
        //     System.out.printf("%f - %f = %f", calcNum1, calcNum2, calcNum1 - calcNum2);
        // } else if (operator.equals("+")) {
        //     System.out.printf("%f + %f = %f", calcNum1, calcNum2, calcNum1 + calcNum2);
        // } else if (operator.equals("/")) {
                // if (calcNum2 == 0){
                    // System.out.println("You can not divide by zero!")
                // } else {
        //     System.out.printf("%f / %f = %f", calcNum1, calcNum2, calcNum1 / calcNum2);
                // }
        // } else {
        //     System.out.printf("Invalid operation! Please restart and try again", calcNum1, calcNum2, calcNum1 + calcNum2);
        // }

        // Calculator logic using switch statements
        switch (operator) {
            case "+":
                System.out.printf("%f + %f = %f", calcNum1, calcNum2, calcNum1 + calcNum2);
                break;
            case "-":
                System.out.printf("%f - %f = %f", calcNum1, calcNum2, calcNum1 - calcNum2);
                break;
            case "*":
            case "x":
                System.out.printf("%f * %f = %f", calcNum1, calcNum2, calcNum1 * calcNum2);
                break;
            case "/":
                if (calcNum2 == 0){ // catch if trying to divide by 0
                    System.out.println("You can't divide by zero!!");
                }
                System.out.printf("%f / %f = %f", calcNum1, calcNum2, calcNum1 / calcNum2);
                break;
            default:
                System.out.println("Invalid operation!");
        }
        System.out.println();
        scanner.close();

        // Array examples
        
        // declare an array of characters
        char letters[] = {'r', 'u', 'h', 'b', 'y'};
        char key = 'h';
        // Sort the array in alphabetical order
        Arrays.sort(letters); // add a starting index and stopping index as 2nd and 3rd argument
        //Search an array
        int foundItemIndex = Arrays.binarySearch(letters, key); // returns the index if value is found -- MUST BE SORTED FIRST --
        // print out sorted array
        System.out.println(Arrays.toString(letters));
        System.out.println(foundItemIndex);

        // Array List Examples
        //---------------------
        
        ArrayList<Integer> numberList = new ArrayList<Integer>(); // Empty array list of integers
        // Add elements to arrayList
        numberList.add(4);
        numberList.add(2);
        numberList.add(1);
        numberList.add(5);
        numberList.add(3);
        // Change element at index 2 to the 2nd argument
        numberList.set(2, Integer.valueOf(30));
        numberList.set(2, 30); // alternative syntax to the above
        System.out.println(numberList.toString());

        // Sort an arrayList -- Uses 'Comparator' class and 'naturalOrder' method (low to high, a-z)
        // 'reverseOrder' can sort high to low (z-a)
        numberList.sort(Comparator.naturalOrder());
        numberList.sort(Comparator.reverseOrder());

        // .size() method will return int of the number of elements in the arrayList
        // .contains() method will return true or false if there is a matching element
        // .isEmpty() method will return true or false depending on if arrayList contains any elements or not
        // .clear() method will remove ALL elements in an arrayList


        // Print out the sorted arrayList
        System.out.println(numberList.toString());
    }
}