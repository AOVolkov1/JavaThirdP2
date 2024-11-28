public class BmiService {
    public int calculate(double massa, double rost) {

        double bmi = massa / rost / rost;
        int calculate = (int) bmi;

        return calculate;
    }

}
