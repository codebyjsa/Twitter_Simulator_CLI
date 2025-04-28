# Twitter Simulation in Java

## 📖 Description

This project is a simple **console-based Twitter simulation** built in Java.  
Users can:
- **Post tweets** (up to 60 characters each),
- **Store up to 10 tweets per user**,
- **Retrieve and view all tweets** for a specific username, along with **timestamps** (date and time).

It’s a small and clean project to practice Java fundamentals like:
- `HashMap`, `ArrayList`
- Classes and Objects (`TwitterUser`, `Tweet`)
- `Scanner` for user input
- `LocalDateTime` and `DateTimeFormatter` for timestamps
- Menu-driven console applications.

---

## 🛠 Installation

To run this project locally:

1. **Install Java**  
   Make sure you have Java installed. You can check using:
   ```bash
   java -version
   ```
   If not installed, download and install from [here](https://www.oracle.com/java/technologies/javase-downloads.html).

2. **Download the Code**  
   Clone the repository:
   ```bash
   git clone https://github.com/codebyjsa/Twitter_Simulator_CLI.git
   cd Twitter_Simulator_CLI
   ```

3. **Compile the Java Program**  
   In your terminal/command prompt:
   ```bash
   javac TwitterSimulation.java
   ```

4. **Run the Program**  
   After compiling:
   ```bash
   java TwitterSimulation
   ```

---

## 🚀 Usage

Once you start the program, you'll see a simple menu:

```
1. Add Tweet
2. Get Tweets of a User
3. Exit
```

- **Option 1:**  
  - Enter a username and your tweet (max 60 characters).  
  - A timestamp will be recorded automatically for each tweet.

- **Option 2:**  
  - Enter a username to retrieve and view all their tweets along with timestamps.

- **Option 3:**  
  - Exit the program safely.

🔹 Each user can post **up to 10 tweets** only.  
🔹 Tweets are stored **temporarily in memory** (no database or file storage).  
🔹 Handles **invalid inputs** gracefully.

---

## 📋 Example

```
Enter choice: 1
Enter username: john_doe
Enter tweet (max 60 characters): Hello, this is my first tweet!

Tweet added successfully!

Enter choice: 1
Enter username: john_doe
Enter tweet (max 60 characters): Loving this Twitter simulation.

Tweet added successfully!

Enter choice: 2
Enter username to get tweets: john_doe

Tweets of john_doe:
[2025-04-27 16:15:00] Hello, this is my first tweet!
[2025-04-27 16:16:10] Loving this Twitter simulation.
```

---

## 📜 Requirements

- Java JDK 8 or later

---

## 🙌 Contributing

Pull requests are welcome!  
Suggestions for improvements:
- Saving tweets to a file (file handling),
- Sorting tweets by latest first,
- Adding features like deleting a tweet,
- Adding simple user authentication.

---

## 📄 License

This project is **open-source** and free to use under the MIT License.

---

## 💬 Contact

For any queries or collaboration:  
📧 jasdeep.singhh06@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/jasdeep-singh-54ab0423a/)

---

# 🚀 Happy Tweeting in Java!
