package day08.partice;
import java.util.*;

public class NameCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a comma-separated list of names: ");
        String input = scanner.nextLine().trim();

        // Split the input by commas and store it in an array
        String[] namesArray = input.split(",");

        // Create a HashMap to store the name and its occurrence count
        HashMap<String, Integer> nameCountMap = new HashMap<>();

        // Count the occurrences of each name and store it in the HashMap
        for (String name : namesArray) {
            String trimmedName = name.trim();
            int count = nameCountMap.getOrDefault(trimmedName, 0);
            nameCountMap.put(trimmedName, count + 1);
        }

        // Print the count of each name
        System.out.println("Count of names:");
        for (Map.Entry<String, Integer> entry : nameCountMap.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            System.out.println(name + ": " + count);
        }
    }
}
