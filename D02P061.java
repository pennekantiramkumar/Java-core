package com.learning.core.day2session2;
/*public class D02P061 {
    int account_number;
    String name;
    String account_type;
    double balance;
   
    public int getAccount_number() {
        return account_number;
    }
   
    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }
   
    public String getName() {
        return name;
    }
   
    public void setName(String name) {
        this.name = name;
    }
   
    public String getAccount_type() {
        return account_type;
    }
   
    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }
   
    public double getBalance() {
       
        if( balance <1000)
        {
        try
        {   
            throw new NumberFormatException();
        }
        catch(NumberFormatException nw)
        {
            System.out.println("Balance is low"+balance);
        }
        }
       
       
        return balance;
       
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }//end setter and getter

    public  D02P061() {
       
        this.account_number = 100;
        this.name = "Ram";
        this.account_type = "Saving";
        this.balance = 500;
    }
   
   
   
   
    public  D02P061(int account_number, String name, String account_type,
            double balance) {
       
        this.account_number = account_number;
        this.name = name;
        this.account_type = account_type;
        this.balance = balance;
    }
    void deposit(double amt)
    {
        if(amt<0)
        {
            try
            {
                throw new NumberFormatException();
            }
            catch(NumberFormatException nf)
            {
                System.out.println("Negaive Amount cant be deposited");
            }
        }
        else
        {
            balance=getBalance()+amt;
            System.out.println("Current balance is ="+balance);
           
        }
       
       
       
    }
     public void withdraw(double amt){
         if(amt>1000)
            {
                try
                {
                    throw new NumberFormatException();
                }
                catch(NumberFormatException nf)
                {
                    System.out.println("WE CANT DEPOSITE AMOUNT INSUFFICENT BALANCE ");
                }
            }
            else
            {
                balance=getBalance()-amt;
                System.out.println("Current balance is ="+balance);
               
            }
       
       
       
       
       
    }
     void display()
     {
    System.out.println("Balance is ="+getBalance());   
     }
   
   
   
   
    public static void main(String[] args) {
       
       
        D02P061 bank=new D02P061();
        bank.deposit(2000);
        bank.display();
        bank.withdraw(500);
        bank.display();
        bank.withdraw(2000);
        bank.getBalance();
        bank.display();
       
       
       
    }
   
   
   
   
}*/
import java.util.Scanner;

class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class D02P061 {
    private int accNo;
    private String custName;
    private String accType;
    private double balance;

    // Constructor
    public D02P061(int accNo, String custName, String accType, double initialBalance) throws LowBalanceException, NegativeAmountException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (initialBalance < 0) {
            throw new NegativeAmountException("Initial balance cannot be negative.");
        }
        if ((accType.equals("Savings") && initialBalance < 1000) || (accType.equals("Current") && initialBalance < 5000)) {
            throw new LowBalanceException("Initial balance is below minimum required balance.");
        }
        this.balance = initialBalance;
    }

    // deposit method
    public void deposit(double amt) throws NegativeAmountException {
        if (amt < 0) {
            throw new NegativeAmountException("Amount cannot be negative.");
        }
        balance += amt;
    }

    // withdraw method
    public void withdraw(double amt) throws NegativeAmountException, LowBalanceException, InsufficientFundsException {
        if (amt < 0) {
            throw new NegativeAmountException("Amount cannot be negative.");
        }
        if ((accType.equals("Savings") && balance - amt < 1000) || (accType.equals("Current") && balance - amt < 5000)) {
            throw new LowBalanceException("Insufficient balance.");
        }
        if (balance - amt < 0) {
            throw new InsufficientFundsException("Insufficient funds.");
        }
        balance -= amt;
    }

    // getBalance method
    public double getBalance() throws LowBalanceException {
        if ((accType.equals("Savings") && balance < 1000) || (accType.equals("Current") && balance < 5000)) {
            throw new LowBalanceException("Low balance.");
        }
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter account number: ");
            int accNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Enter customer name: ");
            String custName = sc.nextLine();
            System.out.print("Enter account type (Savings/Current): ");
            String accType = sc.nextLine();
            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();

            D02P061 account = new D02P061(accNo, custName, accType, initialBalance);

            System.out.print("Enter amount to deposit: ");
            double depositAmt = sc.nextDouble();
            account.deposit(depositAmt);

            System.out.print("Enter amount to withdraw: ");
            double withdrawAmt = sc.nextDouble();
            account.withdraw(withdrawAmt);

            System.out.println("Current balance: " + account.getBalance());
        } catch (LowBalanceException | NegativeAmountException | InsufficientFundsException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}


