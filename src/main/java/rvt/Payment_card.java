package rvt;

// java-moc: 4-1
// Payment card uzdevums

public class Payment_card {
    private double balance;

    public static void main(String[] args) {
        Payment_card paulsCard = new Payment_card(20);
        Payment_card mattsCard = new Payment_card(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();
        System.out.println("Paul:" + paulsCard.toString());
        System.out.println("Matt:" + mattsCard.toString());
        paulsCard.addMoney(20);
        mattsCard.eatHeartily();
        System.out.println("Paul:" + paulsCard.toString());
        System.out.println("Matt:" + mattsCard.toString());
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        mattsCard.addMoney(50);
        System.out.println("Paul:" + paulsCard.toString());
        System.out.println("Matt:" + mattsCard.toString());

    }

    public Payment_card(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    public void eatAffordably() {
        if(balance - 2.6 > 0){
            balance = balance - 2.6;
        }
    }

    public void eatHeartily() {
        if(balance - 4.6 > 0){
            balance = balance - 4.6;
        }
    }
    public void addMoney(double amount) {
        if(amount >= 0){
        if (balance + amount > 150){
            balance = 150;
        }
        else{
            balance = balance + amount;}}

}
}
