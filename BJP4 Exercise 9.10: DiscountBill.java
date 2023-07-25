public class DiscountBill extends GroceryBill
{
    private int itemsDiscounted;
    private double discounted;
    private boolean prefCustomer;
    
    public DiscountBill(Employee clerk, boolean preferred){
        super(clerk);
        itemsDiscounted = 0;
        discounted = 0.0;
        prefCustomer = preferred;
    }
    
    public void add(Item i){
        super.add(i);
        if (prefCustomer && i.getDiscount() > 0){
            itemsDiscounted++;
            discounted += i.getDiscount();
        }
     }
    
    public double getTotal(){
        return super.getTotal() - discounted;
    }
    
    public int getDiscountCount(){
        return itemsDiscounted;
    }
    
    public double getDiscountAmount(){
        return discounted;
    }
    
    public double getDiscountPercent(){
       return discounted * 100 / super.getTotal();
    ) 
}
