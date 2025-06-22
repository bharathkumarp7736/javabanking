package javabanking;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the account holder name :");
        String name = scan.nextLine();
        System.out.println("enter your account number :");
        long accnum = scan.nextLong();

        BankAccount b1 = new BankAccount(name,accnum);

        while(true){
            System.out.println("--menu--");
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3. balance");
            System.out.println("4. exit");
            System.out.println("enter your choice :");

            int choice=scan.nextInt();

            if(choice==1){
                System.out.println("enter amount to deposit :");
                double amount=scan.nextDouble();
                b1.deposit(amount);
            }

            else if(choice==2){
                System.out.println("enter amount to withdraw :");
                double amount=scan.nextDouble();
                b1.withdraw(amount);
            }

            else if(choice==3){
                System.out.println("account balance :");
                b1.checkbalance();
            }

            else if(choice==4){
                System.out.println("--thanks for using our bank--");
                break;
            }
            else{
                System.out.println("invalid number");
            }
        }
    }
}

