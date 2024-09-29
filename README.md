# ATM-MACHINE
This Java program simulates a simple ATM system that allows a user to check their account balance, withdraw money, and deposit money after entering a valid PIN.

## Key Features:
### PIN Verification:
The user is prompted to enter their PIN. If it matches the predefined PIN (893), they can proceed to the ATM menu.
### Menu Options:
Check Balance: Displays the current balance.
Withdraw Money: Allows the user to withdraw money if they have sufficient funds. If the amount exceeds the balance, an error message is shown.
Deposit Money: Allows the user to deposit money, which is added to the current balance.
Exit: Exits the ATM interface.
Scanner Input: The program uses the Scanner class to take input from the user (PIN and amounts for transactions).
The main method creates an Atm object and starts the process by calling the checkPIN method, which verifies the PIN and guides the user through the available options.
