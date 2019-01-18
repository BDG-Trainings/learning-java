package Classner;

class Account {
    private String id;
    private String name;
    private int balance=0;

    Account(String id, String name){
        this.id = id;
        this.name = name;
    }
    Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance =balance;
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
    public int credit(int amount){
        balance += amount;
        return balance;

    }
    public int debit(int amount){
        if(amount <= balance){
            balance = balance - amount;
        }else{
            System.out.print("Amount exeeded balance");
        } return balance;
    }
    public int transferTo(Account another, int amount){
        if(amount <= balance){
            another.credit(amount);
        }else{
            System.out.print("Amount exeeded balance");
        }return balance;
    }
    public String toString(){
        return "Account [id=" + id + ", name=" + name + ", balance= "+ balance +"]";
    }
    public static void main(String []args){
        Account account = new Account("ID1","ANUN1");
        System.out.print(account.toString());
    }
}
