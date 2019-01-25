package arsenkarapetyan.lesson_7;

public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem (String id, String desc, int qty, double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal (){
        return unitPrice * qty;
    }

    public String toString (){
        return "InvoiceItem: " + id + ", desc = " + desc + ", quantity = " + qty + ", unitPrice = " + unitPrice;
    }

    public static void main(String[] args) {
        InvoiceItem inv = new InvoiceItem ("4321", "item", 100, 15.0);
        System.out.println(inv.toString());
        System.out.println("Total: " + inv.getTotal());
    }
}
