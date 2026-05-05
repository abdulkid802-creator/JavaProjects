# ⚔️ Java RPG Battle Game

A text-based, turn-based RPG battle game built in Java. Fight through endless waves of scaling enemies, land critical hits, unleash special abilities, and survive brutal boss battles every 5 rounds.

Built from scratch as a Java OOP learning project — every class, mechanic, and system was designed and written by hand.

---

## 🎮 Gameplay

- Choose to **Attack**, **Use Items**, **Special Ability**, or **Run** each turn
- Enemies scale in difficulty every round — more HP, higher attack
- Defeat enemies to gain **XP** and **level up**
- Random **item drops** after each victory
- **Boss battles** every 5 rounds with devastating special moves
- Survive as many rounds as possible

---

## ✅ Features

### ⚔️ Combat
- Turn-based combat with player choice menu
- **Critical hits** — 1 in 6 chance to deal double damage
- **Miss mechanic** — 1 in 6 chance to miss, triggering an enemy counter-attack
- **Power Strike** special ability — deals 3x damage with a 2 turn cooldown
- Defence stat that reduces all incoming damage

### 👾 Enemies
- 10 unique enemy names that cycle each round
- Enemy stats scale with round number — harder every wave
- **Boss battles every 5 rounds** — higher HP, attack, and a special move that hits every other turn
- Regular enemies vs boss enemies handled separately

### 📈 Progression
- XP system — gain XP for each kill
- Automatic level up every `level × 50` XP
- Stats increase on level up (attack +20, defence +6, max HP +35)
- Level displayed on HUD every turn
- Full heal between rounds

### 🎒 Items
- Inventory system — view, select, and consume items mid-battle
- 4 item types:
  - **Health Potion** — restores 30 HP
  - **Elixir** — restores 60 HP
  - **Iron Sword** — permanently increases attack power
  - **Shield** — permanently increases defence
- Random item drops after each victory
- Items consumed after use

### 🏃 Escape
- Proper run mechanic — escape without the enemy getting a free hit
- Game ends cleanly on escape or death

---

## 🗂️ Project Structure

```
RPGGame/
└── src/
    ├── Main.java           # Entry point — sets up player, items, and round loop
    ├── Character.java      # Abstract base class for all characters
    ├── Player.java         # Extends Character — level, XP, inventory, crit, miss, Power Strike
    ├── Enemy.java          # Extends Character — XP reward, boss flag, special move
    ├── Item.java           # Item data and use() logic (potions, weapons, shields)
    ├── Inventory.java      # ArrayList-based inventory with add/remove/display
    └── BattleEngine.java   # Core battle loop — turn management, drops, win/lose
```

---

## ▶️ How to Run

**Requirements:** Java JDK 11 or above

1. Clone the repository:
   ```bash
   git clone https://github.com/abdulkid802-creator/JavaProjects.git
   ```

2. Navigate to the RPGGame src folder and compile:
   ```bash
   cd JavaProjects/RPGGame/src
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
- **Boolean return types** — `attack()` returns hit/miss result for counter-attack logic
- **ArrayLists** — dynamic inventory management
- **Scanner** — reading user input from the console
- **Random** — critical hits, misses, and item drops
- **`Math.max()` / `Math.min()`** — clamping HP and damage values
- **Switch expressions** — clean menu handling
- **Modulo operator** — cycling enemy names and boss spawn timing

---

## 👤 Author

**Abdul Raqeeb Lafiaji**  
Computing Student @ TU Dublin  
[GitHub](https://github.com/abdulkid802-creator)
