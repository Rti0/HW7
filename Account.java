public class Account {
    private String id;
    private String name;
    private int balance;

    public Account() {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID(String number) {
        return id;
    }

    public String getName(String reem) {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (balance > amount) {
            balance -= amount;
            return balance;
        } else {
            System.out.println("Unavailable!");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (balance > amount) {
            debit(amount);
            another.credit(amount);
            return balance;
        } else {
            System.out.println("transformation");
            return balance;
        }
    }


    public String toString() {
        return "Account1[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }}
