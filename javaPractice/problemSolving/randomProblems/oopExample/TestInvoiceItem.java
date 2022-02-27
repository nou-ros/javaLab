class InvoiceItem{
    private String ID;
    private String description;
    private int quantity;
    private double unitPrice;
   
    InvoiceItem(String ID, String description, int quantity, double unitPrice){
        this.ID = ID;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
   
    public String getID(){
        return ID;
    }
   
    public String getDescription(){
        return description;
    }
   
    public int getQuantity(){
        return quantity;
    }
   
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
   
    public double getUnitPrice(){
        return unitPrice;
    }
   
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
   
    public double getTotal(){
        return unitPrice * quantity;
    }
   
    public String toString(){
        return "InvoiceItem[id= " + ID + ", description = " + description + ", qty = " + quantity + ", unitPrice= " + unitPrice + " ]";
    }
}

public class TestInvoiceItem{
    public static void main(String args[]){
        InvoiceItem invObj = new InvoiceItem("A101", "Pen Red", 888, 0.08);
        System.out.println(invObj);
       
        //Test Setters and Getters
        invObj.setQuantity(999);
        invObj.setUnitPrice(0.99);
        System.out.println(invObj);
        System.out.println("Description is : " + invObj.getDescription());
        System.out.println("Quantity is : " + invObj.getQuantity());
        System.out.println("UnitPrice is: " + invObj.getUnitPrice());
        System.out.println("Total is : " + invObj.getTotal());
       
    }
}

