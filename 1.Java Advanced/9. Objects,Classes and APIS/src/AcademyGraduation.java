import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        Map<String, Double> academyGraduation = new TreeMap<>();
        for (int i = 0; i < countStudents; i++) {
            String nameStudent = scanner.nextLine();
            String[] grades = scanner.nextLine().split("\\s+");
            double[] gradesStudents = new double[grades.length];

            for (int j = 0; j < grades.length; j++) {
                gradesStudents[j] = Double.parseDouble(grades[j]);
            }
            double avg = Average(gradesStudents);

            academyGraduation.put(nameStudent, avg);
        }
        for (Map.Entry s : academyGraduation.entrySet()) {
            System.out.printf("%s is graduated with ",s.getKey());
            System.out.println(s.getValue());
        }
    }
    private static double Average(double[] gradesStudents) {
        double average = 0;

        for (int i = 0; i <gradesStudents.length; i++) {
            average+=gradesStudents[i];
        }

        return average / gradesStudents.length;

    }
}
