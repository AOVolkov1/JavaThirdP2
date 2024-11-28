public class BmiService {
    public int calculate(double weight, double height) {

        double bmi = weight / height / height;
        int calculate = (int) bmi;

        return calculate;
    }

}
