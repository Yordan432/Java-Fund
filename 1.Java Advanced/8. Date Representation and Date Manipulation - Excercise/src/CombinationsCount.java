import java.math.BigDecimal;
import java.util.Scanner;

public class CombinationsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        int nFactoriel = nFactorielNumber(n);
        int nSubKFactoriel = nSubKFactoriel(n , k);
        int kFactoriel = kFactoriel(k);

        int result = nFactoriel / kFactoriel;
        System.out.println(result);
    }
    private static int kFactoriel(int k) {
        if(k == 0){
            return 1;
        }
        return k * kFactoriel(k - 1);
    }

    private static int nSubKFactoriel(int n, int k) {
        int sub = n - k;
        if(n == 1){
            return 1;
        }
        return sub * nSubKFactoriel(n - 1, k);
    }

    private static int nFactorielNumber(int n) {
        if(n == 0){
           return 1;
        }
        return n * nFactorielNumber(n - 1);
    }
}
