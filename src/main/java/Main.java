public class Main {
    public static void main(String[] args) {
        System.out.println("London Transit Reader pre-alpha");

        // If no arguments given, program simply outputs the status of all TfL rail services
        if (args.length == 0) {
            System.out.println("All"); // temporary, replace with actual data
        } else if (args[0].equals("piccadilly")) { // temporary test using "piccadilly" as an argument, completely rewrite and replace with actual working methods
            System.out.println("Once again closed on weekends to accomodate the 2024 Stock, much to our inconvenience");
        }
    }
}
