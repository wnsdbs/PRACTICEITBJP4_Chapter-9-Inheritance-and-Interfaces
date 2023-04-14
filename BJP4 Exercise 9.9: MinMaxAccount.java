public class MinMaxAccount extends BankingAccount{
    private int min;
    private int max;
    
    public MinMaxAccount(Startup s){
        super(s);
        min = getBalance();
        max = getBalance();
    }    
    public void update() {
        int balance = getBalance();
        if (balance < min) {
            min = balance;
        } else if (balance > max) {
            max = balance;
        }
    }    
    public void credit(Credit c){
        super.credit(c);
        update();
    }    
    public void debit(Debit d){
        super.debit(d);
        update();
    }    
    public int getBalance(){
        return super.getBalance();
    }    
    public int getMin(){
        return min;
    }    
    public int getMax(){
        return max;
    }  
}
