package rvt;

// java-moc: 5-2
// Overloaded Counter uzdevums

public class Overloaded_Counter {
    int startValue;

    public static void main(String[] args) {
        Overloaded_Counter a = new Overloaded_Counter();
        a.increase(10);
        a.increase(-5);
        a.decrease(2);
        a.decrease(-10);
        System.out.println(a);
    }


    public Overloaded_Counter(int startValue){
        this.startValue = startValue;
    }

    public Overloaded_Counter(){
        startValue = 0;
    }

    public int value(){
        return startValue;
    }

    public void increase(int increaseBy){
        if(increaseBy > 0){
            startValue += increaseBy;
        }

        
    }

    public void decrease(int decreaseBy){
        if(decreaseBy > 0){
            startValue -= decreaseBy;
        }

}
    public String toString() {  
        return "Counter value: " + startValue;
    }
}