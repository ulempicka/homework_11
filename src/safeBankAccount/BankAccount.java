package safeBankAccount;

public class BankAccount {
    Person person;
    double cash;

    public BankAccount(Person person, double cash) {
        if(person == null){
            throw new NullPointerException("Osoba nie moze byc nullem! Podaj osobę");
        }
        this.person = person;
        this.cash = cash;
    }

    void deposit(double payIn) {
        cash += payIn;
    }

    void withdraw(double payOut){
        if(payOut > cash){
            throw new IllegalArgumentException("Nie masz tyle na koncie!");
        }
        cash -= payOut;
    }

    @Override
    public String toString() {
        return "Person: " + person.getFirstName() + " " + person.getLastName()
                + ", BankAccount{" +
                "cash=" + cash +
                '}';
    }
}
