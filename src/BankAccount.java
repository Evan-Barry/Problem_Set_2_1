import javax.swing.*;

public class BankAccount {

    private String accNum;
    private double balance;
    private Person customer;

    public void setAccNum(String accNum)
    {
        this.accNum = accNum;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setCustomer(Person customer)
    {
        this.customer = customer;
    }

    public String getAccNum()
    {
        return accNum;
    }

    public double getBalance()
    {
        return balance;
    }

    public Person getCustomer()
    {
        return customer;
    }

    public String toString()
    {
        return "Account Number: " + getAccNum() +
                "\nBalance: " + String.format("€%.2f",getBalance()) +
                "\nAccount Holder: " + getCustomer().getName();
    }

    public BankAccount(String accNum, double balance, Person customer)
    {
        setAccNum(accNum);
        setBalance(balance);
        setCustomer(customer);
    }

    public BankAccount()
    {
        this("0",0.0,new Person());
        /*Person p2 = new Person();
        this.setAccNum("0");
        this.setBalance(0.00);
        this.setCustomer(p2);
        //this("0", 0.00,p2); */
    }

    public void lodgeMoney(double lodgement)
    {
        setBalance(getBalance() + lodgement);

        JOptionPane.showMessageDialog(null, "Your balance is now: " + String.format("€%.2f",getBalance()));
    }

    public void withdrawMoney(double withdrawl)
    {
        setBalance(getBalance() - withdrawl);

        JOptionPane.showMessageDialog(null, "Your balance is now: " + String.format("€%.2f",getBalance()));
    }

}
