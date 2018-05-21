import java.util.ArrayDeque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> deque = new ArrayDeque<>();
        int prime = 1;
        for (String name : names) {
            deque.add(name);
        }
        while (deque.size() > 1){
            for (int i = 1; i <n; i++) {
                deque.offer(deque.poll());
            }
            if(IsPrimeNumber(prime)){
                System.out.println("Prime " + deque.peek());
            }
            else {
                System.out.println("Removed " + deque.poll());
            }
            prime++;
        }
        System.out.println("Last is " + deque.poll());
    }
    private static boolean IsPrimeNumber(int prime) {
        if(prime <= 1){
            return false;
        }
        for (int i = 2; i <=Math.sqrt(prime); i++) {
            if(prime % i == 0){
                return false;
            }
        }
        return true;
    }
}
