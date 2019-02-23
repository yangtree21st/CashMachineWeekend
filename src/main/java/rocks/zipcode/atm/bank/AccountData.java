package rocks.zipcode.atm.bank;

/**
 * @author ZipCodeWilmington
 */
public final class AccountData {

    private final int id;
    private final String name;
    private final String email;

    private final int balance;

    AccountData(int id, String name, String email, int balance) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account id: " + id + '\n' +
                "Name: " + name + '\n' +
                "Email: " + email + '\n' +
                "Balance: " + balance;
    }

    public String toStringMessage() {
        String printOut = "";
        if (balance < 0.0){
            printOut += "\n ACCOUNT IS OVERDRAWN BY " + (String.format("%.2f", -balance));
        }
        return printOut;
    }

    public String toStringAccountInfo() {
        return "Account id: " + id +
                " Name: " + name +
                " Email: " + email + '\n';
    }

    public String toStringBalance() {
        return "Balance: " + String.format("%.2f", balance);
    }
}


