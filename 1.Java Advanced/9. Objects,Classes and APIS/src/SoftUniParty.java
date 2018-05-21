import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guests = scanner.nextLine();
        Set<String> notReservation = new TreeSet<>();
        HashSet<String> allGuests = new HashSet<>();
        int count = 0;

        while (!guests.equals("PARTY")){
            allGuests.add(guests);
            guests = scanner.nextLine();
        }
        String reservationGuests = scanner.nextLine();
        int maxReservation = allGuests.size();
        int countPersons = 0;
        while (!reservationGuests.equals("END")) {
           if(!allGuests.contains(reservationGuests)){
           }
           else {
               countPersons++;
               allGuests.remove(reservationGuests);
           }
            reservationGuests = scanner.nextLine();
        }
        System.out.println(maxReservation - countPersons);
        for (String allGuest : allGuests) {
           notReservation.add(allGuest);
        }
        for (String s : notReservation) {
            System.out.println(s);
        }
    }
}
