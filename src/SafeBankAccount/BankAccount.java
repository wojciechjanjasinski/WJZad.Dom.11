package SafeBankAccount;

public class BankAccount {
    Person person;
    private double actualAccountBalance;

    public BankAccount(Person person, double actualAccountBalance) {
        if (person == null) {
            throw new NullPointerException("Szanowni Państwo! Niepodanie danych osobowych właściciela konta uniemożliwi założenie konta w naszym banku.");
        }
        if (actualAccountBalance <= 0) {
            throw new IllegalArgumentException("Sanowni Państwo! Aby otworzyć konto w naszym banku muszą państwo wpłacić minimum 1 PLN");
        } else
            this.person = person;
        this.actualAccountBalance = actualAccountBalance;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getActualAccountBalance() {
        return actualAccountBalance;
    }

    public void setActualAccountBalance(double actualAccountBalance) {
        this.actualAccountBalance = actualAccountBalance;
    }

    public double deposit(double depositSum) {
        double afterDepositAccountBalance = getActualAccountBalance() + depositSum;
        System.out.println( "Oto kwota jaką chcą Państwo wpłacić na swoje konto w naszym banku: " + depositSum + " PLN");
        setActualAccountBalance(afterDepositAccountBalance);
        System.out.println( "Aktualny stan konta po wpłaceniu pieniędzy wynosi: " + getActualAccountBalance() + " PLN");
        return afterDepositAccountBalance;
    }

    public double withdraw(double withdrawSum) {
        double afterWithdrawAccountBalance = getActualAccountBalance() - withdrawSum;
        if (afterWithdrawAccountBalance <= 0) {
            throw new IllegalArgumentException("Szanowni Państwo! Państwo konto niestety nie jest kontem kredytowym. Nie moga państwo zadłużyć konta.");
        }
        System.out.println("Oto kwota jaką chcecie Państwo wypłacić z konta znjadującego się naszym banku: " + withdrawSum + " PLN");
        setActualAccountBalance(afterWithdrawAccountBalance);
        System.out.println("Aktualny stan konta po dokonaniu wypłaty wynosi: " + getActualAccountBalance() + " PLN");
        return afterWithdrawAccountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "person=" + person +
                ", actualAccountBalance=" + actualAccountBalance +
                '}';
    }
}
