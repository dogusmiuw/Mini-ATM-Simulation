public class User {
    private long id;
    private String pin;
    private String name;
    private String surname;
    private double balance;

    public User(long id, String pin, String name, String surname, double balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.surname = surname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", pin='" + getPin() + "'" +
            ", name='" + getName() + "'" +
            ", surname='" + getSurname() + "'" +
            ", balance='" + getBalance() + "'" +
            "}";
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
