# Banking_Application_in_Java-Console_Based_Application

High-Level Design (HLD) of the Banking Application:


1. Main Class (`banking_app`):
   - This class serves as the entry point of the application.
   - It creates an instance of the `BankingApplication` class and calls its `start` method to begin the banking application.

2. `BankingApplication` Class:
   - This class represents the core logic of the banking application.
   - It interacts with the user through the console, displaying a menu of options and accepting user input.
   - It uses a `Bank` object to perform banking operations such as checking balance, depositing, and withdrawing funds.
   - It also provides options to transfer money to another bank account or another person's account.
   - The `start` method runs a loop to continuously display the menu and process user choices until the user chooses to exit.

3. `Bank` Class:
   - This class encapsulates the bank's functionality.
   - It has a `balance` variable to keep track of the account balance.
   - It provides methods to check the balance, deposit funds, and withdraw funds.
   - The `checkBalance` method displays the current balance.
   - The `deposit` method adds the specified amount to the balance and prints a success message.
   - The `withdraw` method subtracts the specified amount from the balance if sufficient funds are available and prints a success message. Otherwise, it displays an insufficient balance message.

The code follows a modular and structured approach, with the `BankingApplication` class responsible for managing user interactions and the `Bank` class handling the banking operations. 
The separation of concerns and modularity enhances code maintainability and reusability.

