# **Bulls and Cows Console Game in Java**

Welcome to the Bulls and Cows game, a classic code-breaking puzzle implemented in Java! This game is played entirely in the console, offering a fun and challenging experience for players of all levels.

### _🧩 About the Game_

Bulls and Cows is a logic-based game where the player tries to guess a secret code generated by the computer. The code consists of a sequence of distinct digits. After each guess, the player receives feedback in the form of "bulls" and "cows":

- Bulls: The number of correct digits in both digit and position.
- Cows: The number of digits in the guess that are correct in digit but not in the correct position.

### _🎮 _Features__

- Random Code Generation: Each game starts with a randomly generated code, ensuring a unique experience every time.
- Interactive Console Interface: The game is entirely console-based, with a clean and intuitive interface. 
- Customizable Code Length: Set the length of the code to increase or decrease the difficulty. 
- Customizable Symbols Used: Set the range of symbols used from 0-9 and a-z.
- Score Tracking: Keep track of your attempts and improve your logic with each round.

### _🔧 Installation_

To run the game, clone the repository and compile the Java files:

    git clone https://github.com/yourusername/bulls-and-cows-java.git
    cd bulls-and-cows-java
    javac src.BullsAndCows.java
    java src.BullsAndCows

### _📚 How to Play_ 
1. Run the game in your console/terminal. 
2. The computer will prompt the user to input the length of the code.
3. The computer will then prompt the user for the number of possible symbols (0-9,a-z).
4. The computer will generate a secret code based on the code length and number of unique symbols.
5. Enter your guess, and the game will provide feedback on the number of bulls and cows. 
6. Keep guessing until you crack the code!

### _🤝 Contributing_

Contributions are welcome! Feel free to fork the repository, submit issues, or make pull requests.

### _📜 License_

This project is licensed under the MIT License.