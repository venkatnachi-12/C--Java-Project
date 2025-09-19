// Importing necessary java libraries
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;

// Main class
public class Main {
    public static void main(String[] args) {
        // Create a matcher object to match regular expression patterns
        Matcher matcher;

        // Define file paths for login data and security login data
        String[] filePath = {"./data/loginData", "./data/SecurityLogin"};

        // Creating hash maps to store the credentials and the security credentials
        HashMap<String, Pair<String, String>> credentials = new HashMap<>();
        HashMap<String, Pair<String, String>> securityCredentials = new HashMap<>();

        // Creating a list to store both credentials and security credentials
        List<HashMap<String, Pair<String, String>>> CREDENTIALS = new ArrayList<>();
        CREDENTIALS.add(credentials);
        CREDENTIALS.add(securityCredentials);

        Pattern pattern = Pattern.compile("^(.+?)\\s+(.+?)\\s+(.+)$");

        for (int i = 0; i < 2; i++) {
            try {
                // Reading all the lines from the current file
                List<String> lines = Files.readAllLines(Paths.get(filePath[i]));

                // Loop through each line in the file
                for (String line : lines) {
                    matcher = pattern.matcher(line);
                    // Checks if the line matches the regular expression pattern
                    if (matcher.find()) {
                        
                        String username = matcher.group(1);
                        String password = matcher.group(2);
                        String name = matcher.group(3);

                        // Store the credentials in the corresponding hash map
                        CREDENTIALS.get(i).put(username, new Pair<>(password, name));
                    } else {
                        // Print an error message if the line does not match the regular expression pattern
                        System.out.println("Invalid line format: " + line);
                    }
                }
            } catch (IOException e) {
                // Print an error message if an Input/Output exception occurs
                e.printStackTrace();
            }
        }

        // Creating a Helper object to process commands
        Helper helper = new Helper(System.out, credentials, securityCredentials);

        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Process commands using the Helper object
        helper.processCommands(scanner, filePath[0]);
    }
}