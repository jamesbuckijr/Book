import java.util.Date;

public class Account {
    //private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//SPECIAL FORMATTING
    private Date date = new Date();
    
    private static int id = 0;
    private double balance = 0.00;
    private double interestRate = 0;
    private String dateCreated = date.toString();
    
    //ACCESSOR AND MUTATOR METHOD
    private int getId() {
        return id;
    }
    private double getBalance() {
        return balance;
    }
    private void setBalance(double newBalance) {
        balance = newBalance;
        }
    private double getInterestRate() {
        return interestRate;
    }
    private void setInterestRate(double newInterestRate) {
        interestRate = newInterestRate;
    }
    private String getDateCreated() {
        return dateCreated;
    }
    
    //CONSTRUCTORS
    public Account() {
        int accountId = ++id;
    }
    public Account(double openingBalance, double initialInterestRate) {
        int accountId = ++id;
        balance = openingBalance;
        interestRate = initialInterestRate;
    }
    
    //PUBLIC METHODS FOR DESRIPTORS
    public double getMonthlyInterestRate() {
        return (interestRate / 12);
    }
    public void withdraw(double withdrawAmount) {
        balance -= withdrawAmount;
    }
    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}