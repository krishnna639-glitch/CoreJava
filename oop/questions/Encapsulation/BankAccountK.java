class BankAccount {
    // 1. Private variables - hidden from direct outside access
    private String accountHolder;
    private double balance;

    // Constructor to initialize the object
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // 2. Getter Method - safe way to read the private balance
    public double getBalance() {
        return balance;
    }

    // 3. Setter Method - safe way to modify the private balance with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
}
public class BankAccountK {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alex", 500.00);

        // ❌ This would cause a compile error because 'balance' is private:
        // myAccount.balance = -10000; 

        //  Using the setter method to modify data safely
        myAccount.deposit(150.00); 

        //  Using the getter method to read data safely
        System.out.println("Current Balance: $" + myAccount.getBalance());
        
        // Output:
        // Successfully deposited: $150.0
        // Current Balance: $650.0
    }
}