public class BmiService {

    public int calculate(double h, int w) {
        double bmi = w / (h * h);
        return (int) bmi;
    }
}
