import java.math.BigDecimal;

public class RewardValue {

    double cash;
    double miles;

    // Cash Constructor
    public RewardValue(double cash) {
            this.cash = cash;
            this.miles = (cash / 0.0035);
    }

    //Miles Constructor
    public RewardValue(BigDecimal miles){
        this.miles = miles.doubleValue();
        this.cash = (miles.doubleValue()*0.0035);
    }

    public double getMilesValue() {
        return miles;
    }

    public double getCashValue() {
        return cash;
    }
}
