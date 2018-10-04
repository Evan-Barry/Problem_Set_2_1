import javax.swing.*;

public class BankAccountArrayTest {
    public static void main(String[] args) {

        BankAccount ba;
        BankAccount[] baArray = new BankAccount[5];


        for(int i = 0; i < baArray.length; i++)
        {
            ba = new BankAccount;
            ba.setBalance(Double.parseDouble(JOptionPane.showInputDialog("Enter balance")));
            ba.setAccNum("1" + i);

        }

        System.exit(0);

    }
}
