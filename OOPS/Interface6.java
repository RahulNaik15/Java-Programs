// Real-World Example:
// Define an interface BankAccount with methods deposit(double amount), withdraw(double amount), and getBalance(). 
// Implement this interface in SavingsAccount and CurrentAccount classes with appropriate logic.

import java.util.Scanner;

interface BankAccount{

    void deposit();
    void withdraw();
    void getBalance();
}

class SavingsAccount implements BankAccount{

   
   double balance=1000.0;

    public void deposit(){
        System.out.println("Enter the amount to deposit=");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        balance+=amount;
        System.out.println("Amount after deposit=" +balance);
    }

    public void withdraw(){
        System.out.println("Enter the amount to withdraw");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        balance-=amount;
        System.out.println("Amount after deposit=" +balance);
    }

    public void getBalance(){
     
     System.out.println("Your Balance=" +balance);

    }
}

public class Interface6{

    public static void main(String args[]){

        SavingsAccount obj=new SavingsAccount();
        obj.deposit();
        obj.withdraw();
        obj.getBalance();
    }
}