[README1.md](https://github.com/user-attachments/files/27379003/README1.md)
# ⚔️ Java RPG Battle Game

A text-based, turn-based RPG battle game built in Java. Fight through endless waves of scaling enemies, level up your character, collect items, and see how far you can go.

Built from scratch as a Java OOP learning project — every class, mechanic, and system was designed and written by hand.

---

## 🎮 Gameplay

- Choose to **Attack**, **Use Items**, or **Run** each turn
- Enemies scale in difficulty every round — more HP, higher attack
- Defeat enemies to gain **XP** and **level up**
- Random **item drops** after each victory
- Survive as many rounds as possible

---

## ✅ Features

- Turn-based combat with player choice menu
- HP and level display updated every turn
- Defence stat that reduces incoming damage
- XP system with automatic level up (every `level × 50` XP)
- Stats increase on level up (attack, defence, max HP)
- Full heal between rounds
- 10 unique enemy names that cycle and scale per round
- 4 item types: Health Potion, Elixir, Iron Sword, Shield
- Random item drops after winning a battle
- Inventory system — view, select, and consume items mid-battle
- Proper run mechanic — escape without the enemy getting a free hit
- Game over on death or escape

---

## 🗂️ Project Structure

```
RPGGame/
└── src/
    ├── Main.java           # Entry point — sets up player, items, and round loop
    ├── Character.java      # Abstract base class for all characters
    ├── Player.java         # Extends Character — has level, XP, inventory
    ├── Enemy.java          # Extends Character — has XP reward, random attacks
    ├── Item.java           # Item data and use() logic (potions, weapons, shields)
    ├── Inventory.java      # ArrayList-based inventory with add/remove/display
    └── BattleEngine.java   # Core battle loop — turn management, drops, win/lose
```

---

## ▶️ How to Run

**Requirements:** Java JDK 11 or above

1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/java-rpg-battle-game.git
   ```

2. Navigate to the project folder and compile:
   ```bash
   cd java-rpg-battle-game/src
   javac *.java
   ```

3. Run the game:
   ```bash
   java Main
   ```

---

## 🧠 Java Concepts Practised

- **Abstract classes and methods** — `Character` as a base with enforced `attack()` override
- **Inheritance** — `Player` and `Enemy` extending `Character`
- **Encapsulation** — `protected` fields accessible to subclasses, `private` fields with getters
- **Method overriding** with `@Override`
- **ArrayLists** — dynamic inventory management
- **Scanner** — reading user input from the console
- **Random** — enemy power attacks and item drops
- **`Math.max()` / `Math.min()`** — clamping HP and damage values
- **Switch expressions** — clean menu handling
- **Modulo operator** — cycling enemy names across rounds

---

## 👤 Author

**Abdul**  
Computing Student @ TU Dublin  
[GitHub](https://github.com/YOUR_USERNAME)
