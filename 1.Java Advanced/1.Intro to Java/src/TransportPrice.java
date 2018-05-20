import java.util.Scanner;
public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String travel = scanner.nextLine();

        double result = 0;
        if(day >=20 && day < 100){
            result = day * 0.09;
            System.out.printf("%.2f" ,result);
            return;
        }
        else if(day >=100){
            result = day * 0.06;
            System.out.printf("%.2f" ,result);
            return;
        }
        if(travel.equals("day")){
            result = day * 0.79 + 0.70;
            System.out.printf("%.2f" ,result);
        }
        else if(travel.equals("night")){
            result = day * 0.90;
            result+=0.70;
            System.out.printf("%.2f" ,result);
        }


    }
}
