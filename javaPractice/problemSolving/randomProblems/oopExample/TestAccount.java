class Account{
    private String ID;
    private String name;
    private int balance;
   
    Account(String ID, String name){
        this.ID = ID;
        this.name = name;
    }
   
    Account(String ID, String name, int balance){
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }
   
    public String getID(){
        return ID;
    }
   
    public String getName(){
        return name;
    }
   
    public int setBalance(int newBalance){
            balance = newBalance;
            return balance;
    }
   
    public int getBalance(){
        return balance;
    }
   
    public int credit(int amount){
        balance += amount;
        return balance;
    }
   
    public int debit(int amount){
        if(amount <= balance)
            balance -= amount;
        else
            System.out.println("Amount exceeded balance");
        return balance;
    }
   
    public int transferTo(Account acct, int amount){
        if(amount <= balance){
             balance -= amount;
             int toAcct = acct.getBalance() + amount;
             acct.setBalance(toAcct);
        }else{
            System.out.println("Amount exceeded balance");
        }
       
        return balance;
    }
   
    public String toString(){
        return "Account [id = " + ID + ", name= " + name + ", balance = " + balance + "]";
    }
}

public class TestAccount{
    public static void main(String args[]){
        Account a1 = new Account("A101", "John Doe", 88);
        System.out.println(a1);
        Account a2 = new Account("A102", "Alice");
        System.out.println(a2);
       
        //Test Getters
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance " + a1.getBalance());
       
        //Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
       
        //Test transfer
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}

