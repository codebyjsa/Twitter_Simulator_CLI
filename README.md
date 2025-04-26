# Twitter Simulation in Java

## 📖 Description

This project is a simple **console-based Twitter simulation** built in Java.  
Users can:
- **Post tweets** (up to 60 characters each),
- **Store up to 10 tweets per user**,
- **Retrieve and view all tweets** for a specific username, along with **timestamps**.

It’s a small and clean project to practice Java fundamentals like:
- `HashMap`, `ArrayList`
- Classes and objects
- `Scanner` for user input
- `LocalDateTime` for timestamps
- Menu-driven programming.

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
   In your terminal/command-prompt
   ```bash
   git clone https://github.com/codebyjsa/Twitter_Simulator_CLI.git
   cd Twitter_Simulator_CLI
    ```

4. **Compile the Java Program**  
   Open your terminal/command prompt, navigate to the folder where you saved the file, and run:
   ```bash
   javac TwitterSimulation.java
   ```

5. **Run the Program**  
   After compiling successfully, run:
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
  Enter a username and your tweet (max 60 characters).  
  A timestamp will be added automatically.

- **Option 2:**  
  Enter a username to retrieve all their tweets along with their timestamps.

- **Option 3:**  
  Exit the program.

🔹 Each user can post **up to 10 tweets** only.  
🔹 Tweets are stored **temporarily in memory** (no database used).  
🔹 Handles **invalid inputs** gracefully.

---

## 📋 Example

```
Enter choice: 1
Enter username: john_doe
Enter tweet (max 60 characters): Hello, this is my first tweet!

Enter choice: 1
Enter username: john_doe
Enter tweet (max 60 characters): Loving this Twitter simulation.

Enter choice: 2
Enter username to get tweets: john_doe

Tweets of john_doe:
- [2025-04-27 16:15:00] Hello, this is my first tweet!
- [2025-04-27 16:16:10] Loving this Twitter simulation.
```

---

## 📜 Requirements

- Java JDK 8 or later

---

## 🙌 Contributing

Pull requests are welcome!  
Feel free to suggest improvements like:
- Storing tweets in a file,
- Limiting the number of displayed tweets,
- Adding user authentication.

---

## 📄 License

This project is open-source and free to use.

---

## 💬 Contact

For any queries:  
jasdeep.singhh06@gmail.com | [Linkedin](https://www.linkedin.com/in/jasdeep-singh-54ab0423a/)

---

# 🚀 Happy Coding!
