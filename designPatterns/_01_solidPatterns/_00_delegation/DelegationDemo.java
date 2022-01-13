package _00_delegation;

class RealPrinter{
    void print(){
        System.out.println("The Delegate");
    }
}

class Printer{
    // the delegator
    RealPrinter realprinter = new RealPrinter();

    // Create the delegate or assign the responsibility
    void print(){
        realprinter.print(); //delegation
    }
}

public class DelegationDemo {
    public static void main(String[] args) {
        // to the outside world it looks like Printer actually prints
        // it knows nothing about RealPrinter
        Printer printer = new Printer();
        printer.print();
    }
}
