import java.util.Scanner;

public class BasketballDrafter {
    public static void main(String[] kargs) {
        String name = "Kim";
        int age = 20;
        double height = 1.76;
        boolean isStudent = true;
        char grade = 'B';
        // use final for when a variable should not be reassigned
        final int daysInAWeek = 7;

        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = input.nextLine();

        System.out.print("How old are you? ");
        age = Integer.parseInt(input.nextLine());
        System.out.println(" ");

       if (isStudent && height >= 1.6 && age > 15) {
            System.out.println(name + ", congratulations! You've been drafted to join the basketball team.");
            if(grade == 'A'){
                System.out.print("I just hope joining the team doesn't affect your grade.");
            }
            if(age <= 18){
                System.out.println(" Considering you're only " + age + " this is quite impressive.");
            }
       } else if (!isStudent) {
            System.out.println("Sorry, you need to be a student to be able to join the team.");
       } else if (age <= 15) {
            System.out.println("Sorry, you're too young.");
       } else if (height < 1.6) {
            System.out.println("Sorry, you're too short.");
       } else {
            System.out.println("Sorry, you didn't make the cut");
       }
    }
}