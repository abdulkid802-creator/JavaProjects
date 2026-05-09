# ⚔️ Java RPG Battle Game

A text-based, turn-based RPG built entirely from scratch in Java. Pick a class, fight through waves of scaling enemies, level up, collect loot, and survive brutal boss battles.

Built as a Java OOP learning project — every class, mechanic, and system designed and written by hand.

---

## 🎮 How to Play

At the start you enter your name and pick a class. Each class plays differently. From there it's round by round combat — attack, use items, unleash your special ability, or run. Enemies get harder every round and a boss spawns every 5 rounds.

---

## ⚔️ Player Classes

| Class | HP | Attack | Defence | Ability |
|---|---|---|---|---|
| Warrior | 150 | 18 | 8 | Shield Bash — damages + stuns + weakens enemy attack |
| Mage | 120 | 40 | 5 | Fireball — massive damage + burn (never misses) |
| Archer | 115 | 28 | 7 | Aimed Shot — guaranteed crit + poisons enemy |

---

## ✅ Features

### ⚔️ Combat
- Turn-based combat with Attack, Use Items, Special Ability, Run
- **Critical hits** — 1 in 10 chance to deal double damage
- **Miss mechanic** — chance to miss, triggering an enemy counter-attack
- **Special abilities** with cooldown system — each class has a unique ability
- Defence stat reduces all incoming damage
- Using items or failing ability cooldown doesn't waste your turn

### 👾 Enemies
- 10 unique enemy names cycling each round
- Stats scale with round number
- **Boss battles every 5 rounds** — higher stats and a special move every other turn
- Stun, poison, and burn status effects work on enemies

### 📊 Status Effects
- **Poison** — deals 5 damage per turn for 3 turns
- **Burn** — deals 8 damage and reduces defence per turn for 3 turns
- **Stun** — enemy skips their next attack

### 📈 Progression
- XP system with automatic level up every `level × 50` XP
- Stats increase on level up (attack +20, defence +6, max HP +35)
- Coin rewards from every enemy — used in the shop
- Full heal between rounds

### 🎒 Items
- 10+ item types including class-specific drops
- **Universal:** Health Potion, Elixir, Iron Sword, Shield
- **Warrior:** War Axe, Heavy Armour
- **Mage:** Spell Tome, Mana Crystal
- **Archer:** Poison Arrow, Speed Boots
- Use individual items or "Use All Stat Items" to apply all boosts at once
- Random enemy drops after each victory

### 🛒 Shop
- Opens after each round
- Universal items available to all classes
- Class-specific items tailored to your playstyle
- Spend coins earned from enemies

### 💾 Save/Load
- Game auto-saves after each round win
- Saves player name, level, XP, coins, HP, attack, defence, round and full inventory
- Load your save at the start of a new session to continue where you left off
- Items are fully restored on load — potions, weapons, class-specific items all saved

### 🏃 Escape
- Run from battle without taking a free hit
- Game ends cleanly on escape or death

---

## 🗂️ Project Structure

```
RPGGame/
└── src/
    ├── Main.java               # Entry point — name, class selection, round loop
    ├── Character.java          # Abstract base — shared fields, status effects
    ├── Player.java             # Abstract — shared player logic, attack, levelling
    ├── Warrior.java            # Extends Player — Shield Bash ability
    ├── Mage.java               # Extends Player — Fireball, never misses
    ├── Archer.java             # Extends Player — Aimed Shot, poison
    ├── Enemy.java              # Extends Character — boss flag, special move
    ├── Item.java               # Abstract base for all items
    ├── HealthPotion.java       # Heals 30 HP
    ├── Elixir.java             # Heals 60 HP
    ├── IronSword.java          # Attack +5
    ├── Shield.java             # Defence +3
    ├── WarAxe.java             # Attack +8 (Warrior)
    ├── HeavyArmour.java        # Defence +8 (Warrior)
    ├── SpellTome.java          # Attack +10 (Mage)
    ├── ManaCrystal.java        # Heal + Attack boost (Mage)
    ├── PoisonArrow.java        # Next attack poisons (Archer)
    ├── SpeedBoots.java         # Reduces cooldown (Archer)
    ├── Inventory.java          # ArrayList-based inventory
    ├── BattleEngine.java       # Turn loop, drops, win/lose logic
    ├── Shop.java               # Class-specific shop system
    └── SaveSystem.java         # File-based save and load
```

---

## ▶️ How to Run

**Requirements:** Java JDK 11 or above

1. Clone the repository:
   ```bash
   git clone https://github.com/abdulkid802-creator/JavaProjects.git
   ```

2. Navigate to the src folder and compile:
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

- **Abstract classes and methods** — `Character` and `Item` as enforced contracts
- **Inheritance** — `Player`, `Enemy`, and all item subclasses
- **Polymorphism** — `instanceof` checks for class-specific logic
- **Encapsulation** — `protected` fields, getters
- **Method overriding** with `@Override`
- **Boolean return types** — attack returns hit/miss for counter-attack logic
- **ArrayLists** — dynamic inventory with `removeIf`
- **File I/O** — `FileWriter` and `Scanner` for save/load
- **Scanner** — reading console input
- **Random** — crits, misses, drops
- **`Math.max()` / `Math.min()`** — clamping HP and damage
- **Switch expressions** — menu handling
- **Recursion** — `playerTurn()` calls itself on invalid actions
- **Modulo operator** — cycling enemy names and boss spawning

---

## 👤 Author

**Abdul** — Computing Student @ TU Dublin
[GitHub](https://github.com/abdulkid802-creator)
