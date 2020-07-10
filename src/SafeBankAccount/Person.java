package SafeBankAccount;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double pesel;
    private double bankClientNumber;

    public Person(String firstName, String lastName, int age, double pesel, double bankClientNumber) {
        if (age <= 18) {
            throw new IllegalArgumentException("Szanowni Państwo! W naszym banku konta moga otwierać jedynie osoby pełnoletnie.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        this.bankClientNumber = bankClientNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPesel() {
        return pesel;
    }

    public void setPesel(double pesel) {
        this.pesel = pesel;
    }

    public double getBankClientNumber() {
        return bankClientNumber;
    }

    public void setBankClientNumber(double bankClientNumber) {
        this.bankClientNumber = bankClientNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                ", bankClientNumber=" + bankClientNumber +
                '}';
    }
}
