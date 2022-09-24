public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Delete();
        customerManager.Update();

        FourTransactions fourTransactions = new FourTransactions();
        int result_1 = fourTransactions.Gather(9,5);
        int result_2 = fourTransactions.Extraction(30,3);
        int result_3 = fourTransactions.Impact(95,2);
        double result_4 = fourTransactions.Divide(9,3);

        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
    }
}