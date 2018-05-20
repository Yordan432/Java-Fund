import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String , String> phonebook = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("search")){
            String[] tokens = input.split("-");
            String name = tokens[0];
            String phonebooks = tokens[1];

            ContainsKeyAndValue(phonebook , name , phonebooks);

            if(input.equals("search")){
            }
            input = scanner.nextLine();
        }
        String searchDate =scanner.nextLine();
        while (!searchDate.equals("stop")){
            if(phonebook.containsKey(searchDate)){
                PrintFindKey(phonebook , searchDate);
            }
            else {
                System.out.printf("Contact %s does not exist." , searchDate);
                System.out.println();
            }
            searchDate =scanner.nextLine();
        }
    }

    private static void PrintFindKey(Map<String , String> phonebook , String findKey) {
        for (Map.Entry<String, String> stringStringEntry : phonebook.entrySet()) {
            if (stringStringEntry.getKey().equals(findKey)){
                System.out.printf("%s -> %s" , stringStringEntry.getKey() , stringStringEntry.getValue());
                System.out.println();
            }
        }

    }

    private static void ContainsKeyAndValue(Map<String, String> phonebook, String name , String phonebooks) {
        if(!phonebook.containsKey(name)){
            phonebook.put(name , phonebooks);
        }
        else if(phonebook.containsKey(name)){
            phonebook.put(name , phonebooks);
        }
    }
}
