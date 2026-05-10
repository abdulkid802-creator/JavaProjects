# 🏦 Bank Account Management System

A console-based bank account management system built in Java. Create and manage savings and current accounts, transfer money between accounts, and apply interest — all through a clean menu-driven interface.

Built as a Java OOP learning project focusing on inheritance, abstract classes, and polymorphism.

---

## 💻 How to Use

Run the program and choose from the menu. You can create multiple accounts, perform transactions, and view balances at any time.

---

## ✅ Features

### 🏧 Account Types
- **Savings Account** — cannot go below £0, earns 3% interest
- **Current Account** — supports overdraft up to £500

### 💰 Transactions
- Deposit money into any account
- Withdraw with account-type rules enforced automatically
- Transfer money between any two accounts
- Apply interest to savings accounts

### 📋 Account Management
- Create multiple savings and current accounts
- View a single account by account number
- View all accounts at once
- Clear error messages for invalid operations

---

## 🗂️ Project Structure

```
BankSystem/
└── src/
    ├── Main.java               # Entry point — menu loop
    ├── Account.java            # Abstract base class
    ├── SavingsAccount.java     # Extends Account — no overdraft, has interest
    ├── CurrentAccount.java     # Extends Account — overdraft up to £500
    └── Bank.java               # Manages accounts — add, find, transfer, print
```

---

## ▶️ How to Run

**Requirements:** Java JDK 11 or above

1. Clone the repository:
   ```bash
   git clone https://github.com/abdulkid802-creator/JavaProjects.git
   ```

2. Navigate to the BankSystem src folder and compile:
   ```bash
   cd JavaProjects/BankSystem/src
   javac *.java
   ```

3. Run the program:
   ```bash
   java Main
   ```

---

## 🧠 Java Concepts Practised

- **Abstract classes and methods** — `Account` as a base with enforced `withdraw()` override
- **Inheritance** — `SavingsAccount` and `CurrentAccount` extending `Account`
- **Polymorphism** — `instanceof` checks for interest application
- **Encapsulation** — fields and methods organised by responsibility
- **Method overriding** with `@Override`
- **ArrayLists** — dynamic list of accounts in `Bank`
- **Scanner** — reading user input from console
- **`Math` operations** — interest calculations and overdraft checks

---

## 👤 Author

**Abdul** — Computing Student @ TU Dublin
[GitHub](https://github.com/abdulkid802-creator)
