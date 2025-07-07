import java.util.Scanner; 

public class Studentgradecalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter how many subjects: ");
        int subjects = sc.nextInt(); 

        int total = 0; 
        int[] arr = new int[subjects]; 

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            total = total + arr[i];
        }

        double percent = (double) total / subjects;
        char grade;
        if (percent >= 90) {
            grade = 'A';
        } else if (percent >= 80) {
            grade = 'B';
        } else if (percent >= 70) {
            grade = 'C';
        } else if (percent >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n--- Report ---");
        System.out.println("Total Marks = " + total + " out of " + (subjects * 100));
        System.out.println("Percentage = " + percent + "%");
        System.out.println("Grade = " + grade);

        sc.close(); 
    }
}