import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class StudentsResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average = 0;
        Map<String,ArrayList<Double>> dict = new HashMap<String, ArrayList<Double>>();
        String name = scanner.next();
        String delimiter = scanner.next();
        String[] grades = scanner.nextLine().split(",\\s+");
        Double[] numbers = FillGradesIntegerArray(grades);
        double javaAdvanced = numbers[0];
        double javaOOP = numbers[1];
        double advOPP = numbers[2];
        average = FindAverage(numbers);
        System.out.println(String.format("%1$-10s|%2$7s|%3$7s|%4$7s|%5$7s|" , "Name" , "JAdv" , "JavaOOP" , "AdvOOP" , "Average"));
        System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|" , name , javaAdvanced , javaOOP , advOPP , average));

    }
    private static Double FindAverage(Double[] numbers) {
        Double average = 0.0;
        for (int i = 0; i <numbers.length; i++) {
            average+=numbers[i];
        }
        return  average/numbers.length;
    }

    private static Double[] FillGradesIntegerArray(String[] grades) {
        Double[] grade = new Double[grades.length];
        for (int i = 0; i <grades.length; i++) {
            grade[i] = Double.parseDouble(grades[i]);
        }
        return  grade;
    }
}
