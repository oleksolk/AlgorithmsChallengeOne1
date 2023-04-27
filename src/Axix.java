import java.util.Scanner;

public class Axix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-coordinate of point A: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of point A: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter the x-coordinate of point B: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of point B: ");
        double y2 = scanner.nextDouble();
        scanner.close();

        double angleOA = Math.atan2(y1, x1);
        double angleOB = Math.atan2(y2, x2);

        if (angleOA > angleOB) {
            System.out.println("Segment OA forms a larger angle with the positive X-axis.");
        } else if (angleOB > angleOA) {
            System.out.println("Segment OB forms a larger angle with the positive X-axis.");
        } else {
            System.out.println("Both segments OA and OB form the same angle with the positive X-axis.");
        }
    }
}
