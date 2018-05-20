import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String , Integer> resources = new HashMap<>();
        String input = scanner.nextLine();

        ArrayList<String> listWord = new ArrayList<>();
        ArrayList<Integer> listValue = new ArrayList<>();

        int row = 1;
        while (!input.equals("stop")){
            if (row % 2 != 0){
                listWord.add(input);
            }
            else {
                int parsedNum = Integer.parseInt(input);
                listValue.add(parsedNum);
            }
            if(listWord.size() > 0 && listValue.size() > 0){
                String key = listWord.get(0);
                int value = listValue.get(0);

                if(resources.containsKey(key)){
                    int values = resources.get(key);
                    int listValues = listValue.get(0);
                    int sum = values + listValues;
                    resources.put(key , sum);

                }
                else {
                    resources.put(key , value);
                }
                listWord.clear();
                listValue.clear();
            }
            input = scanner.nextLine();
            row++;
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : resources.entrySet()) {
            System.out.printf("%s -> %s" , stringIntegerEntry.getKey() , stringIntegerEntry.getValue());
            System.out.println();
        }
    }
}
