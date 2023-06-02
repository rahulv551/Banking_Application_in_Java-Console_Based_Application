# Banking_Application_in_Java-Console_Based_Application

The low-level design of the code :

1. Main Class (`banking_app`):
   - The `main` method serves as the entry point of the application.
   - It creates an instance of the `BankingApplication` class and calls its `start` method to begin the banking application.

2. `BankingApplication` Class:
   - Instance Variables:
     - `bank`: An instance of the `Bank` class to perform banking operations.
     - `scanner`: An instance of the `Scanner` class to read user input from the console.

   - Methods:
     - `start()`: Manages the flow of the banking application.
       - Displays the menu options to the user.
       - Reads the user's choice.
       - Executes the corresponding banking operation based on the choice.
       - Continues this process until the user chooses to exit.
       - Closes the scanner.

     - `displayMenu()`: Displays the available menu options to the user.

     - `getUserChoice()`: Reads and returns the user's choice from the console.

     - `getUserInput(String message)`: Displays the specified message and reads and returns a double value from the console.

     - `transferToAnotherBankAccount()`: Executes the logic to transfer money to another bank account. Placeholder method.

     - `transferToAnotherPersonAccount()`: Executes the logic to transfer money to another person's account. Placeholder method.

3. `Bank` Class:
   - Instance Variable:
     - `balance`: A double variable representing the account balance.

   - Methods:
     - `checkBalance()`: Displays the current account balance to the console.

     - `deposit(double amount)`: Adds the specified amount to the account balance.
       - Updates the balance variable.
       - Prints a success message.

     - `withdraw(double amount)`: Subtracts the specified amount from the account balance, if sufficient funds are available.
       - Checks if the balance is greater than or equal to the amount.
       - If true, subtracts the amount from the balance and prints a success message.
       - If false, displays an insufficient balance message.

The low-level design focuses on the responsibilities and interactions between different classes and their methods. It separates the concerns of user interface management (`BankingApplication`) and banking operations (`Bank`). The `Bank` class encapsulates the logic related to account balance and transactions, while the `BankingApplication` class handles user interactions and the flow of the banking application.

Placeholder methods (`transferToAnotherBankAccount` and `transferToAnotherPersonAccount`) are included in the `BankingApplication` class to represent the transfer functionality. They can be implemented according to the specific requirements of the application.