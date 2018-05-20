import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Earthquake {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        ArrayDeque<List<Integer>> numbers = new ArrayDeque<>();
        List<Integer> outputWave = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            List<Integer> temp = new ArrayList<>();
            for (String s : input) {
                temp.add(Integer.valueOf(s));
            }
            numbers.offer(temp);
           // numbers.addLast(Arrays.stream(reader.readLine().split("\\s+")).map(Integer::valueOf).collect(Collectors.toList()));
        }
        while (!numbers.isEmpty()) {
            List<Integer> currentNumber = numbers.pop();
            int wave = currentNumber.get(0);
            for (int i = 0; i < currentNumber.size(); i++) {
                if (wave < currentNumber.get(i)) {
                    numbers.addLast(currentNumber.subList(i, currentNumber.size()));
                    break;
                }
            }
            outputWave.add(wave);
        }
        System.out.println(outputWave.size());
        for (Integer integer : outputWave) {
            System.out.print(integer + " ");
        }
    }
}
