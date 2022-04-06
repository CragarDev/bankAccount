public class BankAccountTest {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("====== Starting BankAccountTest main ======");
        System.out.println("");

        BankAccount acc1 = new BankAccount();
        acc1.deposit("checking", 500);
        System.out.println("");

        acc1.deposit("savings", 1500);
        acc1.allBal();
        System.out.println("");

        acc1.withdraw("checking", 365);
        acc1.allBal();
        System.out.println("");

        acc1.withdraw("savings", 300);
        acc1.allBal();
        System.out.println("");

        BankAccount acc2 = new BankAccount();
        acc2.deposit("checking", 500);
        System.out.println("");
        acc2.deposit("savings", 1500);
        acc2.allBal();
        System.out.println("");
        acc2.withdraw("checking", 365);
        acc2.allBal();
        System.out.println("");
        acc2.withdraw("savings", 300);
        System.out.println("");
        acc2.allBal();

        System.out.println("");
        System.out.println("====== End BankAccountTest main ======");
        System.out.println("");
    }
}