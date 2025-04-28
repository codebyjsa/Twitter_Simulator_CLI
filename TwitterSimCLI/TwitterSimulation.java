import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Tweet {
    private String content;
    private String timestamp;

    public Tweet(String content) {
        this.content = content;
        this.timestamp = generateTimestamp();
    }

    private String generateTimestamp() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return LocalDateTime.now().format(formatter);
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }
}

class TwitterUser {
    private String username;
    private List<Tweet> tweets;

    public TwitterUser(String username) {
        this.username = username;
        this.tweets = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean addTweet(String content) {
        if (tweets.size() >= 10) {
            return false; // Max 10 tweets allowed
        }
        tweets.add(new Tweet(content));
        return true;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }
}

class TwitterApp {
    private Map<String, TwitterUser> users;
    private Scanner scanner;

    public TwitterApp() {
        users = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n1. Add Tweet");
            System.out.println("2. Get Tweets of a User");
            System.out.println("3. Exit");
            System.out.print("\nEnter choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTweet();
                    break;
                case "2":
                    getTweets();
                    break;
                case "3":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    private void addTweet() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter tweet (max 60 characters): ");
        String tweetContent = scanner.nextLine();

        if (tweetContent.length() > 60) {
            System.out.println("Tweet exceeds 60 characters. Please try again.");
            return;
        }

        TwitterUser user = users.getOrDefault(username, new TwitterUser(username));

        if (!user.addTweet(tweetContent)) {
            System.out.println("User has already posted 10 tweets. Cannot add more.");
            return;
        }

        users.put(username, user);
        System.out.println("Tweet added successfully!");
    }

    private void getTweets() {
        System.out.print("Enter username to get tweets: ");
        String username = scanner.nextLine().trim();

        TwitterUser user = users.get(username);

        if (user == null) {
            System.out.println("No tweets found for user: " + username);
            return;
        }

        List<Tweet> tweets = user.getTweets();

        if (tweets.isEmpty()) {
            System.out.println("No tweets found for user: " + username);
        } else {
            System.out.println("Tweets of " + username + ":");
            for (Tweet tweet : tweets) {
                System.out.println("[" + tweet.getTimestamp() + "] " + tweet.getContent());
            }
        }
    }
}

public class TwitterSimulation {
    public static void main(String[] args) {
        TwitterApp app = new TwitterApp();
        app.start();
    }
}
