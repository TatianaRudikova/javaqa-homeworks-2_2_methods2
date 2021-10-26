public class BmiService {
    public double calculate(double mass, double height) {
        double heightSquared = height * height / 100 / 100;
        double massIndex = mass / heightSquared;
        return massIndex;
    }
}
