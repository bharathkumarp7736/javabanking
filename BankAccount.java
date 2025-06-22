package javabanking;
class BankAccount{
    String accountholdername;
    long accountnumber;
    double balance;

    BankAccount(String name,long accnum){
        this.accountholdername=name;
        this.accountnumber=accnum;
    }
        void deposit(double amount){
            balance=balance+amount;
            System.out.println("amount successfully deposited :" + amount);
        }
        void withdraw(double amount){
            if(amount<=balance){
                balance=balance-amount;
                System.out.println("amount withdraw successfuly :" + amount);
            }
            else{
                System.out.println("insufficient balance :" + balance);
            }
        }
        void checkbalance(){
                System.out.println("balance :" + balance);
            }
    }

