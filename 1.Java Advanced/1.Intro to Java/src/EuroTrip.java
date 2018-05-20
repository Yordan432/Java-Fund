import java.math.BigDecimal;
import java.util.Scanner;
public class EuroTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quantity = Double.parseDouble(scanner.nextLine());
        BigDecimal parseToBigDecimal = BigDecimal.valueOf(quantity);
        BigDecimal priceOf1kgWurst = BigDecimal.valueOf(1.20);
        BigDecimal rate = BigDecimal.valueOf(4210500000000.0);
        BigDecimal price = parseToBigDecimal.multiply(priceOf1kgWurst);

        System.out.println(price.multiply(rate));
    }
}
