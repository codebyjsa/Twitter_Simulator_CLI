import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TwitterSimulation {

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = getChoice();

            switch (choice) {
                case 1:
                    addTweet();
                    break;
                case 2:
                    retrieveTweets();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }
        }
    }

    private static int getChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void displayMenu() {
        System.out.println("\n1. Add Tweet");
        System.out.println("2. Get Tweets of a User");
        System.out.println("3. Exit");
        System.out.print("\nEnter choice: ");
    }

    static class Tweet {
        String message;
        String timestamp;

        Tweet(String message) {
            this.message = message;
            this.timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        }
    }

    private static Map<String, List<Tweet>> tweetsMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void addTweet() {
        scanner.nextLine();
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        if (username.isEmpty()) {
            System.out.println("Username cannot be empty.");
            return;
        }

        System.out.print("Enter tweet (max 60 characters): ");
        String tweetText = scanner.nextLine();

        if (tweetText.length() > 60) {
            System.out.println("Tweet is too long. Maximum allowed characters are 60.");
            return;
        }

        List<Tweet> userTweets = tweetsMap.getOrDefault(username, new ArrayList<>());

        if (userTweets.size() >= 10) {
            System.out.println("User has reached the maximum limit of 10 tweets.");
            return;
        }

        userTweets.add(new Tweet(tweetText));
        tweetsMap.put(username, userTweets);
        System.out.println("Tweet added successfully!");
    }

    private static void retrieveTweets() {
        scanner.nextLine();
        System.out.print("Enter username to get tweets: ");
        String username = scanner.nextLine().trim();

        List<Tweet> userTweets = tweetsMap.get(username);

        if (userTweets == null || userTweets.isEmpty()) {
            System.out.println("No tweets found for user: " + username);
            return;
        }

        System.out.println("\nTweets of " + username + ":");
        for (Tweet tweet : userTweets) {
            System.out.println("- [" + tweet.timestamp + "] " + tweet.message);
        }
    }
}
