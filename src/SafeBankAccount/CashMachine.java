package SafeBankAccount;

public class CashMachine {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(new Person("Seweryn", "Suwalski", 25, 12345678, 456), 8765.99);
        System.out.println(bankAccount.toString());

        bankAccount.deposit(3355.67);
        try {
            bankAccount.withdraw(11.99);
        } catch (IllegalArgumentException e) {
            System.out.println("Szanowni Państwo! Nie moga państwo wypłacić kwoty przekraczającej ilość dostępnych środków finansowych zgromadzonych na Pańśtwa koncie. Państwa rachunek nie posiada możliwości zadłużenia go.");
        } finally {
            System.out.println("Operacja zakończona. Dziękujemy za skorzystanie z naszych usług! Zapraszamy do skorzystania ponownie!");
        }

        BankAccount bankAccountTwo = new BankAccount(new Person("Anna", "Kowalska", 17, 2345, 56), 999);
        System.out.println(bankAccountTwo.toString());
    }
}
