public class Main {
    public static void main(String[] args) {

        Account alrajhibank = new Account();
        alrajhibank.getID("1234");
        alrajhibank.getName("Reem");
        alrajhibank.credit(2000);
        System.out.println(alrajhibank.getBalance());
        alrajhibank.debit(2000);
        System.out.println(alrajhibank.getBalance());

        Account yourAccount = new Account("1235", "Reem", 3000);
        System.out.println(yourAccount.getBalance());
        alrajhibank.transferTo(yourAccount, 10000);
        System.out.println(alrajhibank.getBalance());
        System.out.println(yourAccount.getBalance());

        System.out.println(alrajhibank.toString());
        System.out.println(yourAccount.toString());
    }}