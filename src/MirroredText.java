import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MirroredText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the input file: ");
        String inputFilePath = scanner.nextLine();
        System.out.print("Enter the path of the output file: ");
        String outputFilePath = scanner.nextLine();
        scanner.close();

        try {
            File inputFile = new File(inputFilePath);
            Scanner fileScanner = new Scanner(inputFile);
            PrintWriter writer = new PrintWriter(outputFilePath);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String reversedLine = new StringBuilder(line).reverse().toString();
                writer.println(reversedLine);
            }
            fileScanner.close();
            writer.close();
            System.out.println("File has been mirrored and saved successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        }
    }
}