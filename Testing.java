class Testing {
    public static void main(String[] args) {
        String name = "David";
        int age = 31;
        String city = "West Fargo";

        String formattedString = String.format("My name is %s. I am from %s. I am %d years old.", name, city, age);
        System.out.println("Hello there!");
        System.out.println(formattedString);
    }
}