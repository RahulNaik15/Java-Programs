// Create a base class Account with attributes accountNumber and balance. Include methods deposit() and withdraw().
// Create two derived classes:
// SavingsAccount that adds an attribute interestRate and a method calculateInterest().
// CurrentAccount that adds an attribute overdraftLimit and overrides withdraw() to include overdraft functionality.
// Write a program to demonstrate the functionality of both derived classes.
import java.util.Scanner;

class Account{

    int accountNumber=12345;
    float balance=10000.0f;
    float amount;
    void deposit(){
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter amount to deposit=");
      amount=sc.nextFloat();
      balance=balance+amount;
      System.out.println("Amount after deposit=" +balance);
    }

    void withdraw(){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter amount to withdraw=");
      amount=sc.nextFloat();
      balance=balance-amount;
      System.out.println("Amount after withdraw=" +balance);
    }
}

class SavingsAccount extends Account{
    float interestRate=5.0f;
    float balance=super.balance;
   void calculateInterest(){

    float interset=balance*(interestRate/100);
    balance=balance+interset;
    System.out.println("Amount with interest=" +balance);
   }

}

public class Bank{

    public static void main(String args[]){
      
      SavingsAccount s=new SavingsAccount();
      s.deposit();
      s.withdraw();
      s.calculateInterest();

    }
}



