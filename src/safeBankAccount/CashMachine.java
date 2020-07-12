package safeBankAccount;

public class CashMachine {
    public static void main(String[] args) {

        try{
            //BankAccount account1 = new BankAccount(null, 1000);
            Person person2 = new Person("Karol", "Nowak");
            BankAccount account2 = new BankAccount(person2, 1000);
            System.out.println(account2);
            account2.deposit(50);
            System.out.println(account2);
            account2.withdraw(1100);
            System.out.println(account2);
        }catch (NullPointerException e){
            System.err.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
}
