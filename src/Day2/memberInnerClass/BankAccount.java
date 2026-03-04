package Day2.memberInnerClass;

public class BankAccount {
    private double balance=10000;
    //Member inner class
    class Transaction{
        void withdraw(double amount){
            if(amount<=balance){
                balance-=amount;
                System.out.println("Withdrawn: "+amount);
            }else{
                System.out.println("Insufficient Funds.");
            }
        }
        void deposit(double amount){
            balance+=amount;
            System.out.println("Balance: "+balance);
        }
    }

    public static void main(String[] args) {
        BankAccount a=new BankAccount();
        //Outer.Inner in_obj=out_obj.new Inner();
        BankAccount.Transaction tx=a.new Transaction();
        tx.withdraw(3000);
        tx.deposit(5000);
    }
}
/*
ℹ️Points to remember
💠Transaction belongs to specific account
💠Direct access to private variable balance
💠Clean Encapsulation
 */
