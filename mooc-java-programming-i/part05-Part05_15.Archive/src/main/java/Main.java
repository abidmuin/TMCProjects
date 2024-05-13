import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String identifier = "";
        String name = "";
        Map<String, String> records = new HashMap<>();

        while (scanner.hasNextLine()) {
            identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }

            name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            if (!records.containsKey(identifier)) {
                records.put(identifier, name);
            }
        }

        for (String key : records.keySet()) {
            System.out.println(key + ": " + records.get(key));
        }

        scanner.close();
    }
}
