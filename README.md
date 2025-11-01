# Tic-Tac-Toe (5x5 Java Swing Edition) ❌⭕️

## Overview
This is a two-player Tic-Tac-Toe style game built in Java Swing.  
Instead of the normal 3x3 board and 3-in-a-row, this version uses a **5x5 grid** and players are trying to get **4 in a row** (horizontal, vertical, or diagonal).

The game runs in a GUI window (Java Swing) with clickable buttons for each board tile, custom images for X and O, a scoreboard, and replay/reset logic.

- **Language:** Java
- **IDE:** NetBeans
- **GUI:** Java Swing
- **Status:** Complete

---

## Features

### 🟦 Interactive GUI board
- The board is a 5x5 grid of buttons.
- Each tile updates to show `X` or `O` when clicked.
- Uses custom images (`X.jpg`, `O.jpg`) and background styling.

### 👤 Two-player mode
- Player 1 plays as X.
- Player 2 plays as O.
- Players enter their names before starting.
- A “Play” button starts the round and also acts as a reset for the next round.

### 🏆 Win detection
- Game checks for **4 in a row**:
  - horizontally
  - vertically
  - diagonally (both directions)
- When a player wins:
  - The 4 winning buttons are highlighted in gold.
  - The board locks so no one can keep clicking after the game is already decided.

### 🔁 Replay without closing
- You can play multiple rounds in the same window.
- The “Play” button resets the board for the next game.

### 📊 Ongoing score tracking
- Tracks number of wins for X, wins for O, and ties across rounds.
- Displays the current scoreboard in the GUI so both players can see who is winning overall.

### ✅ Input / state management
- The game only enables normal play once both players have entered names.
- It alternates turns (X goes first, then O, then X, …).
- It prevents illegal clicks after game over.

---

## How it works (technical overview)

### GUI (`TicTac.java`)
- Builds and lays out the full game window (`JFrame`)
- Creates:
  - Title / instructions area
  - Name inputs for both players
  - Scoreboard labels (`X Wins`, `O Wins`, `Ties`)
  - A 5x5 array of buttons: `boxes[x][y]`
  - A “Play” button to start/reset
- Applies colors, background image(s), and icons for each tile

It also:
- Stores references to all buttons so they can be updated later
- Registers a single event handler (`TicTacEvent`) for every button and the Play button

### Game logic (`TicTacEvent.java`)
- Implements `ActionListener` and controls:
  - Whose turn it is
  - Which button was clicked
  - What icon to place (`X` or `O`)
  - Internal board state using a 2D int array called `check`
    - `1` = X
    - `2` = O
    - `0` = empty
- After every move, it calls `winner()`:
  - Scans rows, columns, and diagonals for any streak of 4 identical values
  - If found:
    - Declares the winner
    - Highlights those 4 buttons in gold
    - Updates the scoreboard (`X Wins`, `O Wins`, `Ties`)
    - Locks the board so no more clicks are allowed
- If the board fills with no winner:
  - Counts as a tie
  - Tie counter increases
  - Board locks until reset

The logic also:
- Uses a click counter to alternate turns
- Resets all state cleanly when “Play” is pressed again

---

## How to run

### Option 1: Run in NetBeans (recommended)
1. Open NetBeans.
2. Go to `File > Open Project...`.
3. Select the `TicTac` folder (the one with `src`, `nbproject`, etc.).
4. Run the project.

The main class is:
```java
tictac.TicTac
```

### Option 2: Compile and run manually
If you want to run from terminal (no NetBeans):
```bash
# 1. clone the repo
git clone https://github.com/siddhipatel911/TicTacToe-5x5.git
cd TicTacToe-5x5/src

# 2. compile
javac tictac/*.java

# 3. run
java tictac.TicTac
```
### Note:
Make sure the image files (X.jpg, O.jpg, cardback.jpg) stay in the same relative path expected by the code so the icons load. If icons fail to load, you’ll see blank buttons, but the game still works.

---

## What I learned:
- Building a complete GUI in Java Swing, not just console logic.

- Using a 2D array to represent the board and check game state.
  
- Writing a generalized win checker that looks for 4 in a row in all directions.
  
- Handling event-driven programming with ActionListener, instead of while loops.
  
- Managing game reset state without restarting the program.

---

## Possible improvements
- Add single-player mode with a bot AI.

- Add sound effects on click / win.

- Animate the winning line flash instead of just recoloring.

- Add a timer per turn, or limit total moves.
