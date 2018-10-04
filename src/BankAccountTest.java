import javax.swing.*;

public class BankAccountTest {
    public static void main(String[] args) {

        Person p1 = new Person("Geraldine Corker");

        BankAccount b1 = new BankAccount("3245", 300, p1);

        JOptionPane.showMessageDialog(null, b1.toString());

        BankAccount b2 = new BankAccount();

        System.out.println(b2.toString());

        double lodgement = Double.parseDouble(JOptionPane.showInputDialog("How much would you like to lodge?"));

        b1.lodgeMoney(b1.getBalance(),lodgement);

        double withdrawl = Double.parseDouble(JOptionPane.showInputDialog("How much would you like to withdraw?"));

        b1.withdrawMoney(b1.getBalance(),withdrawl);
    }
}
