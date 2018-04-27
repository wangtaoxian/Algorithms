import edu.princeton.cs.algs4.*;

public class Transaction {
    private String who;
    private Date when;
    private double amount;

    public Transaction(String who, Date when, double amount) {
        this.who = who;
        this.when = when;
        this.amount = amount;
    }

    public Transaction(String transaction) {
        String[] str = transaction.split("\\s+");
        who = str[0];
        when = new Date(str[1]);
        amount = Double.parseDouble(str[2]);
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean equals(Object x) {
        if (this == x)
            return true;
        if (x == null)
            return false;
        if (this.getClass() != x.getClass())
            return false;
        Transaction that = (Transaction) x;
        if(!this.who.equals(that.who))
            return false;
        if(!this.when.equals(that.when))
            return false;
        if(this.amount != that.amount)
            return false;
        return true;
    }

    public String toString() {
        return String.format("%10s %10s %8.2f", who, when, amount);
    }

    //test client
    public static void main(String[] args) {
        Transaction trans1 = new Transaction("wang", new Date(9, 12, 1997), 11.11);
        Transaction trans2 = new Transaction("xiang 9/12/1997 13.21");
        StdOut.println("Transaction1 equals to Transaction2 is: " + trans1.equals(trans2));
    }

}
