import java.util.Scanner;

public class AttendanceTracker {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = s.nextInt();
        System.out.print("Enter the number of days in the month: ");
        int d = s.nextInt();
        for (int i = 1; i <= n; i++) {
            int presentCount = 0;
            int absentCount = 0;
            System.out.println("\nAttendance for Employee " + i + ":");
            for (int j = 1; j <= d; j++) {
                System.out.print("Enter attendance for Day " + j + " (P for present, A for absent): ");
                char status = s.next().charAt(0);
                if (status == 'P' || status == 'p') {
                    presentCount++;
                } else if (status == 'A' || status == 'a') {
                    absentCount++;
                } else {
                    System.out.println("Invalid input, please enter 'P' for present or 'A' for absent.");
                    j--;
                }
            }
            System.out.println("\nEmployee " + i + " Attendance Summary:");
            System.out.println("Total Present Days: " + presentCount);
            System.out.println("Total Absent Days: " + absentCount);
        }
        s.close();
    }
}
