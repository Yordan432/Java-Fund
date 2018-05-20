import java.util.Scanner;
public class ByteParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] dateNumbers = new int[n];
        for (int i = 0; i <n; i++) {
            byte nums = Byte.parseByte(scanner.nextLine());
            dateNumbers[i] = nums;
        }

        while (true){
            String[] command = scanner.nextLine().split("\\s+");
            if(command[0].equals("party over")){
                break;
            }
            int firstDigit = Integer.parseInt(command[0]);
            int position =Integer.parseInt(command[1]);

            switch (firstDigit){
                case -1:

                    break;
                case 0:

                    break;
                case 1:

                    break;
            }

        }
    }
}
