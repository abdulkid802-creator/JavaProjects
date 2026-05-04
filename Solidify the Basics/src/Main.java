import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Student student = new Student("Abdul");

        System.out.println(student.name);

        int choice = 0;

        while (choice != 5){
            System.out.println("*".repeat(21));
            System.out.println("* Average Calculate *");
            System.out.println("*".repeat(21));
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade to Student");
            System.out.println("3. View all Student & average");
            System.out.println("4. Save to file");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1){
                System.out.print("Enter your name: ");
                student.name = scanner.nextLine();
                scanner.nextLine();
            }
            else if (choice == 2){
                System.out.print("Enter your grade: ");
                double grade = scanner.nextDouble();
                student.addGrade(grade);
            }
            else if (choice == 3){
                System.out.println("Name: " + student.getName() + "Average: " + student.getAverage());
            }
        }

        scanner.close();
    }
}
