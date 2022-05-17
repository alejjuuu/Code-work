package NJIT.HW8;

public class MonetaryCoin extends Coin {

    private int value;

    // constructor
    public MonetaryCoin(int cents) {
        super();
        this.value = cents;
    }

    // getter
    public int getCents() {
        return value;
    }

    // setter
    public void setCents(int cents) {
        this.value = cents;
    }

    // toString
    public String toString() {
        return value + " " + super.toString();
    }
}
