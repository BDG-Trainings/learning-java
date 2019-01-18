package arsenkarapetyan.lesson_7;

public class Account {

    static String id;
    static String name;
    static int balance = 0;

    Account cust;

    public Account (String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account (String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance=balance;
    }

    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public int credit (int amount){
        balance = balance + amount;
        return balance;
    }

    public int debit (int amount){
        if (amount <= balance){
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo (Account another, int amount){
        if (amount <= balance){
            balance = balance - amount;
            cust = another;
            cust.credit(amount);
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }


    public static void main(String[] args) {

        Account cus1 = new Account("22","Arsen", 1000);
        System.out.println(cus1.transferTo(cus1, 500));
    }
}
