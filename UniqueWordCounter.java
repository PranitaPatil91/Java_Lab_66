import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordCounter {
    public static void processFile(String filePath) {
        Set<String> hashSet = new HashSet<>();  
        Set<String> treeSet = new TreeSet<>(); 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z\\s]", " ");
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        hashSet.add(word);
                        treeSet.add(word);
                    }
                }
            }
            System.out.println("=== Task A: Count Unique Words ===");
            System.out.println("Total unique words: " + hashSet.size());
            System.out.println("\n=== Task B: List Unique Words Alphabetically ===");
            for (String word : treeSet) {
                System.out.println(word);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String filePath = "sample.txt";
        processFile(filePath);
    }
}
